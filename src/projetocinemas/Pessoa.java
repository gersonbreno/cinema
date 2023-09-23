/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetocinemas;

/**
 *
 * @author gerso
 */
public abstract class   Pessoa {
    private String nome;
    private int idade;
    private String email;
    private String enderco;
    private int telefone;
    private int cpf;

    public Pessoa(String nome, int idade, String email, String enderco, int telefone, int cpf) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.enderco = enderco;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }

    public String getEnderco() {
        return enderco;
    }

    public int getTelefone() {
        return telefone;
    }

    public int getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEnderco(String enderco) {
        this.enderco = enderco;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", email=" + email + ", enderco=" + enderco + ", telefone=" + telefone + ", cpf=" + cpf + '}';
    }
    
    
}

