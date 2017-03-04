/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.psc.Apresentacao;

import br.edu.ifnmg.psc.Aplicacao.Fornecedor;
import br.edu.ifnmg.psc.Aplicacao.FornecedorRepositorio;
import br.edu.ifnmg.psc.Excecao.ErroValidacao;
import br.edu.ifnmg.psc.Persistencia.FornecedorDAO;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author thais
 */
public class TelaCadastroFornecedor extends javax.swing.JInternalFrame {
    
    Fornecedor fornecedor = new Fornecedor();
    FornecedorRepositorio bd_fornecedor = new FornecedorDAO();
    FornecedorRepositorio dao = GerenciadorReferencias.getFornecedor();
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

        PainelCadastro = new javax.swing.JPanel();
        LblNome = new javax.swing.JLabel();
        LblCNPJ = new javax.swing.JLabel();
        LblEmail = new javax.swing.JLabel();
        LblTelefone = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        LblEndereco = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        LblNumero = new javax.swing.JLabel();
        LblComplemento = new javax.swing.JLabel();
        LblBairro = new javax.swing.JLabel();
        LblCidade = new javax.swing.JLabel();
        TxtNumero = new javax.swing.JTextField();
        TxtComplemento = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        TxtTelefone = new javax.swing.JFormattedTextField();
        TxtBairro = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        TxtCidade = new javax.swing.JTextField();
        txtCNPJ = new javax.swing.JFormattedTextField();
        BtnSalvar = new javax.swing.JButton();
        BtnVoltar = new javax.swing.JButton();
        BtnExcluir = new javax.swing.JButton();

        PainelCadastro.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Fornecedor"));

        LblNome.setText("Nome:");

        LblCNPJ.setText("CNPJ:");

        LblEmail.setText("Email:");

        LblTelefone.setText("Telefone:");

        LblEndereco.setText("Rua/Av:");

        LblNumero.setText("Número:");

        LblComplemento.setText("Complemento:");

        LblBairro.setText("Bairro:");

        LblCidade.setText("Cidade:");

        TxtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNumeroActionPerformed(evt);
            }
        });

        try {
            TxtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout PainelCadastroLayout = new javax.swing.GroupLayout(PainelCadastro);
        PainelCadastro.setLayout(PainelCadastroLayout);
        PainelCadastroLayout.setHorizontalGroup(
            PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCadastroLayout.createSequentialGroup()
                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelCadastroLayout.createSequentialGroup()
                        .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PainelCadastroLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LblComplemento))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtRua, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                                    .addComponent(TxtComplemento)))
                            .addGroup(PainelCadastroLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(LblNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addComponent(TxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(83, 83, 83)
                        .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LblBairro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LblCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtBairro, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(TxtCidade))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PainelCadastroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelCadastroLayout.createSequentialGroup()
                                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(PainelCadastroLayout.createSequentialGroup()
                                        .addComponent(LblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PainelCadastroLayout.createSequentialGroup()
                                        .addComponent(LblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEmail)))
                                .addGap(65, 65, 65)
                                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LblTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(LblCNPJ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TxtTelefone)
                                    .addComponent(txtCNPJ, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)))
                            .addComponent(jSeparator1))))
                .addContainerGap())
        );
        PainelCadastroLayout.setVerticalGroup(
            PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCadastroLayout.createSequentialGroup()
                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelCadastroLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelCadastroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LblCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblBairro)
                    .addComponent(TxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblCidade)
                    .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LblNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        BtnSalvar.setText("Salvar");
        BtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalvarActionPerformed(evt);
            }
        });

        BtnVoltar.setText("Voltar");
        BtnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVoltarActionPerformed(evt);
            }
        });

        BtnExcluir.setText("Excluir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 529, Short.MAX_VALUE)
                .addComponent(BtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(BtnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PainelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(27, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(360, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PainelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(82, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNumeroActionPerformed

    private void BtnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVoltarActionPerformed
        this.doDefaultCloseAction();
        TelaGerenciarFornecedores tela = new TelaGerenciarFornecedores();
        TelaPrincipal.DesktopPrincipal.add(tela);
    }//GEN-LAST:event_BtnVoltarActionPerformed

    private void BtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalvarActionPerformed
        try {
            extraiCampos();
            if(dao.VerificaFornecedor(fornecedor.getCnpj())){
            System.out.println("Fornecedor  "+fornecedor.getCnpj()+" já cadastrado");
        }
        else{
            if(bd_fornecedor.Salvar(fornecedor)){
                JOptionPane.showMessageDialog(null,"Fornecedor: "+fornecedor.getNome()+" cadastrado"
                 + " com sucesso!!! ");
                limpaCampos();
            }
            else JOptionPane.showMessageDialog(null, "Falha ao cadastrar novo Fornecedor");
        }
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        } catch (ErroValidacao ex) {
            Logger.getLogger(TelaCadastroFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnSalvarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnExcluir;
    private javax.swing.JButton BtnSalvar;
    private javax.swing.JButton BtnVoltar;
    private javax.swing.JLabel LblBairro;
    private javax.swing.JLabel LblCNPJ;
    private javax.swing.JLabel LblCidade;
    private javax.swing.JLabel LblComplemento;
    private javax.swing.JLabel LblEmail;
    private javax.swing.JLabel LblEndereco;
    private javax.swing.JLabel LblNome;
    private javax.swing.JLabel LblNumero;
    private javax.swing.JLabel LblTelefone;
    private javax.swing.JPanel PainelCadastro;
    private javax.swing.JTextField TxtBairro;
    private javax.swing.JTextField TxtCidade;
    private javax.swing.JTextField TxtComplemento;
    private javax.swing.JTextField TxtNumero;
    private javax.swing.JFormattedTextField TxtTelefone;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JFormattedTextField txtCNPJ;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRua;
    // End of variables declaration//GEN-END:variables

    private void extraiCampos() throws ErroValidacao {
       if(!txtNome.getText().equals(""))
           fornecedor.setNome(txtNome.getText());
       if(!txtEmail.getText().equals(""))
           fornecedor.setEmail(txtEmail.getText());
       if(!txtCNPJ.getText().equals(""))
           fornecedor.setCnpj(txtCNPJ.getText());
       if(!TxtTelefone.getText().equals(""))
           fornecedor.setTelefone(TxtTelefone.getText());
       if(!TxtNumero.getText().equals(""))
           fornecedor.setNumero(Integer.parseInt(TxtNumero.getText()));
       if(!txtRua.getText().equals(""))
           fornecedor.setRua(txtRua.getText());
       if(!TxtComplemento.getText().equals(""))
           fornecedor.setComplemento(TxtComplemento.getText());
       if(!TxtCidade.getText().equals(""))
           fornecedor.setCidade(TxtCidade.getText());
       if(!TxtBairro.getText().equals(""))
           fornecedor.setBairro(TxtBairro.getText());
    }

    private void limpaCampos() {
        txtNome.setText("");
        txtRua.setText("");
        txtEmail.setText("");
        txtCNPJ.setText("");
        TxtTelefone.setText("");
        TxtNumero.setText("");
        TxtComplemento.setText("");
        TxtCidade.setText("");
        TxtBairro.setText("");
    }
}
