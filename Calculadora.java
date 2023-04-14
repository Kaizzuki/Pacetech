
import java.util.Set;


public class Calculadora extends javax.swing.JFrame {

  float numero1;
  float numero2;
  float resposta;
  char operador;
  
    
    public Calculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Display = new javax.swing.JLabel();
        Num1 = new javax.swing.JButton();
        Num2 = new javax.swing.JButton();
        num3 = new javax.swing.JButton();
        Num4 = new javax.swing.JButton();
        Num5 = new javax.swing.JButton();
        Num6 = new javax.swing.JButton();
        Num7 = new javax.swing.JButton();
        Num8 = new javax.swing.JButton();
        Num9 = new javax.swing.JButton();
        Num0 = new javax.swing.JButton();
        Mais = new javax.swing.JButton();
        Menos = new javax.swing.JButton();
        Div = new javax.swing.JButton();
        Vezes = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        Limpar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Display.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Display.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Num1.setText("1");
        Num1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Num1MouseClicked(evt);
            }
        });

        Num2.setText("2");
        Num2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Num2MouseClicked(evt);
            }
        });

        num3.setText("3");
        num3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num3MouseClicked(evt);
            }
        });

        Num4.setText("4");
        Num4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Num4MouseClicked(evt);
            }
        });

        Num5.setText("5");
        Num5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Num5MouseClicked(evt);
            }
        });

        Num6.setText("6");
        Num6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Num6MouseClicked(evt);
            }
        });

        Num7.setText("7");
        Num7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Num7MouseClicked(evt);
            }
        });

        Num8.setText("8");
        Num8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Num8MouseClicked(evt);
            }
        });

        Num9.setText("9");
        Num9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Num9MouseClicked(evt);
            }
        });

        Num0.setText("0");
        Num0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Num0MouseClicked(evt);
            }
        });

        Mais.setText("+");
        Mais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MaisMouseClicked(evt);
            }
        });

        Menos.setText("-");
        Menos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenosMouseClicked(evt);
            }
        });

        Div.setText("/");
        Div.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DivMouseClicked(evt);
            }
        });

        Vezes.setText("X");
        Vezes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VezesMouseClicked(evt);
            }
        });

        igual.setText("=");
        igual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                igualMouseClicked(evt);
            }
        });

        Limpar.setText("Limpar");
        Limpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LimparMouseClicked(evt);
            }
        });

        jLabel1.setText("calculadora");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Limpar)
                        .addComponent(Display, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Num1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Num2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(num3))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Num4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Num5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Num6))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(Num7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Num8))
                                        .addComponent(Num0))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(igual)
                                        .addComponent(Num9))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Mais, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Menos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Div, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Vezes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Display, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(Limpar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Num1)
                    .addComponent(Num2)
                    .addComponent(num3)
                    .addComponent(Mais))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Num4)
                    .addComponent(Num5)
                    .addComponent(Num6)
                    .addComponent(Menos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Num7)
                    .addComponent(Num8)
                    .addComponent(Num9)
                    .addComponent(Div))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Num0)
                    .addComponent(igual)
                    .addComponent(Vezes))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Num1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Num1MouseClicked
   
    Display.setText(Display.getText() + "1");        
        
    }//GEN-LAST:event_Num1MouseClicked

    private void Num2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Num2MouseClicked
    Display.setText(Display.getText() + "2");      
        
    }//GEN-LAST:event_Num2MouseClicked

    private void MaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaisMouseClicked
    numero1 = Float.valueOf(Display.getText());
    operador = '+';
    Display.setText("");
    
    
    }//GEN-LAST:event_MaisMouseClicked

    private void igualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_igualMouseClicked
    numero2 = Float.valueOf(Display.getText());
        if (operador == '+') {
            resposta = numero1 + numero2;
            Display.setText(String.valueOf(resposta));
        }
        if (operador == '-'){
            resposta = numero1 - numero2;
            Display.setText(String.valueOf(resposta));
        }
        if (operador == '/') {
            resposta = numero1 / numero2;
            Display.setText(String.valueOf(resposta));
        }
        if (operador == 'x') {
            resposta = numero1 * numero2;
            Display.setText(String.valueOf(resposta));
        }
           
      
    }//GEN-LAST:event_igualMouseClicked

    private void num3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num3MouseClicked
    Display.setText(Display.getText() + "3");     

    }//GEN-LAST:event_num3MouseClicked

    private void Num4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Num4MouseClicked
    Display.setText(Display.getText() + "4");     
    }//GEN-LAST:event_Num4MouseClicked

    private void Num5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Num5MouseClicked
    Display.setText(Display.getText() + "5");      
    }//GEN-LAST:event_Num5MouseClicked

    private void Num6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Num6MouseClicked
    Display.setText(Display.getText() + "6");
    }//GEN-LAST:event_Num6MouseClicked

    private void Num7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Num7MouseClicked
    Display.setText(Display.getText() + "7");
    }//GEN-LAST:event_Num7MouseClicked

    private void Num8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Num8MouseClicked
    Display.setText(Display.getText() + "8");
    }//GEN-LAST:event_Num8MouseClicked

    private void Num9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Num9MouseClicked
    Display.setText(Display.getText() + "9");
    }//GEN-LAST:event_Num9MouseClicked

    private void Num0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Num0MouseClicked
    Display.setText(Display.getText() + "0");
    }//GEN-LAST:event_Num0MouseClicked

    private void MenosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenosMouseClicked
      numero1 = Float.valueOf(Display.getText());
    operador = '-';
    Display.setText("");
    }//GEN-LAST:event_MenosMouseClicked

    private void DivMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DivMouseClicked
    numero1 = Float.valueOf(Display.getText());
    operador = '/';
    Display.setText("");
    }//GEN-LAST:event_DivMouseClicked

    private void VezesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VezesMouseClicked
    numero1 = Float.valueOf(Display.getText());
    operador = 'x';
    Display.setText("");
    }//GEN-LAST:event_VezesMouseClicked

    private void LimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LimparMouseClicked
    Display.setText("");
    numero1 = 0;
    numero2 = 0;
    
    }//GEN-LAST:event_LimparMouseClicked

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Display;
    private javax.swing.JButton Div;
    private javax.swing.JButton Limpar;
    private javax.swing.JButton Mais;
    private javax.swing.JButton Menos;
    private javax.swing.JButton Num0;
    private javax.swing.JButton Num1;
    private javax.swing.JButton Num2;
    private javax.swing.JButton Num4;
    private javax.swing.JButton Num5;
    private javax.swing.JButton Num6;
    private javax.swing.JButton Num7;
    private javax.swing.JButton Num8;
    private javax.swing.JButton Num9;
    private javax.swing.JButton Vezes;
    private javax.swing.JButton igual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton num3;
    // End of variables declaration//GEN-END:variables
}
