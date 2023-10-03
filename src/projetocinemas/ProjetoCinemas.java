/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetocinemas;

/**
 *
 * @author gerso
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ProjetoCinemas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
       
      

        
                
        int numeroAssento = 0;

        Scanner ler = new Scanner(System.in);
        int op = 0;
        int opFilme = 0;
        int opCliente = 0;
            GerenteCinema gc = new GerenteCinema();
       
    
       Filmes f = new Filmes("black clove", "açao", "2", 01);
        Sala s = new Sala(10, 5);
        Sessao se = new Sessao(f, s, "2");
   //     Igresso i = new Igresso(se, 10);
        
       // s.reservarAssento(11);
       s.reservarAssento(4);
         s.temAssentosDisponiveis();
          s.cancelarReservaAssento(6);
   
       
Filmes filme = null;
Sala sala = null;
Sessao sessao = null;
Igresso ingresso = null;
Assento assento = null;
        do {
               try {
                
            
            gc.menuPrincipal(); //menu principal
            
              Sala salas = new Sala();
        //       Igresso ingressos = new Igresso();
               Assento assentos = new Assento();
            op = ler.nextInt();
            switch (op) {
                case 1:
                    //usar um do whilhe aqui

                    //varivel de admintrativo
                    String nome = null,
                     genero = null,
                     duracao = null,
                     direto = null;
                    do {

                        gc.menuFilme();   // menu administrativo do cimema
                        opFilme = ler.nextInt();
                        switch (opFilme) {
                            case 1:
                                System.out.println("digite o nome do Filme: ");
                                nome = ler.next();
                                System.out.println("digite o genero do Filme: ");
                                genero = ler.next();
                                System.out.println("digite a Duraçao do Filme em horas e minutos:  ");
                                duracao = ler.next();
                                System.out.println("digite o codico do Filme: ");
                                int codico = ler.nextInt();
                                filme = new Filmes(nome, genero, duracao, codico);
                                gc.AdiconarFilmes(filme);

                                System.out.println("digite o numero da sala: ");
                                int numero = ler.nextInt();
                                System.out.println("digite a capacidade da sala: ");
                                int capacidade = ler.nextInt();
                                sala = new Sala(numero, capacidade);
                                        
                                  

                                System.out.println("digite a hora do filme: ");
                                String horafilme = ler.next();

                               sessao = new Sessao(filme, sala, horafilme); // verifiacar o preco

                                System.out.println("digite o preço do Ingresso: ");
                                float precoinresso = ler.nextFloat();

                               ingresso = new Igresso(sessao, filme, precoinresso);

                                break;

                            case 2:
                                System.out.println("digite o nome do seu Cinema: ");
                                String nomecinema = ler.next();
                                System.out.println("digite o endereco do seu Cinema: ");
                                String enderecocinema = ler.next();

                                Cinema cinema = new Cinema(nomecinema, enderecocinema);
                                break;
                            case 3:
                                System.out.println(" Digite o nome do Filme que voce deseja Buscar: ");
                                String nomes = ler.next();
                                gc.BuscaFilme(nome);
                                break;
                            case 4:
                                System.out.println(" Digite o nome do Filme que voce deseja remover: ");
                                String nomermv = ler.next();
                                gc.RemoverFilme(nomermv);

                                break;

                            case 5:
                                gc.listaTodosFilme();
                                break;
                            case 6:
                                System.out.println(" Digite o cpf do cliente que voce deseja Buscar: ");
                                int cpf = ler.nextInt();
                                gc.BuscaCliente(cpf);
                                break;
                            case 7:
                                System.out.println(" Digite o cpf do cliente que voce deseja remover: ");
                                int cpfrmv = ler.nextInt();
                                gc.RemoverCliente(cpfrmv);
                                break;
                            case 8:
                                System.out.println(" Digite o nome do Filme que voce deseja editar: ");
                                String nomeedit = ler.next();
                                gc.EditaFilme(nomeedit);
                                break;
                            case 9:
                                gc.listaTodosClintes();

                                break;
                            case 10:
                                System.out.println("Vontando...");
                                break;
                            default:
                                throw new AssertionError();

                        }
                    } while (opFilme != 10);
                    break;
                case 2:
                    gc.menuCliente();   // menu cliente
                    opCliente = ler.nextInt();
                    switch (opCliente) {
                        case 1:
                            System.out.println("Informe seu nome: ");
                            String nomeCL = ler.next();
                            System.out.println("Informe sua idade: ");
                            int idade = ler.nextInt();
                            System.out.println("Informe seu enderco de email: ");
                            String email = ler.next();
                            System.out.println("Informe seu telefone: ");
                            int telefone = ler.nextInt();
                            System.out.println("Informe seu CPF: ");
                            int cpf = ler.nextInt();
                            Cliente cliente = new Cliente(nomeCL, idade, email, telefone, cpf);
                            gc.CadastrarCliente(cliente);

                            break;

                        case 2:
                            System.out.println(" Digite o nome do Filme que voce deseja Buscar: ");
                            String nomes = ler.next();
                            gc.BuscaFilme(nomes);
                            break;

                        case 3:
                            System.out.println(" Digite seu cpf para confirma a exclusao da conta: ");
                            int cpfrmv = ler.nextInt();
                            gc.RemoverCliente(cpfrmv);

                            break;

                        case 4:
                           if (ingresso != null) {
                               System.out.println("digite o codico do filme");
                               int codfilme = ler.nextInt();
                              ingresso.reservarIngressoPorCodigo(codfilme);
            } else {
                System.out.println("o admnistrado nao cadostrou nenhum ingresso ainda ");
            }
                           
                           

                            break;
                        case 5:
                          //    Igresso ingressos = new Igresso();
                               if (ingresso != null) {
                               ingresso.cancelarReserva();
            } else {
                System.out.println("o admnistrado nao cadostrou nenhum ingresso ainda ");
            }
                           
                          
                            break;

                        case 6:
                              if (ingresso != null) {
                                    System.out.println("digite o codico do filme");
                               int codfi = ler.nextInt();
                            ingresso.gerarComprovante(codfi);
                            
                            
            } else {
                System.out.println("o admnistrado nao cadastrou nenhum ingresso ainda ");
            }
                            
                            break;

                        case 7:
                            System.out.println(" Digite o numero do assento que voce deseja: ");
                            numeroAssento = ler.nextInt();
                            assento = new Assento(numeroAssento);
                            assento.reservar();
                            
                            break;

                        case 8:
                            
                            if (assento != null) {
                            assentos.cancelarReserva();
            } else {
                System.out.println("Você precisa reservar um assento primeiro na opção 7.");
            }
           /// break;
                            //assentos.cancelarReserva();
                            break;

                        case 9:
                          if (sala != null) {
                             sala.reservarAssento(numeroAssento);
            } else {
                System.out.println("Você precisa reservar um assento ");
            }
                         
                            break;

                        case 10:
                             if (assento != null) {
                             sala.cancelarReservaAssento(numeroAssento);
            } else {
                System.out.println("Você precisa reservar um assento ");
            }
                         
                           
                            break;

                        case 11:
                             if (sala != null) {
                              sala.temAssentosDisponiveis();
            } else {
                System.out.println("Você precisa reservar um assento ");
            }
                           
                            break;
                        case 12:
                             if (ingresso != null) {
                            System.out.println(" Digite o numero do assento que voce deseja: ");
                          int  compra = ler.nextInt();
                            ingresso.comprarIngresso(compra);
                              } else {
                System.out.println("o admnistrado nao cadastrou nenhum ingresso ainda ");
            }
                            break;
                        default:
                            throw new AssertionError();
                    }
                    break;

                case 3:
                    System.out.println("saindo...");
                    break;
                default:
                    throw new AssertionError();
            }
} catch (ArithmeticException | InputMismatchException | ArrayIndexOutOfBoundsException | AssertionError | java.lang.NullPointerException e) {
    System.out.println("erro ao inserir dados tente novamente");
                ler.nextLine();
            }
        } while (op != 3);
    }

}
