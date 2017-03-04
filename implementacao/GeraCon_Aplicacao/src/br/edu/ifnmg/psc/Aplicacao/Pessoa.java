/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.psc.Aplicacao;

import br.edu.ifnmg.psc.Excecao.ErroValidacao;

/**
 *
 * @author victor
 */
public abstract class Pessoa extends Endereco{
    private String nome;
    private String telefone;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) throws ErroValidacao {
        if(telefone.length()>14)
            throw new ErroValidacao("O atributo rg deve ter no máximo 10 caracteres!");
        this.telefone = telefone.replace("(","").replace(")","").replace("-", "");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
