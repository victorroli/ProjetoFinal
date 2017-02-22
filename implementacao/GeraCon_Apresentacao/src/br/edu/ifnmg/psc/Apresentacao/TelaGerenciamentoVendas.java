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
public class TelaGerenciamentoVendas extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaGerenciamentoVendas
     */
    public TelaGerenciamentoVendas() {
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

        PanelGerencVendas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        PanelBuscar = new javax.swing.JPanel();
        BtnBuscar = new javax.swing.JButton();
        PanelFuncionalidades = new javax.swing.JPanel();
        BtnNovoCliente = new javax.swing.JButton();
        BtnAlterar = new javax.swing.JButton();
        BtnExcluir = new javax.swing.JButton();
        BtonVoltar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuGerenciar = new javax.swing.JMenu();
        MItemFuncionarios = new javax.swing.JMenuItem();
        MItemClientes = new javax.swing.JMenuItem();
        MItemVendas = new javax.swing.JMenuItem();
        MItemProdutos = new javax.swing.JMenuItem();
        MItemCompras = new javax.swing.JMenuItem();
        MItemEstoque = new javax.swing.JMenuItem();
        MItemEntregas = new javax.swing.JMenuItem();
        MItemVeiculos = new javax.swing.JMenuItem();
        MenuRelatorios = new javax.swing.JMenu();
        MenuAjuda = new javax.swing.JMenu();

        PanelGerencVendas.setBorder(javax.swing.BorderFactory.createTitledBorder("Gerenciamento de Vendas"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Preço Unitário", "Quantidade", "Fornecedor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout PanelGerencVendasLayout = new javax.swing.GroupLayout(PanelGerencVendas);
        PanelGerencVendas.setLayout(PanelGerencVendasLayout);
        PanelGerencVendasLayout.setHorizontalGroup(
            PanelGerencVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelGerencVendasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelGerencVendasLayout.setVerticalGroup(
            PanelGerencVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGerencVendasLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        PanelBuscar.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar"));

        BtnBuscar.setText("Buscar Venda");

        javax.swing.GroupLayout PanelBuscarLayout = new javax.swing.GroupLayout(PanelBuscar);
        PanelBuscar.setLayout(PanelBuscarLayout);
        PanelBuscarLayout.setHorizontalGroup(
            PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBuscarLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        PanelBuscarLayout.setVerticalGroup(
            PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelFuncionalidades.setBorder(javax.swing.BorderFactory.createTitledBorder("Funcionalidades"));

        BtnNovoCliente.setText("Nova Venda");

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
                .addContainerGap(32, Short.MAX_VALUE))
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
                .addContainerGap(13, Short.MAX_VALUE))
        );

        BtonVoltar.setText("Voltar");

        MenuGerenciar.setText("Gerenciar");

        MItemFuncionarios.setText("Funcionários");
        MenuGerenciar.add(MItemFuncionarios);

        MItemClientes.setText("Clientes");
        MenuGerenciar.add(MItemClientes);

        MItemVendas.setText("Vendas");
        MenuGerenciar.add(MItemVendas);

        MItemProdutos.setText("Produtos");
        MenuGerenciar.add(MItemProdutos);

        MItemCompras.setText("Compras");
        MenuGerenciar.add(MItemCompras);

        MItemEstoque.setText("Estoque");
        MenuGerenciar.add(MItemEstoque);

        MItemEntregas.setText("Entregas");
        MenuGerenciar.add(MItemEntregas);

        MItemVeiculos.setText("Veículos");
        MenuGerenciar.add(MItemVeiculos);

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
                .addContainerGap()
                .addComponent(PanelGerencVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelFuncionalidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(PanelFuncionalidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtonVoltar))
                    .addComponent(PanelGerencVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAlterar;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnExcluir;
    private javax.swing.JButton BtnNovoCliente;
    private javax.swing.JButton BtonVoltar;
    private javax.swing.JMenuItem MItemClientes;
    private javax.swing.JMenuItem MItemCompras;
    private javax.swing.JMenuItem MItemEntregas;
    private javax.swing.JMenuItem MItemEstoque;
    private javax.swing.JMenuItem MItemFuncionarios;
    private javax.swing.JMenuItem MItemProdutos;
    private javax.swing.JMenuItem MItemVeiculos;
    private javax.swing.JMenuItem MItemVendas;
    private javax.swing.JMenu MenuAjuda;
    private javax.swing.JMenu MenuGerenciar;
    private javax.swing.JMenu MenuRelatorios;
    private javax.swing.JPanel PanelBuscar;
    private javax.swing.JPanel PanelFuncionalidades;
    private javax.swing.JPanel PanelGerencVendas;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}