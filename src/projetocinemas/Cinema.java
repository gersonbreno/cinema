/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetocinemas;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 *
 * @author gerso
 */
public class Cinema {
  private String nome;
    private String endereco;
    private List<Sessao> sessoes;

    public Cinema(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.sessoes = new ArrayList<>();
    }

    public Cinema() {
        this.endereco = "";
        this.nome = "";
        
    }

    
    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public List<Sessao> getSessoes() {
        return sessoes;
    }

    public void adicionarSessao(Sessao sessao) {
        sessoes.add(sessao);
    }

    public void removerSessao(Sessao sessao) {
        sessoes.remove(sessao);
    }

    public void listarSessoes() {
        System.out.println("Sessões em exibição no cinema " + nome + ":");
        for (Sessao sessao : sessoes) {
            System.out.println("- " + sessao.getFilme()+ " às " + sessao.getHorario() + " Horas");
        }
    }

    public void listarIngressosVendidos() {
        System.out.println("Ingressos vendidos no cinema " + nome + ":");
        for (Sessao sessao : sessoes) {
            List<Igresso> ingressos = sessao.getIngressosVendidos();
            for (Igresso ingresso : ingressos) {
                System.out.println("- Filme: " + sessao.getFilme().getNome()  + ", Preço: R$" + ingresso.getPreco());
            }
        }
    }
    
    
}
