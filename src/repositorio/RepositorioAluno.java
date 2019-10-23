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
    ArrayList<Aluno> repositorioAluno = new ArrayList<>();
    
    public void Cadastro(Aluno aluno){        
        repositorioAluno.add(aluno);        
    }
    public void listarAluno(){
        for(Aluno Alunos : repositorioAluno){
           System.out.println(Alunos);
        }        
    }
    
}
