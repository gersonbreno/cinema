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
public class Sessao {
   
   private Filmes filme;
    private Sala sala;
    private String horario;
    private float preco;
    private List<Igresso> ingressosVendidos;

public Sessao(Filmes filmes, Sala sala) {
        this.filme = filmes; // Ou inicialize com um filme padrão, se desejar
        this.sala = sala; // Ou inicialize com uma sala padrão, se desejar
        this.horario = ""; // Ou inicialize com um horário padrão, se desejar
        this.ingressosVendidos = new ArrayList<>();
    }

    
    
    public Sessao(Filmes filme, Sala sala, String horario) {
        this.filme = filme;
        this.sala = sala;
        this.horario = horario;
       
      
        this.ingressosVendidos = new ArrayList<>();
    }

    public Filmes getFilme() {
        return filme;
    }

    public Sala getSala() {
        return sala;
    }

    public String getHorario() {
        return horario;
    }

    public float getPreco() {
        return preco;
    }

    public List<Igresso> getIngressosVendidos() {
        return ingressosVendidos;
    }

    public void setFilme(Filmes filme) {
        this.filme = filme;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void setIngressosVendidos(List<Igresso> ingressosVendidos) {
        this.ingressosVendidos = ingressosVendidos;
    }

    public boolean venderIngresso() {
        if (sala.temAssentosDisponiveis()) {
            Igresso ingresso = new Igresso(this,preco);
            ingressosVendidos.add(ingresso);
            sala.reservarAssento(sala.getNumero());
            return true;
        }
        return false;
    }

   

   
}
