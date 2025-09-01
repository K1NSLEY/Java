package br.com.fecaf.model;

import java.util.Scanner;

public class Pessoa {
    public String nome, statusImc;
    public int idade, peso;
    public long cpf,rg;
    public double altura;

    //Instancia Biblioteca Scanner
    Scanner scanner = new Scanner(System.in);


    //Cadastrar Pessoa

    public void cadastrarPessoa() {
        System.out.println("/******************************");
        System.out.println("/*   Cadatro Pessoa   */");
        System.out.println("/*******************/");
        System.out.println("Informe o seu nome: ");
        nome = scanner.nextLine();
        System.out.println("Informe a sua idade: ");
        idade = scanner.nextInt();
        System.out.println("Informe o seu CPF: ");
        cpf = scanner.nextLong();
        System.out.println("Informe seu RG: ");
        rg = scanner.nextLong();
        System.out.println("Informe o seu peso: ");
        peso = scanner.nextInt();
        System.out.println("Informe a sua altura");
        altura = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Pessoa cadastrada com Sucesso");
        System.out.println("/**********************/");
    }
    public void exibirInformacoes(){
        System.out.println("/*******************/");
        System.out.println("/*   Informações Pessoa */");
        System.out.println("/***********************/");
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(peso);
        System.out.println(altura);
        System.out.println(statusImc);
        System.out.println("/*****************/");
    }


}
