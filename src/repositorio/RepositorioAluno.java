/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import estrutura.Aluno;
import java.util.ArrayList;

/**
 *
 * @author Sala 03
 */
public class RepositorioAluno {
    ArrayList<Aluno> repositorioAluno = new ArrayList<>(); //Arraylist que serve como banco de dados dos Alunos cadastrados
    
    public void Cadastro(Aluno aluno){        
        repositorioAluno.add(aluno);   
        System.out.println("Cadastrado com sucesso!!");
    }
    public void listarAluno(){
        for(Aluno Alunos : repositorioAluno){
           System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
           System.out.println("Nome do Aluno: " + Alunos.getNome());
           System.out.println("Matricula do Aluno: " + Alunos.getMatricula());
           System.out.println("CPF do Aluno:" + Alunos.getCpf());
           System.out.println("Contato do Aluno: " + Alunos.getContato());  
           System.out.println("Endereço do Aluno: " + Alunos.getEndereco());
           System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
           
        }        
    }
    
}
