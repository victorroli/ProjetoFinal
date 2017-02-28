/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.psc.Apresentacao;

import java.awt.Container;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;

/**
 *
 * @author thais
 */
public class TelaPrincipal extends javax.swing.JFrame{
    /**
     * Creates new form TelaPrincipal
     */
    Container c = new Container();
    public TelaPrincipal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        //c.add(PainelPrincipal);
        //c.setVisible(true);
    }
    
         
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelPrincipal = new javax.swing.JPanel();
        BtnClientes = new javax.swing.JButton();
        BtnCompras = new javax.swing.JButton();
        BtnVendas = new javax.swing.JButton();
        BtnProdutos = new javax.swing.JButton();
        PainelLateral = new javax.swing.JPanel();
        PainelDadosUsuario = new javax.swing.JPanel();
        LblUsuarioLogado = new javax.swing.JLabel();
        LblFuncao = new javax.swing.JLabel();
        txtUsuarioLogado = new javax.swing.JTextField();
        txtFuncao = new javax.swing.JTextField();
        btnSair = new javax.swing.JButton();
        PainelCaixa = new javax.swing.JPanel();
        LblStatus = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        btnAbrirFechar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuGerenciar = new javax.swing.JMenu();
        menuItemFuncionarios = new javax.swing.JMenuItem();
        menuItemClientes = new javax.swing.JMenuItem();
        menuItemVendas = new javax.swing.JMenuItem();
        menuItemProdutos = new javax.swing.JMenuItem();
        MenuItemCompras = new javax.swing.JMenuItem();
        MenuItemEntrega = new javax.swing.JMenuItem();
        MenuItemVeiculo = new javax.swing.JMenuItem();
        menuRelatorios = new javax.swing.JMenu();
        menuRelatorioVendas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelPrincipal.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PainelPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        BtnClientes.setText("Clientes");
        BtnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnClientesActionPerformed(evt);
            }
        });

        BtnCompras.setText("Compras");
        BtnCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnComprasActionPerformed(evt);
            }
        });

        BtnVendas.setText("Vendas");
        BtnVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVendasActionPerformed(evt);
            }
        });

        BtnProdutos.setText("Produtos");
        BtnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnProdutosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelPrincipalLayout = new javax.swing.GroupLayout(PainelPrincipal);
        PainelPrincipal.setLayout(PainelPrincipalLayout);
        PainelPrincipalLayout.setHorizontalGroup(
            PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                .addGap(152, 152, 152)
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(123, 123, 123))
        );
        PainelPrincipalLayout.setVerticalGroup(
            PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PainelDadosUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do usuário"));

        LblUsuarioLogado.setText("Usuário logado:");

        LblFuncao.setText("Função:");

        btnSair.setText("Sair");

        javax.swing.GroupLayout PainelDadosUsuarioLayout = new javax.swing.GroupLayout(PainelDadosUsuario);
        PainelDadosUsuario.setLayout(PainelDadosUsuarioLayout);
        PainelDadosUsuarioLayout.setHorizontalGroup(
            PainelDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelDadosUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LblFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblUsuarioLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsuarioLogado, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(txtFuncao))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelDadosUsuarioLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        PainelDadosUsuarioLayout.setVerticalGroup(
            PainelDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelDadosUsuarioLayout.createSequentialGroup()
                .addComponent(LblUsuarioLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuarioLogado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(LblFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(btnSair)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        PainelCaixa.setBorder(javax.swing.BorderFactory.createTitledBorder("Caixa"));

        LblStatus.setText("Status:");

        btnAbrirFechar.setText("Abrir/Fechar");

        javax.swing.GroupLayout PainelCaixaLayout = new javax.swing.GroupLayout(PainelCaixa);
        PainelCaixa.setLayout(PainelCaixaLayout);
        PainelCaixaLayout.setHorizontalGroup(
            PainelCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCaixaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAbrirFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
            .addGroup(PainelCaixaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblStatus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        PainelCaixaLayout.setVerticalGroup(
            PainelCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCaixaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAbrirFechar)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PainelLateralLayout = new javax.swing.GroupLayout(PainelLateral);
        PainelLateral.setLayout(PainelLateralLayout);
        PainelLateralLayout.setHorizontalGroup(
            PainelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLateralLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PainelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PainelLateralLayout.createSequentialGroup()
                        .addComponent(PainelCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addComponent(PainelDadosUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        PainelLateralLayout.setVerticalGroup(
            PainelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLateralLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(PainelDadosUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(PainelCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        menuGerenciar.setText("Gerenciar");

        menuItemFuncionarios.setText("Funcionários");
        menuItemFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemFuncionariosActionPerformed(evt);
            }
        });
        menuGerenciar.add(menuItemFuncionarios);

        menuItemClientes.setText("Clientes");
        menuItemClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemClientesActionPerformed(evt);
            }
        });
        menuGerenciar.add(menuItemClientes);

        menuItemVendas.setText("Vendas");
        menuItemVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVendasActionPerformed(evt);
            }
        });
        menuGerenciar.add(menuItemVendas);

        menuItemProdutos.setText("Produtos");
        menuItemProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemProdutosActionPerformed(evt);
            }
        });
        menuGerenciar.add(menuItemProdutos);

        MenuItemCompras.setText("Compras");
        MenuItemCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemComprasActionPerformed(evt);
            }
        });
        menuGerenciar.add(MenuItemCompras);

        MenuItemEntrega.setText("Entregas");
        MenuItemEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemEntregaActionPerformed(evt);
            }
        });
        menuGerenciar.add(MenuItemEntrega);

        MenuItemVeiculo.setText("Veículos");
        MenuItemVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemVeiculoActionPerformed(evt);
            }
        });
        menuGerenciar.add(MenuItemVeiculo);

        jMenuBar1.add(menuGerenciar);

        menuRelatorios.setText("Relatórios");

        menuRelatorioVendas.setText("Vendas");
        menuRelatorios.add(menuRelatorioVendas);

        jMenuBar1.add(menuRelatorios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PainelLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1043, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemProdutosActionPerformed
        abreInternalFrame(new TelaGerenciarProduto());
    }//GEN-LAST:event_menuItemProdutosActionPerformed

    private void menuItemFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemFuncionariosActionPerformed
        abreInternalFrame(new TelaGerenciarFuncionarios());
    }//GEN-LAST:event_menuItemFuncionariosActionPerformed

    private void menuItemClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemClientesActionPerformed
        abreInternalFrame(new TelaGerenciarClientes());
    }//GEN-LAST:event_menuItemClientesActionPerformed

    private void menuItemVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVendasActionPerformed
        abreInternalFrame(new TelaGerenciamentoVendas());
    }//GEN-LAST:event_menuItemVendasActionPerformed

    private void BtnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClientesActionPerformed
        abreInternalFrame(new TelaGerenciarClientes());
    }//GEN-LAST:event_BtnClientesActionPerformed

    private void BtnComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnComprasActionPerformed
        abreInternalFrame(new TelaEfetuarCompras());
    }//GEN-LAST:event_BtnComprasActionPerformed

    private void BtnVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVendasActionPerformed
        abreInternalFrame(new TelaEfetuarVenda());
    }//GEN-LAST:event_BtnVendasActionPerformed

    private void BtnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnProdutosActionPerformed
        abreInternalFrame(new TelaGerenciarProduto());
    }//GEN-LAST:event_BtnProdutosActionPerformed

    private void MenuItemComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemComprasActionPerformed
        abreInternalFrame(new TelaEfetuarCompras());
    }//GEN-LAST:event_MenuItemComprasActionPerformed

    private void MenuItemEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemEntregaActionPerformed
        abreInternalFrame(new TelaEfetuarEntrega());
    }//GEN-LAST:event_MenuItemEntregaActionPerformed

    private void MenuItemVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemVeiculoActionPerformed
        abreInternalFrame(new TelaGerenciarVeiculos());
    }//GEN-LAST:event_MenuItemVeiculoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnClientes;
    private javax.swing.JButton BtnCompras;
    private javax.swing.JButton BtnProdutos;
    private javax.swing.JButton BtnVendas;
    private javax.swing.JLabel LblFuncao;
    private javax.swing.JLabel LblStatus;
    private javax.swing.JLabel LblUsuarioLogado;
    private javax.swing.JMenuItem MenuItemCompras;
    private javax.swing.JMenuItem MenuItemEntrega;
    private javax.swing.JMenuItem MenuItemVeiculo;
    private javax.swing.JPanel PainelCaixa;
    private javax.swing.JPanel PainelDadosUsuario;
    private javax.swing.JPanel PainelLateral;
    private javax.swing.JPanel PainelPrincipal;
    private javax.swing.JButton btnAbrirFechar;
    private javax.swing.JButton btnSair;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuGerenciar;
    private javax.swing.JMenuItem menuItemClientes;
    private javax.swing.JMenuItem menuItemFuncionarios;
    private javax.swing.JMenuItem menuItemProdutos;
    private javax.swing.JMenuItem menuItemVendas;
    private javax.swing.JMenuItem menuRelatorioVendas;
    private javax.swing.JMenu menuRelatorios;
    private javax.swing.JTextField txtFuncao;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtUsuarioLogado;
    // End of variables declaration//GEN-END:variables

    private void abreInternalFrame(JInternalFrame frame) {
        PainelPrincipal.removeAll();
        PainelPrincipal.add(frame);
        frame.setVisible(true);
        try {
            frame.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        PainelPrincipal.setVisible(true);
    }
    
    public void fechaPainel(JInternalFrame frame){
        frame.setVisible(false);
        this.remove(frame);
        reabrirPainel();
    }
    
    public void reabrirPainel(){
        c.setVisible(true);
    }
}