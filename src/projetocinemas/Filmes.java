/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetocinemas;

/**
 *
 * @author gerso
 */
public class Filmes {
    private String nome;
    private String genero;
    private String duracao;
    private int codico;
    private float preco;

    public float getPreco() {
        return preco;
    }
public Filmes() {
        this.nome = ""; // Ou inicialize com um nome padrão, se desejar
        this.genero = ""; // Ou inicialize com um gênero padrão, se desejar
        this.duracao = ""; // Ou inicialize com uma duração padrão, se desejar
        this.codico = 0; // Ou inicialize com um código padrão, se desejar
        this.preco = 0.0f; // Ou inicialize com um preço padrão, se desejar
    }
    public Filmes(String nome, String genero, String duracao, int codico) {
        this.nome = nome;
        this.genero = genero;
        this.duracao = duracao;
        this.codico = codico;
        
    }


    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public String getDuracao() {
        return duracao;
    }

    public int getCodico() {
        return codico;
    }

    

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public void setCodico(int codico) {
        this.codico = codico;
    }

    

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Filmes{" + "nome=" + nome + ", genero=" + genero + ", duracao=" + duracao + ", Codico=" + codico+ '}';
    }
    // adicinar um array list de filme com o crud
}
