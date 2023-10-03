/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetocinemas;

/**
 *
 * @author gerso
 */
import java.util.Scanner;
import java.util.ArrayList;
public class GerenteCinema {
    Scanner ler = new Scanner(System.in);
    ArrayList<Filmes> lista;
    ArrayList<Cliente> lista1;

    public GerenteCinema() {
        lista = new ArrayList<Filmes>();
        lista1 = new ArrayList<Cliente>();
    }
    
    public void AdiconarFilmes(Filmes fi){
        for (Filmes f : this.lista) {
            if (fi.getNome() == f.getNome()) {
                System.out.println("Erro não e possivel cadastrar Filme com nomes iguais");
                return;
            }
        }
        lista.add(fi);
        System.out.println("==============================================================");
        System.out.println("Filme adicionado com sucesso");
    }
    public void RemoverFilme(String nome){
         for (Filmes f : lista) {
            if (f.getNome().equals(nome) ) {
               
                System.out.println("o Filme foi removido com sucesso "+f);
                lista.remove(f);
                return;
            }
            
            }
             System.out.println("Nome não encontrado tente novamente");
    }
    public void BuscaFilme(String nome){
          for (Filmes f : lista) {
              if (f.getNome().equals(nome)) {
                  System.out.println("Filme encontrado: "+f);
                  return;
              }
            }
        System.out.println("o Filme nao foi encontrado tente novamente");
    }
    public void listaTodosFilme(){
        for (Filmes f : lista) {
            
            System.out.println(f);
           
        }
    }
       public void menuEdiçaoFilme(){
        System.out.println("=============Oque voce deseja editar==========================================");
        System.out.println("1 - nome");
        System.out.println("2 - genero");
        System.out.println("3 - duracao");
        System.out.println("4 - diretor");
        System.out.println("7 sair");
    }
    public void EditaFilme(String nome){
         int op;
          for (Filmes f : lista) {
              if (f.getNome().equals(nome)){
                  do {
                  System.out.println(" Digite o novo nome que voce deseja editar");
                  menuEdiçaoFilme();
                  op = ler.nextInt();
                  switch (op) {
                      case 1:
                         System.out.println(" Digite o novo nome que voce deseja editar"); 
                          nome = ler.next();
                          f.setNome(nome);
                          break;
                      case 2:
                          System.out.println(" Digite o novo genero que voce deseja editar"); 
                          String genero = ler.next();
                          f.setGenero(genero);
                          break;
                      case 3:
                            System.out.println(" Digite o nova duraçao que voce deseja editar"); 
                          String duracao = ler.next();
                          f.setDuracao(duracao);
                          break;
                      case 4:
                            System.out.println(" Digite o novo codico que voce deseja editar"); 
                          int codico = ler.nextInt();
                         f.setCodico(codico);
                          break;
                          
                      case 7:
                          System.out.println("saindo.....");
                          break;
                      default:
                          throw new AssertionError();
                  }
                 
                   } while (op != 7); 
                  System.out.println("Dados CFilme editado: "+f);
                  return;
              }
            }
        System.out.println("O Filme nao encontrado nao foi encontrado tente novamente");
    } 
     
     
    //////////////////////////////////////////////////////////////////////////////////////////
    //area de cadastro do cliente
    
     public void CadastrarCliente(Cliente cl){
        for (Cliente c : this.lista1) {
            if (cl.getCpf() == c.getCpf()) {
                System.out.println("Erro não e possivel cadastrar Cliente com dois CPF iguais");
                return;
            }
        }
        lista1.add(cl);
        System.out.println("==============================================================");
        System.out.println("Cadastro realizado com Sucesso");
    }
     
     
       public void RemoverCliente(int cpf){
         for (Cliente c : lista1) {
            if (c.getCpf() == cpf ) {
               
                System.out.println("O Cliente foi removido com sucesso "+c);
                lista.remove(c);
                return;
            }
            
            }
             System.out.println("Cpf não encontrado tente novamente");
    }
    public void BuscaCliente(int cpf){
          for (Cliente c : lista1) {
              if (c.getCpf() == cpf) {
                  System.out.println("Cliente encontrado: "+c);
                  return;
              }
            }
        System.out.println("O Cliente nao foi encontrado tente novamente");
    }
    public void listaTodosClintes(){
        for (Cliente c : lista1) {
            
            System.out.println(c);
           
        }
    }
    public void menuEdiçao(){
        System.out.println("=============Oque voce deseja editar==========================================");
        System.out.println("1 - cpf");
        System.out.println("2 - nome");
        System.out.println("3 - idade");
        System.out.println("4 - email ");
        System.out.println("5 - telfone");
     
        System.out.println("7 sair");
    }
 
     public void EditarCliente(int cpf){
         int op;
          for (Cliente c : lista1) {
              if (c.getCpf() == cpf) {
                  do {
                  System.out.println(" Digite o novo cpf que voce deseja editar");
                  menuEdiçao();
                  op = ler.nextInt();
                  switch (op) {
                      case 1:
                         System.out.println(" Digite o novo cpf que voce deseja editar"); 
                          cpf = ler.nextInt();
                          c.setCpf(cpf);
                          break;
                      case 2:
                          System.out.println(" Digite o novo nome que voce deseja editar"); 
                          String nome = ler.next();
                          c.setNome(nome);
                          break;
                      case 3:
                            System.out.println(" Digite o nova idade que voce deseja editar"); 
                          int idade = ler.nextInt();
                          c.setIdade(idade);
                          break;
                      case 4:
                            System.out.println(" Digite o novo email que voce deseja editar"); 
                          String email = ler.next();
                          c.setEmail(email);
                          break;
                          
                      case 5:
                            System.out.println(" Digite o novo telefone que voce deseja editar"); 
                          int telefone = ler.nextInt();
                          c.setTelefone(telefone);
                          
                          break;
                          
                      
                          
                      case 7:
                          System.out.println("saindo.....");
                          break;
                      default:
                          throw new AssertionError();
                  }
                 
                   } while (op != 7); 
                  System.out.println("Dados Cliente editado: "+c);
                  return;
              }
            }
        System.out.println("O Cliente nao foi encontrado tente novamente");
    } 
     
     
     
     
     
     ///////////////menu do sistema
    
    public void menuFilme(){
        System.out.println("1 - Cadastrar Filme, Ingresso, sala e sessao ");
        System.out.println("2 - cadastra Cinema ");
        System.out.println("3 - Buscar Filme");
        System.out.println("4 - Remover Filme");
        System.out.println("5 - Lista todos os Filmes");
        System.out.println("6 - Busca Cliente");
        System.out.println("7 - Remover Cliente");
        System.out.println("8 - Editar Filme");
        System.out.println("9 - Lista todos os clientes");
        System.out.println("10 - Voltar");
    }
    public void menuPrincipal(){
        System.out.println("=================================================================================");
        System.out.println("======================Bem vindo===================================================");
        System.out.println("===================================================================================");
        System.out.println("1- para area admintrativa do Cinema");
        System.out.println("2 - para area do cliente");
        System.out.println("3 - para sair do sistema");
        System.out.println("===================================================================================");
    }
    public  void menuCliente(){
        System.out.println("1 - ralizar cadastro");
        System.out.println("2 - Busca Filme");
        System.out.println("3 - excluir contar");
        System.out.println("4 - reservar Ingresso");
        System.out.println("5 -  cancelar reserva Ingresso ");
        System.out.println("6 - Gerarar Comprovante de Ingresso");
        System.out.println("7 -Resevar Assento  ");
        System.out.println("8 - cancelar Reserva de assento");
        System.out.println("9 - reserva sala");
        System.out.println("10 -cancelar reserva da sala");
        System.out.println("11 - verificar sala disponivel");
        System.out.println("12 - comprar ingresso");
        System.out.println("0 - sair do menu");
    }
    public  void menuClienteCadastro(){
      
        System.out.println("1 - ralizar cadastro");
        System.out.println("2 - Busca Filme");
        System.out.println("3 - excluir conta");
        System.out.println("4 - busca Ingresso");
        System.out.println("5 - excluir ingresso ");
        System.out.println("6 - ver todos os Ingressos disponivel");
        System.out.println("7 -  exiber todas as sala");
        System.out.println("8 - busca sala");
        System.out.println("9 - exiber todas as sessao");
        System.out.println("10 -  busca sessao");
        System.out.println("11 - exibir todos os assentos");
        System.out.println("12 - busca assento");
        System.out.println("0 - sair do menu");
    
    }
    
}
