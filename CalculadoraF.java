package ProjetoFinal;

public class CalculadoraF extends javax.swing.JFrame {

    public CalculadoraF() {
        initComponents();
    }
    Double valor1, valor2;
    String operacoes;
    Calculadora calculadora = new Calculadora();

    private void print(String texto) {
        ct_tela.setText(texto);
    }

    private void print1(String texto) {
        ct_tela1.setText(texto);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        ct_tela1 = new javax.swing.JTextField();
        ct_tela = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        bt_soma = new javax.swing.JButton();
        bt_4 = new javax.swing.JButton();
        bt_0 = new javax.swing.JButton();
        bt_6 = new javax.swing.JButton();
        bt_sub = new javax.swing.JButton();
        bt_divi = new javax.swing.JButton();
        bt_9 = new javax.swing.JButton();
        bt_mult = new javax.swing.JButton();
        bt_porcentagem = new javax.swing.JButton();
        bt_3 = new javax.swing.JButton();
        bt_2 = new javax.swing.JButton();
        bt_8 = new javax.swing.JButton();
        bt_1 = new javax.swing.JButton();
        bt_ponto = new javax.swing.JButton();
        bt_igual = new javax.swing.JButton();
        bt_apagar = new javax.swing.JButton();
        bt_5 = new javax.swing.JButton();
        bt_7 = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 255));

        jPanel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        ct_tela1.setBackground(new java.awt.Color(204, 204, 204));
        ct_tela1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        ct_tela1.setForeground(new java.awt.Color(255, 0, 51));
        ct_tela1.setText("");
        ct_tela1.setBorder(null);

        ct_tela.setBackground(new java.awt.Color(204, 204, 204));
        ct_tela.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        ct_tela.setForeground(new java.awt.Color(255, 0, 51));
        ct_tela.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ct_tela, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
                    .addComponent(ct_tela1))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ct_tela, ct_tela1});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ct_tela1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ct_tela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ct_tela, ct_tela1});

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        bt_soma.setBackground(new java.awt.Color(255, 255, 255));
        bt_soma.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        bt_soma.setForeground(new java.awt.Color(204, 0, 0));
        bt_soma.setText("+");
        bt_soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_somaActionPerformed(evt);
            }
        });

        bt_4.setBackground(new java.awt.Color(255, 255, 255));
        bt_4.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        bt_4.setForeground(new java.awt.Color(204, 0, 0));
        bt_4.setText("4");
        bt_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_4ActionPerformed(evt);
            }
        });

        bt_0.setBackground(new java.awt.Color(255, 255, 255));
        bt_0.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        bt_0.setForeground(new java.awt.Color(204, 0, 0));
        bt_0.setText("0");
        bt_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_0ActionPerformed(evt);
            }
        });

        bt_6.setBackground(new java.awt.Color(255, 255, 255));
        bt_6.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        bt_6.setForeground(new java.awt.Color(204, 0, 0));
        bt_6.setText("6");
        bt_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_6ActionPerformed(evt);
            }
        });

        bt_sub.setBackground(new java.awt.Color(255, 255, 255));
        bt_sub.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        bt_sub.setForeground(new java.awt.Color(204, 0, 0));
        bt_sub.setText("-");
        bt_sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_subActionPerformed(evt);
            }
        });

        bt_divi.setBackground(new java.awt.Color(255, 255, 255));
        bt_divi.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        bt_divi.setForeground(new java.awt.Color(204, 0, 0));
        bt_divi.setText("/");
        bt_divi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_diviActionPerformed(evt);
            }
        });

        bt_9.setBackground(new java.awt.Color(255, 255, 255));
        bt_9.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        bt_9.setForeground(new java.awt.Color(204, 0, 0));
        bt_9.setText("9");
        bt_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_9ActionPerformed(evt);
            }
        });

        bt_mult.setBackground(new java.awt.Color(255, 255, 255));
        bt_mult.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        bt_mult.setForeground(new java.awt.Color(204, 0, 0));
        bt_mult.setText("X");
        bt_mult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_multActionPerformed(evt);
            }
        });

        bt_porcentagem.setBackground(new java.awt.Color(255, 255, 255));
        bt_porcentagem.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        bt_porcentagem.setForeground(new java.awt.Color(204, 0, 0));
        bt_porcentagem.setText("%");
        bt_porcentagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_porcentagemActionPerformed(evt);
            }
        });

        bt_3.setBackground(new java.awt.Color(255, 255, 255));
        bt_3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        bt_3.setForeground(new java.awt.Color(204, 0, 0));
        bt_3.setText("3");
        bt_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_3ActionPerformed(evt);
            }
        });

        bt_2.setBackground(new java.awt.Color(255, 255, 255));
        bt_2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        bt_2.setForeground(new java.awt.Color(204, 0, 0));
        bt_2.setText("2");
        bt_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_2ActionPerformed(evt);
            }
        });

        bt_8.setBackground(new java.awt.Color(255, 255, 255));
        bt_8.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        bt_8.setForeground(new java.awt.Color(204, 0, 0));
        bt_8.setText("8");
        bt_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_8ActionPerformed(evt);
            }
        });

        bt_1.setBackground(new java.awt.Color(255, 255, 255));
        bt_1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        bt_1.setForeground(new java.awt.Color(204, 0, 0));
        bt_1.setText("1");
        bt_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_1ActionPerformed(evt);
            }
        });

        bt_ponto.setBackground(new java.awt.Color(255, 255, 255));
        bt_ponto.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        bt_ponto.setForeground(new java.awt.Color(204, 0, 0));
        bt_ponto.setText(".");
        bt_ponto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_pontoActionPerformed(evt);
            }
        });

        bt_igual.setBackground(new java.awt.Color(255, 255, 255));
        bt_igual.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        bt_igual.setForeground(new java.awt.Color(204, 0, 0));
        bt_igual.setText("=");
        bt_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_igualActionPerformed(evt);
            }
        });

        bt_apagar.setBackground(new java.awt.Color(255, 255, 255));
        bt_apagar.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        bt_apagar.setForeground(new java.awt.Color(204, 0, 0));
        bt_apagar.setText("AC");
        bt_apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_apagarActionPerformed(evt);
            }
        });

        bt_5.setBackground(new java.awt.Color(255, 255, 255));
        bt_5.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        bt_5.setForeground(new java.awt.Color(204, 0, 0));
        bt_5.setText("5");
        bt_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_5ActionPerformed(evt);
            }
        });

        bt_7.setBackground(new java.awt.Color(255, 255, 255));
        bt_7.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        bt_7.setForeground(new java.awt.Color(204, 0, 0));
        bt_7.setText("7");
        bt_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(bt_ponto, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(160, 160, 160)
                            .addComponent(bt_0, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(160, 160, 160)
                            .addComponent(bt_igual, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(bt_1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(160, 160, 160)
                            .addComponent(bt_2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(160, 160, 160)
                            .addComponent(bt_3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(bt_apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(160, 160, 160)
                            .addComponent(bt_porcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(160, 160, 160)
                            .addComponent(bt_divi, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(bt_4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(160, 160, 160)
                                    .addComponent(bt_5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(160, 160, 160)
                                    .addComponent(bt_6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(bt_7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(160, 160, 160)
                                    .addComponent(bt_8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(160, 160, 160)
                                    .addComponent(bt_9, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(bt_soma, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(160, 160, 160)
                                .addComponent(bt_sub, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(160, 160, 160)
                                .addComponent(bt_mult, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_porcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_divi, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_soma, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_sub, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_mult, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_ponto, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_0, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_igual, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_1ActionPerformed
        //Botão 1
        print(ct_tela.getText() + "1");
    }//GEN-LAST:event_bt_1ActionPerformed

    private void bt_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_0ActionPerformed
        //Botão zero
        print(ct_tela.getText() + "0");
    }//GEN-LAST:event_bt_0ActionPerformed

    private void bt_somaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_somaActionPerformed
        // Botão soma 
        valor1 = Double.parseDouble(ct_tela.getText());//Armazena valor1
        print("");
        operacoes = "soma";
    }//GEN-LAST:event_bt_somaActionPerformed

    private void bt_subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_subActionPerformed
        // Botão subtração 
        valor1 = Double.parseDouble(ct_tela.getText());//Armazena valor1
        print1(valor1 + " - ");
        print("");
        operacoes = "subtração";
    }//GEN-LAST:event_bt_subActionPerformed

    private void bt_diviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_diviActionPerformed
        // Botão divisão 
        valor1 = Double.parseDouble(ct_tela.getText());//Armazena valor1
        print1(valor1 + " / ");
        print("");
        operacoes = "divisão";
    }//GEN-LAST:event_bt_diviActionPerformed

    private void bt_multActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_multActionPerformed
        // Botão multiplicação
        valor1 = Double.parseDouble(ct_tela.getText());//Armazena valor1
        print1(valor1 + " x ");
        print("");
        operacoes = "multiplicação";
    }//GEN-LAST:event_bt_multActionPerformed

    private void bt_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_igualActionPerformed
        // Botão igual

        //armazena o valor2
        valor2 = Double.parseDouble(ct_tela.getText());

        switch (operacoes) {
            case "soma":
                print(valor1 + " + " + valor2 + (" = " + calculadora.somar(valor1, valor2)));

                break;
            case "subtração":
                print1(valor1 + " - " + valor2);
                print(" = " + calculadora.subtrair(valor1, valor2));
                break;

            case "divisão":
                if (valor1 != 0 && valor2 != 0) {
                    print1(valor1 + " / " + valor2);
                    print((" = " + calculadora.dividir(valor1, valor2)));
                } else {
                    print1(valor1 + " / " + valor2);
                    print((" = " + 0.0));
                }
                break;

            case "multiplicação":
                if (valor1 != 0 && valor2 != 0) {
                    print1(valor1 + " x " + valor2);
                    print((" = " + calculadora.calculo(valor1, valor2)));

                } else {
                    //print(valor1 + " x " + valor2 + (" = " + 0.0));
                    print1(valor1 + " x " + valor2);
                    print((" = " + 0.0));
                }
                break;
            case "porcetagem":
                if (valor1 != 0 && valor2 != 0) {
                    print1(valor1 + " % " + valor2);
                    print((" = " + calculadora.porcentagem(valor1, valor2)));
                } else {
                    //print(valor1 + " % " + valor2 + (" = " + 0.0));
                    print1(valor1 + " % " + valor2);
                    print((" = " + 0.0));
                }
                break;
            default:
                print("");
                break;
        }

    }//GEN-LAST:event_bt_igualActionPerformed

    private void bt_porcentagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_porcentagemActionPerformed
        // Botão porcetagem 

        valor1 = Double.parseDouble(ct_tela.getText());

        print1(valor1 + "%");
        print("");
        operacoes = "porcetagem";
    }//GEN-LAST:event_bt_porcentagemActionPerformed

    private void bt_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_2ActionPerformed
        //Botão 2
        print(ct_tela.getText() + "2");
    }//GEN-LAST:event_bt_2ActionPerformed

    private void bt_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_3ActionPerformed
        //Botão 3
        print(ct_tela.getText() + "3");
    }//GEN-LAST:event_bt_3ActionPerformed

    private void bt_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_4ActionPerformed
        //Botão 4
        print(ct_tela.getText() + "4");
    }//GEN-LAST:event_bt_4ActionPerformed

    private void bt_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_5ActionPerformed
        //Botão 5
        print(ct_tela.getText() + "5");
    }//GEN-LAST:event_bt_5ActionPerformed

    private void bt_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_6ActionPerformed
        //Botão 6
        print(ct_tela.getText() + "6");
    }//GEN-LAST:event_bt_6ActionPerformed

    private void bt_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_7ActionPerformed
        //Botão 7
        print(ct_tela.getText() + "7");
    }//GEN-LAST:event_bt_7ActionPerformed

    private void bt_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_8ActionPerformed
        //Botão 8
        print(ct_tela.getText() + "8");
    }//GEN-LAST:event_bt_8ActionPerformed

    private void bt_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_9ActionPerformed
        //Botão 9
        print(ct_tela.getText() + "9");
    }//GEN-LAST:event_bt_9ActionPerformed

    private void bt_pontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pontoActionPerformed
        //Botão Ponto
        print(ct_tela.getText() + ".");
    }//GEN-LAST:event_bt_pontoActionPerformed

    private void bt_apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_apagarActionPerformed
        // Botão apagar
        print("");
        print1("");
    }//GEN-LAST:event_bt_apagarActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalculadoraF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_0;
    private javax.swing.JButton bt_1;
    private javax.swing.JButton bt_2;
    private javax.swing.JButton bt_3;
    private javax.swing.JButton bt_4;
    private javax.swing.JButton bt_5;
    private javax.swing.JButton bt_6;
    private javax.swing.JButton bt_7;
    private javax.swing.JButton bt_8;
    private javax.swing.JButton bt_9;
    private javax.swing.JButton bt_apagar;
    private javax.swing.JButton bt_divi;
    private javax.swing.JButton bt_igual;
    private javax.swing.JButton bt_mult;
    private javax.swing.JButton bt_ponto;
    private javax.swing.JButton bt_porcentagem;
    private javax.swing.JButton bt_soma;
    private javax.swing.JButton bt_sub;
    private javax.swing.JTextField ct_tela;
    private javax.swing.JTextField ct_tela1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

}
