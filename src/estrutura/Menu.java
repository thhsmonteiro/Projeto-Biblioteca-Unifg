/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrutura;

import java.util.Scanner;

/**
 *
 * @author Paulo Victor
 */
public class Menu {
    Scanner leitor = new Scanner(System.in);
    int escolha;
    String escolhaLetra;
    
  
    int matriculaAluno;
    int idLivro;
    
    Funcionario func = new Funcionario();
   

    
    public void visualizarMenu(){       
        
        System.out.println("Bem-Vindo ao Sistema Biblioteca feliz!!!");
        System.out.println(" ");
        System.out.println("Escolha uma das opção abaixo do menu!!");
        System.out.println(" ");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Editar");
        System.out.println("3 - Emprestar livro");
        System.out.println("4 - Devolução livro");
        System.out.println("5 - Listar");
        System.out.println("6 - Sair");
        System.out.print("Digite a opção: ");
        escolha = leitor.nextInt();
        
        if(escolha>=1 && escolha<=5){
            switch(escolha){
                case 1:
                    exibirSubmenuCadastrar();
                    break;
                case 2:
                    exibirSubmenuEditar();
                    break;
                case 3:
                    exibirSubmenuEmprestar();
                    break;
                case 4:
                    exibirSubmenuDevolução();
                    break;
                case 5:
                    exibirSubmenuListar();
                    break;
            }
        }else if(escolha == 5){
            
        }
        else{
            while (!(escolha>=1 && escolha<=4)) { 
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=--=");
                System.out.println("Opção invalida!!");
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=--=");
                System.out.print("Digite a Opção novamente: ");
                escolha = leitor.nextInt();
            }
        }
        
    }
    private void exibirSubmenuCadastrar(){
        System.out.println("Cadastro");
        System.out.println("-=-=-=-=-=");
        System.out.println("1 - Aluno");
        System.out.println("2 - Funcionario");
        System.out.println("3 - Livro");
        System.out.println("4 - Voltar");
        
        System.out.print("Digite a opção: ");
        escolha = leitor.nextInt();
        
        if(escolha>=1 && escolha<=3){
            switch(escolha){
                case 1:
                    //////////////////aluno////////////////////////////////////
                        String nomeAluno;
                        int cpfAluno;
                        String enderecoAluno;
                        int contatoAluno;
                        int matriculaAluno;   
                        /////////////////////////////////////////////////////////////
                        System.out.print("Digite o nome do Aluno: ");
                        nomeAluno = leitor.next();
                        
                        System.out.print("Digite o cpf do Aluno: ");
                        cpfAluno = leitor.nextInt();
                        
                        System.out.print("Digite a matricula do Aluno: ");
                        matriculaAluno = leitor.nextInt();

                        System.out.print("Digite o contato do Aluno: ");
                        contatoAluno = leitor.nextInt();                        
                        
                        System.out.print("Digite o endereço do Aluno: ");
                        enderecoAluno = leitor.next();

                                Aluno aluno = new Aluno(nomeAluno, cpfAluno,enderecoAluno, contatoAluno, matriculaAluno);
                                func.cadastrarAluno(aluno); 
                                visualizarMenu();
                    break;
                case 2:
                     ///////////////////funcionario////////////////////////    
                        int idLivro;
                        String nomeFun;
                        int cpfFun;
                        String enderecoFun;
                        int contatoFun;
                        int registroFun;    
                    /////////////////////////////////////////////////////////////
                        System.out.println("Nome so Funcionário:");
                        nomeFun = leitor .next();
                        
                        System.out.println("Registro do Funcionário:");
                        registroFun = leitor.nextInt();
                        
                        System.out.println("Cpf do Funcionário:");
                        cpfFun = leitor.nextInt();
                        
                        System.out.println("Endereço do Funcionário:");
                        enderecoFun = leitor.next();
                        
                        System.out.println("Contado do Funcionário:");
                        contatoFun = leitor.nextInt();                        

                                Funcionario fun = new Funcionario(nomeFun, cpfFun, enderecoFun, contatoFun, registroFun);
                                func.cadastrarFuncionario(fun);
                                visualizarMenu();
                    break;
                case 3:
                    func.cadastrarLivro();
                    break;               
            }
        }else if(escolha == 4){
            visualizarMenu();
        }
        else{
            while (!(escolha>=1 && escolha<=4)) { 
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=--=");
                System.out.println("Opção invalida!!");
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=--=");
                System.out.print("Digite a Opção novamente: ");
                escolha = leitor.nextInt();
            }
        }
    }   
    private void exibirSubmenuEditar(){        
        System.out.println("Editar");
        System.out.println("-=-=-=-=-=");
        System.out.println("1 - Aluno");
        System.out.println("2 - Funcionario");
        System.out.println("3 - Livro");
        System.out.println("4 - Voltar");
        
        System.out.print("Digite a opção: ");
        escolha = leitor.nextInt();
        
        if(escolha>=1 && escolha<=3){
            switch(escolha){
                case 1:
                    exibirSubmenuCadastrar();
                    break;
                case 2:
                    exibirSubmenuEditar();
                    break;
                case 3:
                    exibirSubmenuEmprestar();
                    break;
                
            }
        }else if(escolha == 4){
            visualizarMenu();
        }
        else{
            while (!(escolha>=1 && escolha<=4)) { 
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=--=");
                System.out.println("Opção invalida!!");
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=--=");
                System.out.print("Digite a Opção novamente: ");
                escolha = leitor.nextInt();
            }
        }
        
    }
    private void exibirSubmenuEmprestar(){
        System.out.println("Emprestar Livro");
        System.out.println("-=-=-=-=-=");
        System.out.println("Deseja continuar?(s = sim ou n = não)");
        escolhaLetra = leitor.nextLine();
        if(escolhaLetra.equals("s")){
           System.out.println("Digite a Matricula do Aluno:");
            matriculaAluno = leitor.nextInt();        
            System.out.println("Digite a ID do Livro:");
            idLivro = leitor.nextInt();            
        }      
        else{
            visualizarMenu();
        }
    }
    private void exibirSubmenuDevolução(){
        System.out.println("Devolução Livro");
        System.out.println("-=-=-=-=-=");
        System.out.println("Deseja continuar?");
        System.out.println("Deseja continuar?(s = sim ou n = não)");
        escolhaLetra = leitor.nextLine();
        
         if(escolhaLetra.equals("s")){
            System.out.println("Digite a Matricula do Aluno:");
            matriculaAluno = leitor.nextInt();        
            System.out.println("Digite a ID do Livro:");
            idLivro = leitor.nextInt();            
        }      
        else{
            visualizarMenu();
        }
    }
    private void exibirSubmenuListar(){
        String voltar;
        System.out.println("Listar");
        System.out.println("-=-=-=-=-=");
        System.out.println("1 - Aluno");
        System.out.println("2 - Funcionario");
        System.out.println("3 - Livro");
        System.out.println("4 - Voltar");
        
        System.out.print("Digite a opção: ");
        escolha = leitor.nextInt();
        
        if(escolha>=1 && escolha<=3){
            switch(escolha){
                case 1:
                    func.ListarAluno();
                    System.out.println("--------------------------------");
                    System.out.println("Aperte qualquer tecla para voltar");
                    System.out.println("Digite: ");
                    voltar = leitor.next();
                    
                        if(voltar.length()>0){
                            visualizarMenu();
                        }
                    
                    break;
                case 2:
                    func.listarFuncionarios();
                    System.out.println("--------------------------------");
                    System.out.println("Aperte qualquer tecla para voltar");
                    System.out.println("Digite: ");
                    voltar = leitor.next();
                    
                        if(voltar.length()>0){
                            visualizarMenu();
                        }
                    break;
                case 3:
                    func.listarLivro();
                    System.out.println("--------------------------------");
                    System.out.println("Aperte qualquer tecla para voltar");
                    System.out.println("Digite: ");
                    voltar = leitor.next();
                    
                        if(voltar.length()>0){
                            visualizarMenu();
                        }
                    break;
            }
        }else if(escolha == 4){
            visualizarMenu();
        }else{
            
        }
        
    }
}

 