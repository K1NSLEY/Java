package br.com.fecaf.model;

import java.util.Scanner;

public class Triangulo {

    //Atributos
    public double base, lado1, lado2, altura, area, perimetro;

    //Importar dados
    Scanner scanner = new Scanner(System.in);

    public boolean cadastrarTriangulo(){
        System.out.println("/*************************************/");
        System.out.println("/*             Triângulo             */");
        System.out.println("/*************************************/");
        System.out.print("/* Informe a base: ");
        base = scanner.nextDouble();
        System.out.print("/* Informe o lado 1: ");
        lado1 = scanner.nextDouble();
        System.out.print("/* Informe o lado 2: ");
        lado2 = scanner.nextDouble();
        System.out.println("/* Informe a altura: ");
        altura = scanner.nextDouble();
        System.out.println("/* Triângulo cadastrado com sucesso   */");
        System.out.println("/*************************************/");

        return true;
    }

    public void calcularArea(){
        System.out.println("/********************************/");
        System.out.println("/* Calculando Area              */");
        System.out.println("/********************************/");

        area = (base * altura)/2;
        System.out.println("/ A area é :"+ area);
        System.out.println("/*********************************/");

    }

    public void calcularPerimetro(){
        System.out.println("/**********************************/");
        System.out.println("/* Calcular Perimetro             */");
        System.out.println("/**********************************/");

        perimetro = base + lado1 + lado2;
        System.out.println("O perimetro é: "+ perimetro);
        System.out.println("/***********************************/");

    }

    public void definirTipo(){
        System.out.println("/**********************************/");
        System.out.println("/* Definir Tipo                   */");
        System.out.println("/**********************************/");

        //Equilatero - Isosceles - Escaleno

        if(base == lado1 && base == lado2) {
            System.out.println("Esse triângulo é Equilátero...");
        } else if(base != lado1 && base != lado2 && lado1 != lado2){
            System.out.println("Esse triângulo é Escaleno...");
        } else{
            System.out.println("Esse triângulo é Isosceles...");
        }


    }

    public void trianguloRetangulo(){
        

    }


}
