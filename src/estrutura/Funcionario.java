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
public class Funcionario extends Pessoa{

    private int registro;
    
    public Funcionario(String nome, int cpf, String endereco, int contato, int registro) {
        super(nome, cpf, endereco, contato);
        setRegistro(registro);
    }
    public void entregarLivro(){
        
    }
    public void receberLivro(){
        
    }
    public void cadastrarLivro(){
        
        
    }
    public void cadastrarAluno(Aluno aluno){       
       
    }
    public void aplicarMulta(){
        
    }

    /**
     * @return the registro
     */
    public int getRegistro() {
        return registro;
    }

    /**
     * @param registro the registro to set
     */
    public void setRegistro(int registro) {
        this.registro = registro;
    }
    
}
