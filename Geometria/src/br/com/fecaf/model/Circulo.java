package br.com.fecaf.model;
import java.util.Scanner;

public class Circulo {
    Scanner scanner = new Scanner(System.in);
    double raio, diametro, area, perimetro;
    String nome;

    public void cadastrarCirculo(){
        // Cadastrar Retangulo
        System.out.println("/*------------------------*/");
        System.out.println("/*   Cadastro Circulo   */");
        System.out.println("/*------------------------*/");
        System.out.println("Informe o raio: ");
        raio = scanner.nextDouble();
        System.out.println("Raio coletado com sucesso ");
        System.out.println("/*------------------------*/");


        // Calcular Area
        System.out.println("/*------------------------*/");
        System.out.println("/*   Calcular Area*/");
        area = Math.PI*(raio*raio);
        System.out.println("/        calculado/");


        // Calcular Perimetro
        System.out.println("/*------------------------*/");
        System.out.println("/*   Calcular Perimetro*/");
        perimetro = 2 * Math.PI * raio;
        System.out.println("/        calculado/");


        // Calcular diametro
        System.out.println("/*------------------------*/");
        System.out.println("/*   Calcular diametro*/");
        System.out.println("/*------------------------*/");
        perimetro = scanner.nextDouble();
        diametro = 2 * Math.PI * raio;
        System.out.println("/        calculado/");



    }
}
