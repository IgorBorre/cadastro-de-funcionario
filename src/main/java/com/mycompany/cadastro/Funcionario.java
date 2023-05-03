
package com.mycompany.cadastro;

public class Funcionario {
   private String nome;
   private String endereco;
   private String cpf;
   private String nascimento;

    public Funcionario(String nome, String endereco, String cpf, String nascimento) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.nascimento = nascimento;
    }   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }
    
    @Override
    public String toString() {
        return "Nome: " +nome + " Endereço: " +endereco + " CPF: " +cpf + " Data de nascimento: " +nascimento;
    }
}

