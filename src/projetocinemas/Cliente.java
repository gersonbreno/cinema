/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetocinemas;

import com.sun.nio.sctp.PeerAddressChangeNotification;
import java.util.ArrayList;

/**
 *
 * @author gerso
 */
public class Cliente {

 private String nome;
    private int idade;
    private String email;
    private String enderco;
    private int telefone;
    private int cpf;

    public Cliente() {
        this.nome = ""; // Ou inicialize com um nome padrão, se desejar
        this.idade = 0; // Ou inicialize com uma idade padrão, se desejar
        this.email = ""; // Ou inicialize com um email padrão, se desejar
        this.enderco = ""; // Ou inicialize com um endereço padrão, se desejar
        this.telefone = 0; // Ou inicialize com um telefone padrão, se desejar
        this.cpf = 0; // Ou inicialize com um CPF padrão, se desejar
    }

    public Cliente( String nome, int idade, String email, String enderco, int telefone, int cpf) {
  
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

    public void setCpf(int cpf) {
        this.cpf = cpf;
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

    @Override
    public String toString() {
        return "Cliente{" + " Nome=" + nome + ", idade=" + idade + ", email=" + email + ", enderco=" + enderco + ", telefone=" + telefone + ", cpf=" + cpf + '}';
    }
   

  

 
    

 
  
    
    


    
}
