package br.com.fecaf.model;

import java.util.Scanner;

public class Animal {
    private String nome, rg;
    private int idade;

    Scanner scanner = new Scanner(System.in);


    public void cadastrarAnimal (){
        System.out.println("/****************************/");
        System.out.println("/*          Cadastro        */");
        System.out.println("/****************************/");
        System.out.println("Informe o nome: ");
        nome = scanner.nextLine();
        System.out.println("Informe a idade: ");
        idade = scanner.nextInt();
        System.out.println("Informe o registro: ");
        rg = scanner.nextLine();
        scanner.nextLine();
    }

    public void emitirSom() {
        System.out.println("O animal está emitindo som!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
