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
public class TelaGerenciarFornecedores extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaGerenciarFornecedores
     */
    public TelaGerenciarFornecedores() {
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

        PanelFornCadastrados = new javax.swing.JPanel();
        scrollPaneForncCadastrados = new java.awt.ScrollPane();
        PanelBuscar = new javax.swing.JPanel();
        BtnBuscar = new javax.swing.JButton();
        PanelFuncionalidades = new javax.swing.JPanel();
        BtnNovoCliente = new javax.swing.JButton();
        BtnAlterar = new javax.swing.JButton();
        BtnExcluir = new javax.swing.JButton();
        BtonVoltar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuGerenciar = new javax.swing.JMenu();
        MenuItemFuncionarios = new javax.swing.JMenuItem();
        MenuItemClientes = new javax.swing.JMenuItem();
        MenuItemVendas = new javax.swing.JMenuItem();
        MenuItemProdutos = new javax.swing.JMenuItem();
        MenuItemCompras = new javax.swing.JMenuItem();
        MenuItemEntregas = new javax.swing.JMenuItem();
        MenuItemVeiculos = new javax.swing.JMenuItem();
        MenuRelatorios = new javax.swing.JMenu();
        MenuAjuda = new javax.swing.JMenu();

        PanelFornCadastrados.setBorder(javax.swing.BorderFactory.createTitledBorder("Fornecedores cadastrados"));

        javax.swing.GroupLayout PanelFornCadastradosLayout = new javax.swing.GroupLayout(PanelFornCadastrados);
        PanelFornCadastrados.setLayout(PanelFornCadastradosLayout);
        PanelFornCadastradosLayout.setHorizontalGroup(
            PanelFornCadastradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFornCadastradosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPaneForncCadastrados, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        PanelFornCadastradosLayout.setVerticalGroup(
            PanelFornCadastradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFornCadastradosLayout.createSequentialGroup()
                .addComponent(scrollPaneForncCadastrados, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelBuscar.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar"));

        BtnBuscar.setText("Buscar Fornecedor");

        javax.swing.GroupLayout PanelBuscarLayout = new javax.swing.GroupLayout(PanelBuscar);
        PanelBuscar.setLayout(PanelBuscarLayout);
        PanelBuscarLayout.setHorizontalGroup(
            PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBuscarLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );
        PanelBuscarLayout.setVerticalGroup(
            PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnBuscar)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        PanelFuncionalidades.setBorder(javax.swing.BorderFactory.createTitledBorder("Funcionalidades"));

        BtnNovoCliente.setText("Novo Fornecedor");

        BtnAlterar.setText("Alterar");

        BtnExcluir.setText("Excluir");

        javax.swing.GroupLayout PanelFuncionalidadesLayout = new javax.swing.GroupLayout(PanelFuncionalidades);
        PanelFuncionalidades.setLayout(PanelFuncionalidadesLayout);
        PanelFuncionalidadesLayout.setHorizontalGroup(
            PanelFuncionalidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFuncionalidadesLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(PanelFuncionalidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelFuncionalidadesLayout.createSequentialGroup()
                        .addComponent(BtnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BtnNovoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        PanelFuncionalidadesLayout.setVerticalGroup(
            PanelFuncionalidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFuncionalidadesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnNovoCliente)
                .addGap(28, 28, 28)
                .addGroup(PanelFuncionalidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAlterar)
                    .addComponent(BtnExcluir))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        BtonVoltar.setText("Voltar");

        MenuGerenciar.setText("Gerenciar");

        MenuItemFuncionarios.setText("Funcionários");
        MenuItemFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemFuncionariosActionPerformed(evt);
            }
        });
        MenuGerenciar.add(MenuItemFuncionarios);

        MenuItemClientes.setText("Clientes");
        MenuItemClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemClientesActionPerformed(evt);
            }
        });
        MenuGerenciar.add(MenuItemClientes);

        MenuItemVendas.setText("Vendas");
        MenuItemVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemVendasActionPerformed(evt);
            }
        });
        MenuGerenciar.add(MenuItemVendas);

        MenuItemProdutos.setText("Produtos");
        MenuItemProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemProdutosActionPerformed(evt);
            }
        });
        MenuGerenciar.add(MenuItemProdutos);

        MenuItemCompras.setText("Compras");
        MenuItemCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemComprasActionPerformed(evt);
            }
        });
        MenuGerenciar.add(MenuItemCompras);

        MenuItemEntregas.setText("Entregas");
        MenuItemEntregas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemEntregasActionPerformed(evt);
            }
        });
        MenuGerenciar.add(MenuItemEntregas);

        MenuItemVeiculos.setText("Veículos");
        MenuItemVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemVeiculosActionPerformed(evt);
            }
        });
        MenuGerenciar.add(MenuItemVeiculos);

        jMenuBar1.add(MenuGerenciar);

        MenuRelatorios.setText("Relatórios");
        jMenuBar1.add(MenuRelatorios);

        MenuAjuda.setText("Ajuda");
        jMenuBar1.add(MenuAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(PanelFornCadastrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PanelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PanelFuncionalidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(BtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(PanelFuncionalidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtonVoltar))
                    .addComponent(PanelFornCadastrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItemFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemFuncionariosActionPerformed
        TelaGerenciarFuncionarios telaFuncionarios = new TelaGerenciarFuncionarios();
        this.add(telaFuncionarios);
        telaFuncionarios.setVisible(true);
    }//GEN-LAST:event_MenuItemFuncionariosActionPerformed

    private void MenuItemProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemProdutosActionPerformed
        TelaGerenciarProduto telaProduto = new TelaGerenciarProduto();
        this.add(telaProduto);
        telaProduto.setVisible(true);
    }//GEN-LAST:event_MenuItemProdutosActionPerformed

    private void MenuItemClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemClientesActionPerformed
       TelaGerenciarClientes telaClientes = new TelaGerenciarClientes();
        this.add(telaClientes);
        telaClientes.setVisible(true);
    }//GEN-LAST:event_MenuItemClientesActionPerformed

    private void MenuItemVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemVendasActionPerformed
        TelaGerenciamentoVendas telaVendas = new TelaGerenciamentoVendas();
        this.add(telaVendas);
        telaVendas.setVisible(true);
    }//GEN-LAST:event_MenuItemVendasActionPerformed

    private void MenuItemComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemComprasActionPerformed
        TelaEfetuarCompras telaCompras = new TelaEfetuarCompras();
        this.add(telaCompras);
        telaCompras.setVisible(true);
    }//GEN-LAST:event_MenuItemComprasActionPerformed

    private void MenuItemEntregasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemEntregasActionPerformed
       TelaEfetuarEntrega telaEntregas = new TelaEfetuarEntrega();
        this.add(telaEntregas);
        telaEntregas.setVisible(true);
    }//GEN-LAST:event_MenuItemEntregasActionPerformed

    private void MenuItemVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemVeiculosActionPerformed
        TelaGerenciarVeiculos telaVeiculos = new TelaGerenciarVeiculos();
        this.add(telaVeiculos);
        telaVeiculos.setVisible(true);
    }//GEN-LAST:event_MenuItemVeiculosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAlterar;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnExcluir;
    private javax.swing.JButton BtnNovoCliente;
    private javax.swing.JButton BtonVoltar;
    private javax.swing.JMenu MenuAjuda;
    private javax.swing.JMenu MenuGerenciar;
    private javax.swing.JMenuItem MenuItemClientes;
    private javax.swing.JMenuItem MenuItemCompras;
    private javax.swing.JMenuItem MenuItemEntregas;
    private javax.swing.JMenuItem MenuItemFuncionarios;
    private javax.swing.JMenuItem MenuItemProdutos;
    private javax.swing.JMenuItem MenuItemVeiculos;
    private javax.swing.JMenuItem MenuItemVendas;
    private javax.swing.JMenu MenuRelatorios;
    private javax.swing.JPanel PanelBuscar;
    private javax.swing.JPanel PanelFornCadastrados;
    private javax.swing.JPanel PanelFuncionalidades;
    private javax.swing.JMenuBar jMenuBar1;
    private java.awt.ScrollPane scrollPaneForncCadastrados;
    // End of variables declaration//GEN-END:variables
}
