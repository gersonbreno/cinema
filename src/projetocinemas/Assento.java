/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetocinemas;

/**
 *
 * @author gerso
 */
public class Assento {
    
    private int numero;
    private boolean reservado;

      public Assento() {
        this.numero = 0; // Ou inicialize com um número de assento padrão, se desejar
        this.reservado = false; // Ou inicialize como não reservado, se desejar
    }

   


    
    public Assento(int numero) {
        this.numero = numero;
        this.reservado = false; // Inicialmente, o assento não está reservado.
    }

    public int getNumero() {
        return numero;
    }

    public boolean isReservado() {
        return reservado;
    }

    public void reservar() {
        if (!reservado) {
            reservado = true;
            System.out.println("Assento " + numero + " foi reservado.");
        } else {
            System.out.println("O assento " + numero + " já está reservado.");
        }
    }

    public void cancelarReserva() {
        if (reservado) {
            reservado = false;
            System.out.println("Reserva do assento " + numero + " foi cancelada.");
        } else {
            System.out.println("O assento " + numero + " não está reservado.");
        }
    }

}