/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import estrutura.Funcionario;
import java.util.ArrayList;

/**
 *
 * @author Paulo Victor
 */
public class RepositorioFuncionario {
    ArrayList<Funcionario> func  = new ArrayList<>(); //Arraylist que serve como banco de dados dos funcionarios cadastrados
    
    public void cadastrarFuncionario(Funcionario funcionario){
        func.add(funcionario);    
        System.out.println("Funcionario cadastrado com sucesso!!");
        
    }
    public void listarFuncionarios(){
        for(Funcionario funcionariosCadastrados : func){
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("Nome do Funcionario: "+ funcionariosCadastrados.getNome());
            System.out.println("Cpf do Funcionario " + funcionariosCadastrados.getCpf());
            System.out.println("Registro do Funcionario " + funcionariosCadastrados.getRegistro());
            System.out.println("Contato do Funcionario "+ funcionariosCadastrados.getContato());
            System.out.println("Endereco do Funcionario" + funcionariosCadastrados.getEndereco());
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        }
    }
    
    
}
