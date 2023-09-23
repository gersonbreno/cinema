/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetocinemas;

/**
 *
 * @author gerso
 */
import java.util.ArrayList;
import java.util.List;
public class Sala {
 private int numero;
    private int capacidade;
    private String tipo;
    private List<Assento> assentos;

     public Sala() {
        this.numero = 0; // Ou inicialize com um número de sala padrão, se desejar
        this.capacidade = 0; // Ou inicialize com uma capacidade padrão, se desejar
        this.tipo = ""; // Ou inicialize com um tipo padrão, se desejar
       
   }
    

    public Sala(int numero, int capacidade) {
        this.numero = numero;
        this.capacidade = capacidade;
     
        this.assentos = new ArrayList<>();

        // Inicializar os assentos da sala
        for (int i = 1; i <= capacidade; i++) {
            Assento assento = new Assento(i);
            assentos.add(assento);
        }
    }

    public int getNumero() {
        return numero;
    }

    public int getCapacidade() {
        return capacidade;
    }

   

    public List<Assento> getAssentos() {
        return assentos;
    }

    public boolean reservarAssento(int numeroAssento) {
        for (Assento assento : assentos) {
            if (assento.getNumero() == numeroAssento) {
                if (!assento.isReservado()) {
                    assento.reservar();
                    //System.out.println("assento resavado com sucesso");
                    return true; // Assento reservado com sucesso.
                } else {
                    System.out.println("nao e possivel reserva o assento ");
                    return false; // O assento já está reservado.
                }
            }
        }
        return false; // Assento não encontrado na sala.
    }

    public boolean cancelarReservaAssento(int numeroAssento) {
        for (Assento assento : assentos) {
            if (assento.getNumero() == numeroAssento) {
                if (assento.isReservado()) {
                    assento.cancelarReserva();
                    System.out.println("reserva cnacelada");
                    return true; // Reserva do assento cancelada com sucesso.
                } else {
                    return false; // O assento não está reservado.
                }
            }
        }
        return false; // Assento não encontrado na sala.
    }
 
    
    
    public boolean temAssentosDisponiveis() {
    for (Assento assento : assentos) {
        if (!assento.isReservado()) {
            System.out.println("assento disponivel");
            return true; // Encontrou um assento disponível.
        }
    }
        System.out.println("assento indisponivel");
    return false; // Não encontrou assentos disponíveis.
}
}
