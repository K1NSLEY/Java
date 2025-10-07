package br.com.fecaf.model;

public class Pessoa {
    private String nome, cpf, email;
    private int idade;


    //Construtor
    public Pessoa(String cpf) {
        System.out.println("Criou uma nova pessoa!");
        System.out.println("CPF DO VAGABUNDO: " + cpf);
        this.cpf = cpf;
    }

    public void Torcerdor() {
        System.out.println("A pessoa esta torcendo");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}