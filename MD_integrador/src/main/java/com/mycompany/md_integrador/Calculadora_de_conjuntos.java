package com.mycompany.md_integrador;

import javax.swing.JOptionPane;

/**
 * @author Armando
 * @author ParamoH
 */
public class Calculadora_de_conjuntos extends javax.swing.JFrame {

    public String[] splitA() {
        String[] aA = cA.getText().split(",");
        return aA;
    }

    public String[] splitB() {
        String[] aB = cB.getText().split(",");
        return aB;
    }

    operadores op = new operadores();

    Calculadora_de_conjuntos() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDialog1 = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cA = new javax.swing.JTextField();
        cB = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cR = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        Jlabel12 = new javax.swing.JLabel();
        mU = new javax.swing.JButton();
        mI = new javax.swing.JButton();
        mD = new javax.swing.JButton();
        mDS = new javax.swing.JButton();

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

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Lucida Console", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 0));
        jLabel1.setText("Calculadora de Conjuntos");

        jLabel2.setFont(new java.awt.Font("Lucida Console", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 0));
        jLabel2.setText("Conjunto A");

        cA.setFont(new java.awt.Font("Lucida Console", 0, 24)); // NOI18N
        cA.setToolTipText("Colocar comas ( , ) para separar elementos");
        cA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cAActionPerformed(evt);
            }
        });

        cB.setFont(new java.awt.Font("Lucida Console", 0, 24)); // NOI18N
        cB.setToolTipText("Colocar comas ( , ) para separar elementos");

        jLabel3.setFont(new java.awt.Font("Lucida Console", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 0));
        jLabel3.setText("Conjunto B");

        jLabel4.setFont(new java.awt.Font("Lucida Console", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 0));
        jLabel4.setText("Resultado");

        cR.setFont(new java.awt.Font("Lucida Console", 0, 24)); // NOI18N

        reset.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        reset.setForeground(new java.awt.Color(51, 255, 0));
        reset.setText("Limpiar");
        reset.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 255, 0), new java.awt.Color(51, 255, 0), null));
        reset.setContentAreaFilled(false);
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        Jlabel12.setFont(new java.awt.Font("Lucida Console", 0, 24)); // NOI18N
        Jlabel12.setForeground(new java.awt.Color(51, 255, 0));
        Jlabel12.setText("Selecciona una operación");

        mU.setFont(new java.awt.Font("Lucida Console", 0, 16)); // NOI18N
        mU.setForeground(new java.awt.Color(51, 255, 0));
        mU.setText("Union");
        mU.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 255, 0), new java.awt.Color(51, 255, 0), null));
        mU.setContentAreaFilled(false);
        mU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mUActionPerformed(evt);
            }
        });

        mI.setFont(new java.awt.Font("Lucida Console", 0, 16)); // NOI18N
        mI.setForeground(new java.awt.Color(51, 255, 0));
        mI.setText("Intersección");
        mI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 255, 0), new java.awt.Color(51, 255, 0), null));
        mI.setContentAreaFilled(false);
        mI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mIActionPerformed(evt);
            }
        });

        mD.setFont(new java.awt.Font("Lucida Console", 0, 16)); // NOI18N
        mD.setForeground(new java.awt.Color(51, 255, 0));
        mD.setText("Diferencia");
        mD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 255, 0), new java.awt.Color(51, 255, 0), null));
        mD.setContentAreaFilled(false);
        mD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mDActionPerformed(evt);
            }
        });

        mDS.setFont(new java.awt.Font("Lucida Console", 0, 16)); // NOI18N
        mDS.setForeground(new java.awt.Color(51, 255, 0));
        mDS.setText("Simetrica");
        mDS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 255, 0), null, new java.awt.Color(51, 255, 0)));
        mDS.setContentAreaFilled(false);
        mDS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mDSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cB, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cA, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(mU, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(mI, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(mD, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mDS, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(61, 61, 61)
                                .addComponent(cR, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(8, 8, 8)))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(530, 530, 530)
                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Jlabel12)
                        .addGap(181, 181, 181))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cA, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cB, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(Jlabel12)
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mU, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mI, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mDS, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(cR, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(58, 58, 58)))
                .addComponent(reset)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mUActionPerformed
        if (cA.getText().length() == 0 || cB.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Verificar llenado de los conjuntos", "Error en conjuntos", JOptionPane.ERROR_MESSAGE);
        } else 
            cR.setText("A U B = {" + op.unir(splitA(), splitB()) + "}");
    }//GEN-LAST:event_mUActionPerformed

    private void mIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mIActionPerformed
        if (cA.getText().length() == 0 || cB.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Verificar llenado de los conjuntos", "Error en conjuntos", JOptionPane.ERROR_MESSAGE);
        } else 
        cR.setText("A ∩ B  ó  B ∩ A = {" + op.interseccion(splitA(), splitB()) + "}");
    }//GEN-LAST:event_mIActionPerformed

    private void mDSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mDSActionPerformed
        if (cA.getText().length() == 0 || cB.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Verificar llenado de los conjuntos", "Error en conjuntos", JOptionPane.ERROR_MESSAGE);
        } else 
        cR.setText("A Δ B = {" + op.DiferenciaSimetrica(splitA(), splitB()) + "}");
    }//GEN-LAST:event_mDSActionPerformed

    private void mDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mDActionPerformed
        if (cA.getText().length() == 0 || cB.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Verificar llenado de los conjuntos", "Error en conjuntos", JOptionPane.ERROR_MESSAGE);
        } else 
        cR.setText("A-B = {" + op.DiferenciaA(splitA(), splitB())
                + "}          B-A = {" + op.DiferenciaB(splitA(), splitB()) + "}");
    }//GEN-LAST:event_mDActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        cA.setText("");
        cB.setText("");
        cR.setText("");
        cA.requestFocus();
    }//GEN-LAST:event_resetActionPerformed

    private void cAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cAActionPerformed

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
    private javax.swing.JTextField cA;
    private javax.swing.JTextField cB;
    private javax.swing.JLabel cR;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton mD;
    private javax.swing.JButton mDS;
    private javax.swing.JButton mI;
    private javax.swing.JButton mU;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables
}
