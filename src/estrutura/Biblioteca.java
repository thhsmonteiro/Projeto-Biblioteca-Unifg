/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrutura;

import java.util.List;

/**
 *
 * @author Paulo Victor
 */
public class Biblioteca {
    private String nome;
    private String estoque;
    private int cnpj;
    
    public Biblioteca(String nome, String livro, int cnpj){
        setNome(nome);
        setEstoque(livro);
        setCnpj(cnpj);
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the estoque
     */
    public String getEstoque() {
        return estoque;
    }

    /**
     * @param estoque the estoque to set
     */
    public void setEstoque(String estoque) {
        this.estoque = estoque;
    }

    /**
     * @return the cnpj
     */
    public int getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }
    
    
    
}
