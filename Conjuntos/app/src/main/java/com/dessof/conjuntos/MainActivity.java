package com.dessof.conjuntos;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.github.florent37.viewtooltip.ViewTooltip;
import com.github.johnpersano.supertoasts.library.Style;
import com.github.johnpersano.supertoasts.library.SuperActivityToast;

public class MainActivity<cR> extends AppCompatActivity {
    private EditText conjuntoA;
    private EditText conjuntoB;
    private TextView conjuntoR;


    // Metodos Split
    public String[] splitA() {
        String[] aA = conjuntoA.getText().toString().split(",");
        return aA;
    }
    public String[] splitB() {
        String[] aB = conjuntoB.getText().toString().split(",");
        return aB;
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // toolTips




        operadores op = new operadores();
        conjuntoA = (EditText) findViewById(R.id.cA);
        conjuntoB = (EditText) findViewById(R.id.cB);
        conjuntoR = (TextView) findViewById(R.id.cR);

        ViewTooltip
                .on(this, conjuntoB)
                .autoHide(true, 4000)
                .corner(30)
                .position(ViewTooltip.Position.BOTTOM)
                .text("Colocar ( , ) para separar elementos")
                .show();

     // Boton limpiar
     Button btnClean = (Button) findViewById(R.id.clean);


     btnClean.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             conjuntoA.setText("");
             conjuntoB.setText("");
             conjuntoR.setText("");
             conjuntoA.requestFocus();

             ViewTooltip
                     .on(MainActivity.this, conjuntoB)
                     .autoHide(true, 4000)
                     .corner(30)
                     .position(ViewTooltip.Position.BOTTOM)
                     .text("Colocar ( , ) para separar elementos")
                     .show();
         }
     });


    // Metodo Unir
        Button btnmU = (Button) findViewById(R.id.mU);
        btnmU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (conjuntoA.getText().length() == 0 || conjuntoB.getText().length() == 0) {
                    Toast.makeText(MainActivity.this,"Verificar llenado de los conjuntos",Toast.LENGTH_LONG).show();


                } else
                    conjuntoR.setText("A U B = {" + op.unir(splitA(), splitB()) + "}");

            }
        });

        // Metodo Interseccion
       Button btnmI = (Button) findViewById(R.id.mI);

        btnmI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (conjuntoA.getText().length() == 0 || conjuntoB.getText().length() == 0) {
                    Toast.makeText(MainActivity.this,"Verificar llenado de los conjuntos",Toast.LENGTH_LONG).show();
                } else
                    conjuntoR.setText("A ∩ B  ó  B ∩ A = {" + op.interseccion(splitA(), splitB()) + "}");
            }
        });

        // Metodo Diferencia
         Button btnmD = (Button) findViewById(R.id.mD);
          btnmD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (conjuntoA.getText().length() == 0 || conjuntoB.getText().length() == 0) {
                    Toast.makeText(MainActivity.this,"Verificar llenado de los conjuntos",Toast.LENGTH_LONG).show();
                } else
                    conjuntoR.setText("A-B = {" + op.DiferenciaA(splitA(), splitB()) + "} \n B-A = {" + op.DiferenciaB(splitA(), splitB()) + "}");

            }
        });

        // Metodo Diferencia Simetrica

       Button  btnmDs = (Button) findViewById(R.id.mDs);

        btnmDs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (conjuntoA.getText().length() == 0 || conjuntoB.getText().length() == 0) {
                    Toast.makeText(MainActivity.this, "Verificar llenado de los conjuntos", Toast.LENGTH_LONG).show();
                } else
                    conjuntoR.setText("A Δ B = {" + op.DiferenciaSimetrica(splitA(), splitB()) + "}");

            }

        });

        SuperActivityToast.create(this, new Style(), Style.TYPE_BUTTON)
                .setText("By Héctor Páramo ft Armando Moran")
                .setDuration(Style.DURATION_LONG)
                .setColor(getColor(R.color.accent))
                .setTextColor(getColor(R.color.black))
                .setAnimations(Style.ANIMATIONS_FLY).show();
    }






}
