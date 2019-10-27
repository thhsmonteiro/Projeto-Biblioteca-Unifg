/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrutura;

/**
 *
 * @author Paulo Victor
 */
public abstract class Pessoa {
    
    private String nome;
    private int cpf;
    private int rg;
    private String endereco;
    private int contato;
    
    public Pessoa(){
        
    }
    public Pessoa(String nome,int cpf, int contato){
        setNome(nome);
        setCpf(cpf);       
        setContato(contato);
        
    }
    public Pessoa(String nome,int cpf,String endereco, int contato){
        setNome(nome);
        setCpf(cpf);
        setEndereco(endereco);
        setContato(contato);
        
    }
    public Pessoa(String nome,String endereco, int contato,int rg){
        setNome(nome);
        setRg(rg);
        setEndereco(endereco);
        setContato(contato);
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
     * @return the cpf
     */
    public int getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the rg
     */
    public int getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(int rg) {
        this.rg = rg;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the contato
     */
    public int getContato() {
        return contato;
    }

    /**
     * @param contato the contato to set
     */
    public void setContato(int contato) {
        this.contato = contato;
    }
}
