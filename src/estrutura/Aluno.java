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
public class Aluno extends Pessoa{
    
    private int matricula;
        
    public Aluno(String nome, int cpf, String endereco,  int contato, int matricula) {
        super(nome, cpf, contato);
        setMatricula(matricula);
    }

    
    public void pegarLivro(){
        
    }
    public void devolverLivro(){
        
    }
    public void multa(){
        
    }
    public void limiteLivro(){
        
    }

    /**
     * @return the matricula
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    
}
