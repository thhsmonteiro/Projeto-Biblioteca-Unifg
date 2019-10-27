/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrutura;

import java.util.Scanner;
import repositorio.RepositorioAluno;
import estrutura.Aluno;
import repositorio.RepositorioFuncionario;

/**
 *
 * @author Paulo Victor
 */
public class Funcionario extends Pessoa{
    Scanner leitor = new Scanner(System.in);
    RepositorioAluno repositorioAluno = new RepositorioAluno();
    RepositorioFuncionario repositorioFucionario = new RepositorioFuncionario();
    
    private int registro;
    
    
   
    public Funcionario() {        
    }
    public Funcionario(String nome, int cpf, String endereco, int contato, int registro) {
        super(nome, cpf, endereco, contato);
        setRegistro(registro);
    }    
    public void receberLivro(){
        
    }
    /********************************************************************************/
    ////////////////////////////////Inicio Livro//////////////////////////////////////
    public void cadastrarLivro(){
                
    }
    public void listarLivro(){
                
    }    
    ////////////////////////////////Fim Livro//////////////////////////////////////
    /******************************************************************************/
    /******************************************************************************/
    ////////////////////////////////Inicio Aluno//////////////////////////////////////
    public void cadastrarAluno(Aluno alunoParaSerCadastrado){             
            repositorioAluno.Cadastro(alunoParaSerCadastrado);
                            
    }
    public void ListarAluno(){      
            repositorioAluno.listarAluno();
    }    
    ////////////////////////////////Inicio Aluno//////////////////////////////////////
    /******************************************************************************/
    /******************************************************************************/
    ////////////////////////////////Inicio Funcionario//////////////////////////////////////
    public void cadastrarFuncionario(Funcionario funcionarioParaSerCadastrado){   
         repositorioFucionario.cadastrarFuncionario(funcionarioParaSerCadastrado);
         
         
    }
    public void listarFuncionarios(){
        repositorioFucionario.listarFuncionarios();
    }
    ////////////////////////////////Fim Funcionario//////////////////////////////////////
    /******************************************************************************/
    /******************************************************************************/
    ////////////////////////////////Inicio Funcao entre Funcionario e aluno//////////////
    public void aplicarMulta(){
        
    }
    public void entregarLivro(){
        
    }
    ////////////////////////////////Fim Funcao entre Funcionario e aluno//////////////////
    /******************************************************************************/
    
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
