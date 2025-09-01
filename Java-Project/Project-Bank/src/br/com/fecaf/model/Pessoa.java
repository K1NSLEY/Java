package br.com.fecaf.model;

public class Pessoa {
    //Atributos
    private String nome,email;
    private int idade;
    private long cpf,rg,telefone;

    //Isso é um construtor
    public Pessoa (long cpf, String nome){
        System.out.println("Criei um novo Objeto !!!");
        this.cpf = cpf;
        this.nome = nome;
    }

    //Getter - Setter
    //Get
    public long getCpf () {
        return cpf;
    }
    //Set
    public void setCpf (long cpf) {
        this.cpf = cpf;
    }

    //Get
    public String getNome () {
        return nome;
    }
    //Set
    public void setNome (String nome) {
        this.nome = nome;
    }
}
