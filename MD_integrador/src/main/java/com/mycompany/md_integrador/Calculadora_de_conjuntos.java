package com.mycompany.md_integrador;

/**
 * @author Armando
 * @author ParamoH
 */
public class Calculadora_de_conjuntos extends javax.swing.JFrame {

    mUnion u = new mUnion();
    int count=1;

   Calculadora_de_conjuntos() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cA = new javax.swing.JTextField();
        cB = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        mU = new javax.swing.JButton();
        mI = new javax.swing.JButton();
        mC = new javax.swing.JButton();
        mD = new javax.swing.JButton();
        mDS = new javax.swing.JButton();
        Jlabel12 = new javax.swing.JLabel();
        cR = new javax.swing.JLabel();
        QtyA = new javax.swing.JButton();
        btnDb = new javax.swing.JButton();
        QtyB = new javax.swing.JButton();
        btnDa = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Calculadora de Conjuntos");

        jLabel2.setText("Conjunto A");

        cA.setToolTipText("");
        cA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cAActionPerformed(evt);
            }
        });

        jLabel3.setText("Conjunto B");

        jLabel4.setText("Resultado");

        mU.setText("Union");
        mU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mUActionPerformed(evt);
            }
        });

        mI.setText("Intersección");
        mI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mIActionPerformed(evt);
            }
        });

        mC.setText("Complemento");

        mD.setText("Diferencia");

        mDS.setText("Diferencia simetrica");
        mDS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mDSActionPerformed(evt);
            }
        });

        Jlabel12.setText("Selecciona una operacion");

        QtyA.setText("Qty Datos");
        QtyA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QtyAActionPerformed(evt);
            }
        });

        btnDb.setText("Datos");
        btnDb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDbActionPerformed(evt);
            }
        });

        QtyB.setText("Qty Datos");
        QtyB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QtyBActionPerformed(evt);
            }
        });

        btnDa.setText("Datos");
        btnDa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(mU)
                        .addGap(18, 18, 18)
                        .addComponent(mI, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mC)
                        .addGap(18, 18, 18)
                        .addComponent(mD)
                        .addGap(18, 18, 18)
                        .addComponent(mDS))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel4)
                        .addGap(162, 162, 162)
                        .addComponent(cR, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cB, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cA, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(QtyA)
                                .addGap(20, 20, 20)
                                .addComponent(btnDa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(QtyB)
                                .addGap(20, 20, 20)
                                .addComponent(btnDb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(22, 22, 22))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Jlabel12)
                .addGap(220, 220, 220))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cA, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(QtyA)
                    .addComponent(btnDa))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cB, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(QtyB)
                    .addComponent(btnDb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(Jlabel12)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mU)
                    .addComponent(mI)
                    .addComponent(mC)
                    .addComponent(mD)
                    .addComponent(mDS))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cR, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mUActionPerformed
        cR.setText("{" +u.unir()+"}"); 
    }//GEN-LAST:event_mUActionPerformed

    private void mIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mIActionPerformed

    private void mDSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mDSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mDSActionPerformed

    private void cAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cAActionPerformed

    private void btnDaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDaActionPerformed
        u.setCa(cA.getText(),count-1);
        cA.setText(null);
        cA.requestFocus();
        count++;

        if (count>u.getSizeA()){
            for(int i=1;i<=u.getSizeA();i++){
                cA.setText(cA.getText()+u.getCa(i-1)+";");
            }
            cA.setText("{"+cA.getText()+"}");
            count=1;
           btnDa.setEnabled(false);
        }
        else{
            btnDa.setText("Dato: "+count+" / "+u.getSizeA());
            }
    }//GEN-LAST:event_btnDaActionPerformed

    private void QtyAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QtyAActionPerformed
        u.ConjuntoCa(Integer.parseInt(cA.getText()));
        btnDa.setText("Dato: 1/"+u.getSizeA());
        cA.setText(null);
        cA.requestFocus();
        QtyA.setEnabled(false);
    }//GEN-LAST:event_QtyAActionPerformed

    private void QtyBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QtyBActionPerformed
        u.ConjuntoCb(Integer.parseInt(cB.getText()));
        btnDb.setText("Dato: 1 /"+u.getSizeB());
        cB.setText(null);
        cB.requestFocus();
        QtyB.setEnabled(false);
    }//GEN-LAST:event_QtyBActionPerformed

    private void btnDbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDbActionPerformed
       u.setCb(cB.getText(),count-1);
        cB.setText(null);
        cB.requestFocus();
        count++;

        if (count>u.getSizeB()){
            for(int i=1;i<=u.getSizeB();i++){
                cB.setText(cB.getText()+u.getCb(i-1)+";");
            }
            cB.setText("{"+cB.getText()+"}");
            count=1;
            btnDb.setEnabled(false);
        }
        else{
            btnDb.setText("Dato: "+count+" / "+u.getSizeB());

        }     
    }//GEN-LAST:event_btnDbActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora_de_conjuntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora_de_conjuntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora_de_conjuntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora_de_conjuntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora_de_conjuntos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jlabel12;
    private javax.swing.JButton QtyA;
    private javax.swing.JButton QtyB;
    private javax.swing.JButton btnDa;
    private javax.swing.JButton btnDb;
    private javax.swing.JTextField cA;
    private javax.swing.JTextField cB;
    private javax.swing.JLabel cR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mC;
    private javax.swing.JButton mD;
    private javax.swing.JButton mDS;
    private javax.swing.JButton mI;
    private javax.swing.JButton mU;
    // End of variables declaration//GEN-END:variables
}
