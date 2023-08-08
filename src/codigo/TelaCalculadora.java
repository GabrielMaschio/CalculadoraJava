package codigo;

public class TelaCalculadora extends javax.swing.JFrame {

    public TelaCalculadora() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    Double n1 = 0.0, n2 = 0.0;
    char opc;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TxtRes = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        BtnAC = new javax.swing.JButton();
        BtnLimpar = new javax.swing.JButton();
        BtnPorc = new javax.swing.JButton();
        BtnDiv = new javax.swing.JButton();
        Btn7 = new javax.swing.JButton();
        Btn8 = new javax.swing.JButton();
        Btn9 = new javax.swing.JButton();
        BtnMult = new javax.swing.JButton();
        Btn4 = new javax.swing.JButton();
        Btn5 = new javax.swing.JButton();
        Btn6 = new javax.swing.JButton();
        BtnSub = new javax.swing.JButton();
        Btn1 = new javax.swing.JButton();
        Btn2 = new javax.swing.JButton();
        Btn3 = new javax.swing.JButton();
        BtnSoma = new javax.swing.JButton();
        Btn0 = new javax.swing.JButton();
        BtnVirgula = new javax.swing.JButton();
        BtnFechar = new javax.swing.JButton();
        BtnCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");

        TxtRes.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TxtRes.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TxtRes.setText("0.00");
        TxtRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtResActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridLayout(5, 4));

        BtnAC.setText("AC");
        BtnAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnACActionPerformed(evt);
            }
        });
        jPanel1.add(BtnAC);

        BtnLimpar.setText("<-");
        BtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimparActionPerformed(evt);
            }
        });
        jPanel1.add(BtnLimpar);

        BtnPorc.setText("%");
        BtnPorc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPorcActionPerformed(evt);
            }
        });
        jPanel1.add(BtnPorc);

        BtnDiv.setText("/");
        BtnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDivActionPerformed(evt);
            }
        });
        jPanel1.add(BtnDiv);

        Btn7.setText("7");
        Btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn7ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn7);

        Btn8.setText("8");
        Btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn8ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn8);

        Btn9.setText("9");
        Btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn9ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn9);

        BtnMult.setText("*");
        BtnMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMultActionPerformed(evt);
            }
        });
        jPanel1.add(BtnMult);

        Btn4.setText("4");
        Btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn4ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn4);

        Btn5.setText("5");
        Btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn5ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn5);

        Btn6.setText("6");
        Btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn6ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn6);

        BtnSub.setText("-");
        BtnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSubActionPerformed(evt);
            }
        });
        jPanel1.add(BtnSub);

        Btn1.setText("1");
        Btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn1);

        Btn2.setText("2");
        Btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn2);

        Btn3.setText("3");
        Btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn3ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn3);

        BtnSoma.setText("+");
        BtnSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSomaActionPerformed(evt);
            }
        });
        jPanel1.add(BtnSoma);

        Btn0.setText("0");
        Btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn0ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn0);

        BtnVirgula.setText(",");
        BtnVirgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVirgulaActionPerformed(evt);
            }
        });
        jPanel1.add(BtnVirgula);

        BtnFechar.setText("Fechar");
        BtnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFecharActionPerformed(evt);
            }
        });
        jPanel1.add(BtnFechar);

        BtnCalcular.setText("=");
        BtnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(BtnCalcular);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                    .addComponent(TxtRes))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TxtRes, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimparActionPerformed
        if(TxtRes.getText().equals("0,00")){
        } else if(TxtRes.getText().equals("")){
            TxtRes.setText("0,00");
        }else {
            TxtRes.setText(TxtRes.getText().substring(0, TxtRes.getText().length() - 1));
        }
    }//GEN-LAST:event_BtnLimparActionPerformed

    private void TxtResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtResActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtResActionPerformed

    private void Btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn7ActionPerformed
        digitacao("7");
    }//GEN-LAST:event_Btn7ActionPerformed

    private void Btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn9ActionPerformed
        digitacao("9");
    }//GEN-LAST:event_Btn9ActionPerformed

    private void Btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn8ActionPerformed
        digitacao("8");
    }//GEN-LAST:event_Btn8ActionPerformed

    private void Btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn6ActionPerformed
        digitacao("6");
    }//GEN-LAST:event_Btn6ActionPerformed

    private void Btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn5ActionPerformed
        digitacao("5");
    }//GEN-LAST:event_Btn5ActionPerformed

    private void Btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn4ActionPerformed
        digitacao("4");
    }//GEN-LAST:event_Btn4ActionPerformed

    private void Btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn3ActionPerformed
        digitacao("3");
    }//GEN-LAST:event_Btn3ActionPerformed

    private void Btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn2ActionPerformed
        digitacao("2");
    }//GEN-LAST:event_Btn2ActionPerformed

    private void Btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn1ActionPerformed
        digitacao("1");
    }//GEN-LAST:event_Btn1ActionPerformed

    private void BtnACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnACActionPerformed
        TxtRes.setText("0.00");
    }//GEN-LAST:event_BtnACActionPerformed

    private void BtnVirgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVirgulaActionPerformed
        if(TxtRes.getText().equals("0.00") || TxtRes.getText().equals("ERROR")){
            TxtRes.setText("0.00");
            
        } else {
            digitacao(".");
        }
    }//GEN-LAST:event_BtnVirgulaActionPerformed

    private void BtnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDivActionPerformed
        ler();
        opc = '/';
    }//GEN-LAST:event_BtnDivActionPerformed

    private void BtnMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMultActionPerformed
        ler();
        opc = '*';
    }//GEN-LAST:event_BtnMultActionPerformed

    private void BtnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSubActionPerformed
        ler();
        opc = '-';
    }//GEN-LAST:event_BtnSubActionPerformed

    private void BtnSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSomaActionPerformed
        ler();
        opc = '+';
    }//GEN-LAST:event_BtnSomaActionPerformed

    private void BtnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalcularActionPerformed
        if(TxtRes.getText().equals("ERROR")){
            TxtRes.setText("ERROR");
        } else {
          n2 = Double.parseDouble(TxtRes.getText());  
        }
        
        String res = "ERROR";
        if(Double.toString(n2).equals("0.00")){
            if(n1 == 0.0 && n2 == 0.0){
                TxtRes.setText("ERROR");
            } else {
                switch (opc) {
                    case '/':
                        if((n1 == 0.0) || (n2 == 0.0)){
                            TxtRes.setText("ERROR");
                        } else {
                           res = Double.toString(n1 / n1); 
                        }
                        break;
                    case '*':
                        res = Double.toString(n1 * n1);
                        break;
                    case '-':
                        res = Double.toString(n1 - n1);
                        break;
                    case '+':
                        res = Double.toString(n1 + n1);
                        break;
                    default:
                        res = Double.toString(n1 * (n1/100));
                }
            }
        } else{
            if(n1 == 0.0 && n2 == 0.0){
                TxtRes.setText("ERROR");
            } else {
                switch (opc) {
                    case '/':
                        if((n1 == 0.0) || (n2 == 0.0)){
                            TxtRes.setText("ERROR");
                        } else {
                           res = Double.toString(n1 / n2); 
                        }
                        break;
                    case '*':
                        res = Double.toString(n1 * n2);
                        break;
                    case '-':
                        res = Double.toString(n1 - n2);
                        break;
                    case '+':
                        res = Double.toString(n1 + n2);
                        break;
                    default:
                        res = Double.toString(n1 * (n2/100));
                }
            }
        }
        
        TxtRes.setText(res);
    }//GEN-LAST:event_BtnCalcularActionPerformed

    private void BtnPorcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPorcActionPerformed
        ler();
        opc = '%';
    }//GEN-LAST:event_BtnPorcActionPerformed

    private void Btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn0ActionPerformed
        digitacao("0");
    }//GEN-LAST:event_Btn0ActionPerformed

    private void BtnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnFecharActionPerformed
    
    private void digitacao(String caracter){
        if(TxtRes.getText().equals("0.00") || TxtRes.getText().equals("ERROR")){
            TxtRes.setText(caracter);
        } else {
            TxtRes.setText(TxtRes.getText().concat(caracter));
        }
    }
    
    private void ler(){
        if(TxtRes.getText().equals("ERROR")){
            TxtRes.setText("ERROR");
        } else {
          n1 = Double.parseDouble(TxtRes.getText()); 
          TxtRes.setText("0.00");
        }
    }
    
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
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn0;
    private javax.swing.JButton Btn1;
    private javax.swing.JButton Btn2;
    private javax.swing.JButton Btn3;
    private javax.swing.JButton Btn4;
    private javax.swing.JButton Btn5;
    private javax.swing.JButton Btn6;
    private javax.swing.JButton Btn7;
    private javax.swing.JButton Btn8;
    private javax.swing.JButton Btn9;
    private javax.swing.JButton BtnAC;
    private javax.swing.JButton BtnCalcular;
    private javax.swing.JButton BtnDiv;
    private javax.swing.JButton BtnFechar;
    private javax.swing.JButton BtnLimpar;
    private javax.swing.JButton BtnMult;
    private javax.swing.JButton BtnPorc;
    private javax.swing.JButton BtnSoma;
    private javax.swing.JButton BtnSub;
    private javax.swing.JButton BtnVirgula;
    private javax.swing.JTextField TxtRes;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
