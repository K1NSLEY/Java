package br.com.fecaf.model;
import java.util.Scanner;

public class Retangulo {
    //atributos
    double lado1, lado2, area, perimetro;
    String nome;

    Scanner scanner = new Scanner(System.in);

    public void cadastrarRetangulo()
    {
        System.out.println("/************************************");
        System.out.println("/**       Cadastro Retângulo       **");
        System.out.println("/************************************");
        System.out.println("/Informe o lado1: ");
        lado1 = scanner.nextDouble();
        System.out.println("/Informe o lado2: ");
        lado2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("/informe o nome");
        nome = scanner.nextLine();
        System.out.println("/************************************");


    }

    // metodo para calcular area
    public void calcularArea()
    {
        System.out.println("/************************************");
        System.out.println("/**           Area Retangulo       **");
        System.out.println("/************************************");
        area = lado1 * lado2;
        System.out.println("/* Calculo Finalizado com sucesso *");
    }

    public void calcularPerimetro()
    {
        System.out.println("/************************************");
        System.out.println("/**      Perimetro Retangulo       **");
        System.out.println("/************************************");
        perimetro = lado1 * 2 + lado2 * 2;
        System.out.println("/* Calculo Finalizado com sucesso *");
    }

    //metodo para exibir as informacoes
    public void exibirInformacoes()
    {
        System.out.println("/************************************");
        System.out.println("/**               Retangulo        **");
        System.out.println("/************************************");
        System.out.println("Nome: " + nome);
        System.out.println("Lado1: " + lado1);
        System.out.println("Lado2: " + lado2);
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
        System.out.println("/************************************");

    }




}
