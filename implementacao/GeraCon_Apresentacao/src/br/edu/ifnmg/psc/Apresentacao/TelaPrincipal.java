/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.psc.Apresentacao;

import br.edu.ifnmg.psc.Aplicacao.ClienteRepositorio;
import br.edu.ifnmg.psc.Aplicacao.VendaRepositorio;
import java.awt.BorderLayout;
import java.beans.PropertyVetoException;
import java.net.URL;
import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.JMRuntimeException;
import javax.swing.JInternalFrame;

/**
 *
 * @author victor
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalDesktop
     */
    public TelaPrincipal() {
        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH); 
        setContentPane(DesktopPrincipal);
        this.painelLateral.setVisible(true);
        DesktopPrincipal.add(this.painelLateral);
        //
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelLateral = new javax.swing.JPanel();
        DesktopPrincipal = new javax.swing.JDesktopPane();
        MenuPrincipal = new javax.swing.JMenuBar();
        menuGerenciar = new javax.swing.JMenu();
        menuItemClientes = new javax.swing.JMenuItem();
        MenuItemCompras = new javax.swing.JMenuItem();
        MenuItemEntrega = new javax.swing.JMenuItem();
        itemFornecedores = new javax.swing.JMenuItem();
        menuItemFuncionarios = new javax.swing.JMenuItem();
        menuItemProdutos = new javax.swing.JMenuItem();
        MenuItemVeiculo = new javax.swing.JMenuItem();
        menuItemVendas = new javax.swing.JMenuItem();
        menuRelatorios = new javax.swing.JMenu();
        menuRelatorioVendas = new javax.swing.JMenuItem();
        MenuItemReltorioClientes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelLateral.setBorder(javax.swing.BorderFactory.createTitledBorder("nijkdfb"));

        DesktopPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        DesktopPrincipal.setDoubleBuffered(true);
        DesktopPrincipal.setMinimumSize(new java.awt.Dimension(600, 800));
        painelLateral.add(DesktopPrincipal);

        MenuPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MenuPrincipal.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N

        menuGerenciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gerenciar.png"))); // NOI18N
        menuGerenciar.setText("Gerenciar");

        menuItemClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/users.png"))); // NOI18N
        menuItemClientes.setText("Clientes");
        menuItemClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemClientesActionPerformed(evt);
            }
        });
        menuGerenciar.add(menuItemClientes);

        MenuItemCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/compra.png"))); // NOI18N
        MenuItemCompras.setText("Compras");
        MenuItemCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemComprasActionPerformed(evt);
            }
        });
        menuGerenciar.add(MenuItemCompras);

        MenuItemEntrega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/entrega.png"))); // NOI18N
        MenuItemEntrega.setText("Entregas");
        MenuItemEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemEntregaActionPerformed(evt);
            }
        });
        menuGerenciar.add(MenuItemEntrega);

        itemFornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fornecedores.png"))); // NOI18N
        itemFornecedores.setText("Fornecedores");
        itemFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemFornecedoresActionPerformed(evt);
            }
        });
        menuGerenciar.add(itemFornecedores);

        menuItemFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/funcionarios.png"))); // NOI18N
        menuItemFuncionarios.setText("Funcionários");
        menuItemFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemFuncionariosActionPerformed(evt);
            }
        });
        menuGerenciar.add(menuItemFuncionarios);

        menuItemProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produto.png"))); // NOI18N
        menuItemProdutos.setText("Produtos");
        menuItemProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemProdutosActionPerformed(evt);
            }
        });
        menuGerenciar.add(menuItemProdutos);

        MenuItemVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/carro.png"))); // NOI18N
        MenuItemVeiculo.setText("Veículos");
        MenuItemVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemVeiculoActionPerformed(evt);
            }
        });
        menuGerenciar.add(MenuItemVeiculo);

        menuItemVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/venda.png"))); // NOI18N
        menuItemVendas.setText("Vendas");
        menuItemVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVendasActionPerformed(evt);
            }
        });
        menuGerenciar.add(menuItemVendas);

        MenuPrincipal.add(menuGerenciar);

        menuRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/relatorio.png"))); // NOI18N
        menuRelatorios.setText("Relatórios");

        menuRelatorioVendas.setText("Vendas");
        menuRelatorioVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRelatorioVendasActionPerformed(evt);
            }
        });
        menuRelatorios.add(menuRelatorioVendas);

        MenuItemReltorioClientes.setText("Clientes");
        MenuItemReltorioClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemReltorioClientesActionPerformed(evt);
            }
        });
        menuRelatorios.add(MenuItemReltorioClientes);

        MenuPrincipal.add(menuRelatorios);

        setJMenuBar(MenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(823, Short.MAX_VALUE)
                .addComponent(painelLateral, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelLateral, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1045, 536));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemFuncionariosActionPerformed
       abreInternalFrame(new TelaGerenciarFuncionarios());
    }//GEN-LAST:event_menuItemFuncionariosActionPerformed

    private void menuItemClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemClientesActionPerformed
        try {
            abreInternalFrame(new TelaGerenciarClientes());
        } catch (ParseException ex) {
           ex.printStackTrace();
        }
    }//GEN-LAST:event_menuItemClientesActionPerformed

    private void menuItemVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVendasActionPerformed
        abreInternalFrame(new TelaGerenciamentoVendas());
    }//GEN-LAST:event_menuItemVendasActionPerformed

    private void menuItemProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemProdutosActionPerformed
        try {
            abreInternalFrame(new TelaGerenciarProduto());
        } catch (ParseException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuItemProdutosActionPerformed

    private void MenuItemComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemComprasActionPerformed
        abreInternalFrame(new TelaEfetuarCompras());
    }//GEN-LAST:event_MenuItemComprasActionPerformed

    private void MenuItemEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemEntregaActionPerformed
        abreInternalFrame(new TelaEfetuarEntrega());
    }//GEN-LAST:event_MenuItemEntregaActionPerformed

    private void MenuItemVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemVeiculoActionPerformed
        try {
            abreInternalFrame(new TelaGerenciarVeiculos());
        } catch (ParseException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MenuItemVeiculoActionPerformed

    private void itemFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemFornecedoresActionPerformed
        abreInternalFrame(new TelaGerenciarFornecedores());
    }//GEN-LAST:event_itemFornecedoresActionPerformed

    private void MenuItemReltorioClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemReltorioClientesActionPerformed
        ClienteRepositorio dao = GerenciadorReferencias.getCliente();
        
        exibeRelatorioJasper("Clientes.jasper", dao.Buscar(null) );
    }//GEN-LAST:event_MenuItemReltorioClientesActionPerformed

    private void menuRelatorioVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRelatorioVendasActionPerformed
        VendaRepositorio dao = GerenciadorReferencias.getVenda();
        
        exibeRelatorioJasper("Vendas.jasper", dao.Buscar(null) );
    }//GEN-LAST:event_menuRelatorioVendasActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }
     private void exibeRelatorioJasper(String caminho_relatorio, List dados) {

        try {
            // Parâmetros
            Map parametros = new HashMap();

            // Pega o caminho do arquivo do relatório
            URL arquivo = getClass().getResource(caminho_relatorio);
            
            // Carrega o relatório na memória
            JasperReport relatorio = (JasperReport) JRLoader.loadObject(arquivo);
            
            JRDataSource fontededados = new JRBeanCollectionDataSource(dados, true);
            
            JasperPrint jasperPrint = JasperFillManager.fillReport(relatorio, parametros, fontededados);
            
            // Visualiza o relatório
            JasperViewer jrviewer = new JasperViewer(jasperPrint, false);
            
            jrviewer.setVisible(true);
        
        } catch (JMRuntimeExceptionionception ex) {
            Logger.getLogger(JasperReport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane DesktopPrincipal;
    private javax.swing.JMenuItem MenuItemCompras;
    private javax.swing.JMenuItem MenuItemEntrega;
    private javax.swing.JMenuItem MenuItemReltorioClientes;
    private javax.swing.JMenuItem MenuItemVeiculo;
    public static javax.swing.JMenuBar MenuPrincipal;
    private javax.swing.JMenuItem itemFornecedores;
    private javax.swing.JMenu menuGerenciar;
    private javax.swing.JMenuItem menuItemClientes;
    private javax.swing.JMenuItem menuItemFuncionarios;
    private javax.swing.JMenuItem menuItemProdutos;
    private javax.swing.JMenuItem menuItemVendas;
    private javax.swing.JMenuItem menuRelatorioVendas;
    private javax.swing.JMenu menuRelatorios;
    public static javax.swing.JPanel painelLateral;
    // End of variables declaration//GEN-END:variables
    
    public void abreInternalFrame(JInternalFrame frame) {
        frame.setVisible(true);
        DesktopPrincipal.add(frame, BorderLayout.CENTER);
        try {
            frame.setSelected(true);
            frame.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        DesktopPrincipal.setVisible(true);
        MenuPrincipal.setVisible(false);
        frame.setSize(DesktopPrincipal.getSize());
    }
}
