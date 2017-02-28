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
public class TelaEfetuarVenda extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaEfetuarVenda
     */
    public TelaEfetuarVenda() {
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

        jPanelEfeVend = new javax.swing.JPanel();
        LblProduto = new javax.swing.JLabel();
        LblQuantidade = new javax.swing.JLabel();
        CBXProduto = new javax.swing.JComboBox();
        SpinQuantidade = new javax.swing.JSpinner();
        BtnAdicionar = new javax.swing.JButton();
        jPanelDadosVend = new javax.swing.JPanel();
        LblFormaPagamento = new javax.swing.JLabel();
        CBXFormaPagamento = new javax.swing.JComboBox();
        LblData = new javax.swing.JLabel();
        Txtdata = new javax.swing.JFormattedTextField();
        LblCliente = new javax.swing.JLabel();
        CBXCliente = new javax.swing.JComboBox();
        jPanelCarrEfVend = new javax.swing.JPanel();
        LblDesconto = new javax.swing.JLabel();
        TxtDesconto = new javax.swing.JTextField();
        LblValorTotal = new javax.swing.JLabel();
        TxtValorTotal = new javax.swing.JTextField();
        BtnVoltar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        BtnFinal = new javax.swing.JButton();

        jPanelEfeVend.setBorder(javax.swing.BorderFactory.createTitledBorder("Efetuar Venda"));

        LblProduto.setText("Produto:");

        LblQuantidade.setText("Quantidade:");

        CBXProduto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Item 2", "Item 3", "Item 4" }));

        BtnAdicionar.setText("Adicionar");

        javax.swing.GroupLayout jPanelEfeVendLayout = new javax.swing.GroupLayout(jPanelEfeVend);
        jPanelEfeVend.setLayout(jPanelEfeVendLayout);
        jPanelEfeVendLayout.setHorizontalGroup(
            jPanelEfeVendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEfeVendLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEfeVendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelEfeVendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanelEfeVendLayout.createSequentialGroup()
                            .addComponent(LblQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(SpinQuantidade))
                        .addComponent(LblProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelEfeVendLayout.createSequentialGroup()
                            .addGap(108, 108, 108)
                            .addComponent(CBXProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanelEfeVendLayout.setVerticalGroup(
            jPanelEfeVendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEfeVendLayout.createSequentialGroup()
                .addGroup(jPanelEfeVendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEfeVendLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(CBXProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelEfeVendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SpinQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelEfeVendLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LblProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(BtnAdicionar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelDadosVend.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados da venda"));

        LblFormaPagamento.setText("Forma de pagamento:");

        CBXFormaPagamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Item 2", "Item 3", "Item 4" }));
        CBXFormaPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBXFormaPagamentoActionPerformed(evt);
            }
        });

        LblData.setText("Data:");

        Txtdata.setText("       /  /");

        LblCliente.setText("Cliente:");

        CBXCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanelDadosVendLayout = new javax.swing.GroupLayout(jPanelDadosVend);
        jPanelDadosVend.setLayout(jPanelDadosVendLayout);
        jPanelDadosVendLayout.setHorizontalGroup(
            jPanelDadosVendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosVendLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosVendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosVendLayout.createSequentialGroup()
                        .addComponent(LblCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelDadosVendLayout.createSequentialGroup()
                        .addGroup(jPanelDadosVendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDadosVendLayout.createSequentialGroup()
                                .addComponent(LblData, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(121, 121, 121))
                            .addComponent(LblFormaPagamento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelDadosVendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Txtdata, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CBXFormaPagamento, 0, 203, Short.MAX_VALUE)
                            .addComponent(CBXCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanelDadosVendLayout.setVerticalGroup(
            jPanelDadosVendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosVendLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosVendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblData, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txtdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDadosVendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBXFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDadosVendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBXCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanelCarrEfVend.setBorder(javax.swing.BorderFactory.createTitledBorder("Carrinho de compras"));

        javax.swing.GroupLayout jPanelCarrEfVendLayout = new javax.swing.GroupLayout(jPanelCarrEfVend);
        jPanelCarrEfVend.setLayout(jPanelCarrEfVendLayout);
        jPanelCarrEfVendLayout.setHorizontalGroup(
            jPanelCarrEfVendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 378, Short.MAX_VALUE)
        );
        jPanelCarrEfVendLayout.setVerticalGroup(
            jPanelCarrEfVendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 269, Short.MAX_VALUE)
        );

        LblDesconto.setText("Desconto(%):");

        LblValorTotal.setText("Valor Total:");

        BtnVoltar.setText("Voltar");
        BtnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVoltarActionPerformed(evt);
            }
        });

        BtnCancelar.setText("Cancelar");

        BtnFinal.setText("Finalizar Venda");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanelDadosVend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelEfeVend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelCarrEfVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LblDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TxtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(LblValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BtnFinal)
                                    .addComponent(TxtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(BtnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelCarrEfVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelEfeVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jPanelDadosVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(BtnVoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnFinal)
                            .addComponent(BtnCancelar))))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBXFormaPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBXFormaPagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBXFormaPagamentoActionPerformed

    private void BtnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVoltarActionPerformed
        this.doDefaultCloseAction();
    }//GEN-LAST:event_BtnVoltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdicionar;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnFinal;
    private javax.swing.JButton BtnVoltar;
    private javax.swing.JComboBox CBXCliente;
    private javax.swing.JComboBox CBXFormaPagamento;
    private javax.swing.JComboBox CBXProduto;
    private javax.swing.JLabel LblCliente;
    private javax.swing.JLabel LblData;
    private javax.swing.JLabel LblDesconto;
    private javax.swing.JLabel LblFormaPagamento;
    private javax.swing.JLabel LblProduto;
    private javax.swing.JLabel LblQuantidade;
    private javax.swing.JLabel LblValorTotal;
    private javax.swing.JSpinner SpinQuantidade;
    private javax.swing.JTextField TxtDesconto;
    private javax.swing.JTextField TxtValorTotal;
    private javax.swing.JFormattedTextField Txtdata;
    private javax.swing.JPanel jPanelCarrEfVend;
    private javax.swing.JPanel jPanelDadosVend;
    private javax.swing.JPanel jPanelEfeVend;
    // End of variables declaration//GEN-END:variables
}
