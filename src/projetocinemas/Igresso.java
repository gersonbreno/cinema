/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetocinemas;

/**
 *
 * @author gerso
 */
public class Igresso {
      private Sessao sessao;
      private Assento assento;
    private float preco;
    Filmes filme;
    private boolean reservado;

    public Igresso(Sessao sessao,Filmes filme, float preco) {
        this.sessao = sessao;
        this.assento = assento;
        this.preco = preco;
        this.reservado = false;
         this.sessao = sessao;
         this.filme = filme;
       
        
      
    }

   public Igresso(Sessao sessao) {
        
        this.sessao = sessao; // Ou inicialize com uma sessão padrão, se desejar
        this.assento = null; // Ou inicialize com um assento padrão, se desejar
       this.preco = preco; // Ou inicialize com um preço padrão, se desejar
        this.reservado = false;
        this.filme = filme;

   }

    public Assento getAssento() {
        return assento;
    }
    

    public Sessao getSessao() {
        return sessao;
    }

    public float getPreco() {
        return preco;
    }

    public boolean isReservado() {
        return reservado;
    }

  
  

  
    public void cancelarReserva() {
        if (reservado) {
            reservado = false;
            System.out.println("Reserva do ingresso cancelada com sucesso.");
        } else {
            System.out.println("O ingresso não está reservado.");
        }
    }
  public void teste(){
     System.out.println("Sessão: " + sessao.getHorario());
}

    public void gerarComprovante(int codico) {
     
   
    if (filme.getCodico() == codico) {
         System.out.println("Filme: " + sessao.getFilme().getNome());
       System.out.println("Sessão: " + sessao.getHorario());
        System.out.println("Preço: R$" + preco);
        System.out.println("Status da Reserva: " + (reservado ? "Reservado" : "Não Reservado"));
        
        System.out.println("Obrigado por sua compra!");
    }else{
        System.out.println("Erro ao ver comprovante de pagemento");
    }
    }
    
    
    
    
      public void reservarIngressoPorCodigo(int codigoDoFilme) {
        
       
if (!reservado) {
           System.out.println("Ingresso reservado com sucesso para o filme: "+filme.getNome()+ " Com o preço: "+filme.getGenero());
            reservado = true;
        } else  if(codigoDoFilme == filme.getCodico()) {
 System.out.println("O ingresso já foi reservado.");
        }
        else if(codigoDoFilme != filme.getCodico()){
            System.out.println("Erro ao tenta reserva ingresso codico invalido");
        }
    }

     public void comprarIngresso(int codico) {
         if (!reservado && codico == filme.getCodico()) {
              System.out.println("Ingresso comprado com sucesso!");
               System.out.println("Preço do ingresso: R$" + preco);
              reservado = true;
         } else {
              System.out.println("Ingresso Não pode ser comprado tente novamente");
         }
       
        
    }

    
        }


