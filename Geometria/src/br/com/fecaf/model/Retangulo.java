package br.com.fecaf.model;
import java.util.Scanner;



public class Retangulo {
    //Atributos
    double lado1, lado2, area, perimetro;
    String nome;


    //Instancia Objeto Scanner para Coletar Dados
    Scanner scanner = new Scanner(System.in);

    //Método de cadastro de retângulo
    public void cadastrarRetangulo (){
        System.out.println("/*------------------------*/");
        System.out.println("/*   Cadastro Retângulo   */");
        System.out.println("/*------------------------*/");
        System.out.println("Informe o Lado 1: ");
        lado1 = scanner.nextDouble();
        System.out.println("Informe o Lado 2: ");
        lado2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Informe o nome: ");
        nome = scanner.nextLine(); // next pega apenas o primeiro valor
        System.out.println("/*------------------------*/");
    }
    //Método de calcular àrea
    public void calcularArea (){
        System.out.println("/*------------------------*/");
        System.out.println("/*     Àrea Retângulo     */");
        System.out.println("/*------------------------*/");
        area = lado1 * lado2;
        System.out.println("/* Cálculo Finalizado com Sucesso! ");
    }
    //Método de calcular Perímetro
    public void calcularPerimetro (){
        System.out.println("/*------------------------*/");
        System.out.println("/*     Àrea Perímetro      */");
        System.out.println("/*------------------------*/");
        perimetro = (lado1 * 2) + (lado2 * 2);
        System.out.println("/* Cálculo Finalizado com Sucesso! ");
    }
    //Método de Exibir infos
    public void exibirInformacoes (){
        System.out.println("/*------------------------*/");
        System.out.println("/*        Retângulo       */");
        System.out.println("/*------------------------*/");
        System.out.println("Nome: " + nome);
        System.out.println("Lado1: " + lado1);
        System.out.println("Lado2: " + lado2);
        System.out.println("Perimetro: " + perimetro);
        System.out.println("Area: " + area);
        System.out.println("/*------------------------*/");
    }
    public double obtemArea() {
        return area;
    }

    public double obtemPerimetro() {
        return perimetro;
    }

    public String obtemNome() {
        return nome;
    }


}
