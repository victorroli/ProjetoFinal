/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.psc.Apresentacao;

/**
 *
 * @author thais
 */
public class TelaCadastroFornecedor extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaCadastroFornecedor
     */
    public TelaCadastroFornecedor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCadastroFornc = new javax.swing.JPanel();
        jNomeFornec = new javax.swing.JLabel();
        jCNPJ = new javax.swing.JLabel();
        jEmailFornc = new javax.swing.JLabel();
        jTelefoneFornc = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jEnderFornc = new javax.swing.JLabel();
        jTxtEnderFornc = new javax.swing.JTextField();
        jNumeroFornc = new javax.swing.JLabel();
        jComplementoFornc = new javax.swing.JLabel();
        jBairroFornc = new javax.swing.JLabel();
        jCityFornc = new javax.swing.JLabel();
        jTxtNumFornc = new javax.swing.JTextField();
        jTxtCompleFornc = new javax.swing.JTextField();
        jTxtCNPJ = new javax.swing.JTextField();
        jTxtEmailFornc = new javax.swing.JTextField();
        jFTxtTelFornc = new javax.swing.JFormattedTextField();
        jTxtBairroFornc = new javax.swing.JTextField();
        jTxtFornc = new javax.swing.JTextField();
        jTxtCityFornc = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuGerenc = new javax.swing.JMenu();
        jMenuRelat = new javax.swing.JMenu();

        jPanelCadastroFornc.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Cliente"));

        jNomeFornec.setText("Nome:");

        jCNPJ.setText("CNPJ:");

        jEmailFornc.setText("Email:");

        jTelefoneFornc.setText("Telefone:");

        jEnderFornc.setText("Rua/Av:");

        jNumeroFornc.setText("Número:");

        jComplementoFornc.setText("Complemento:");

        jBairroFornc.setText("Bairro:");

        jCityFornc.setText("Cidade:");

        jTxtNumFornc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNumForncActionPerformed(evt);
            }
        });

        jTxtCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCNPJActionPerformed(evt);
            }
        });

        jFTxtTelFornc.setText("( )");

        javax.swing.GroupLayout jPanelCadastroForncLayout = new javax.swing.GroupLayout(jPanelCadastroFornc);
        jPanelCadastroFornc.setLayout(jPanelCadastroForncLayout);
        jPanelCadastroForncLayout.setHorizontalGroup(
            jPanelCadastroForncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroForncLayout.createSequentialGroup()
                .addGroup(jPanelCadastroForncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastroForncLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jSeparator1))
                    .addGroup(jPanelCadastroForncLayout.createSequentialGroup()
                        .addGroup(jPanelCadastroForncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCadastroForncLayout.createSequentialGroup()
                                .addGroup(jPanelCadastroForncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jEnderFornc, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComplementoFornc, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelCadastroForncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtEnderFornc, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelCadastroForncLayout.createSequentialGroup()
                                        .addGroup(jPanelCadastroForncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTxtNumFornc, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTxtCompleFornc, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(30, 30, 30)
                                        .addGroup(jPanelCadastroForncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCityFornc, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanelCadastroForncLayout.createSequentialGroup()
                                                .addComponent(jBairroFornc, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(1, 1, 1)
                                                .addComponent(jTxtBairroFornc, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addComponent(jNumeroFornc, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelCadastroForncLayout.createSequentialGroup()
                                .addGroup(jPanelCadastroForncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jEmailFornc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jNomeFornec, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                    .addComponent(jCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelCadastroForncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTxtCNPJ, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                                    .addComponent(jTxtEmailFornc)
                                    .addComponent(jTxtFornc))
                                .addGap(105, 105, 105)
                                .addComponent(jTelefoneFornc, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jFTxtTelFornc, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 68, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelCadastroForncLayout.setVerticalGroup(
            jPanelCadastroForncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroForncLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanelCadastroForncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNomeFornec, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtFornc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCadastroForncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroForncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEmailFornc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtEmailFornc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTelefoneFornc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTxtTelFornc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCadastroForncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jEnderFornc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtEnderFornc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanelCadastroForncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastroForncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTxtNumFornc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBairroFornc)
                        .addComponent(jTxtBairroFornc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCadastroForncLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jNumeroFornc, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCadastroForncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComplementoFornc, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtCompleFornc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCityFornc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jMenuGerenc.setText("Gerenciar");
        jMenuBar1.add(jMenuGerenc);

        jMenuRelat.setText("Relatórios");
        jMenuBar1.add(jMenuRelat);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(602, Short.MAX_VALUE)
                .addComponent(jTxtCityFornc, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelCadastroFornc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(303, Short.MAX_VALUE)
                .addComponent(jTxtCityFornc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelCadastroFornc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(74, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtNumForncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNumForncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNumForncActionPerformed

    private void jTxtCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCNPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCNPJActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jBairroFornc;
    private javax.swing.JLabel jCNPJ;
    private javax.swing.JLabel jCityFornc;
    private javax.swing.JLabel jComplementoFornc;
    private javax.swing.JLabel jEmailFornc;
    private javax.swing.JLabel jEnderFornc;
    private javax.swing.JFormattedTextField jFTxtTelFornc;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuGerenc;
    private javax.swing.JMenu jMenuRelat;
    private javax.swing.JLabel jNomeFornec;
    private javax.swing.JLabel jNumeroFornc;
    private javax.swing.JPanel jPanelCadastroFornc;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jTelefoneFornc;
    private javax.swing.JTextField jTxtBairroFornc;
    private javax.swing.JTextField jTxtCNPJ;
    private javax.swing.JTextField jTxtCityFornc;
    private javax.swing.JTextField jTxtCompleFornc;
    private javax.swing.JTextField jTxtEmailFornc;
    private javax.swing.JTextField jTxtEnderFornc;
    private javax.swing.JTextField jTxtFornc;
    private javax.swing.JTextField jTxtNumFornc;
    // End of variables declaration//GEN-END:variables
}