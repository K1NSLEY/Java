package br.com.fecaf.model;

import java.util.Scanner;


public class Triangulo {
    private double lado1, lado2, lado3;
    private Scanner scanner = new Scanner(System.in);

    //cadastrar lados do triângulo
    public void cadastrarTriangulo() {
        System.out.println("Informe o lado 1:");
        lado1 = scanner.nextDouble();

        System.out.println("Informe o lado 2:");
        lado2 = scanner.nextDouble();

        System.out.println("Informe o lado 3:");
        lado3 = scanner.nextDouble();
    }

    // Verificar se é válido
    public boolean ehValido() {
        return (lado1 < lado2 + lado3) &&
               (lado2 < lado1 + lado3) &&
               (lado3 < lado1 + lado2);
    }

    // Verificar se o triângulo é retângulo com Teorema;
    public boolean ehRetangulo() {
        double a = Math.max(lado1, Math.max(lado2, lado3));
        double b, c;

        if (a == lado1) { b = lado2; c = lado3; }
        else if (a == lado2) { b = lado1; c = lado3; }
        else { b = lado1; c = lado2; }

        return Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2);
    }

    // Verificar se o triângulo 3-4-5
    public boolean ehTresQuatroCinco() {
        // Coloca lados em um array
        double[] lados = {lado1, lado2, lado3};
        java.util.Arrays.sort(lados); // ordena em ordem crescente

        double a = lados[0];
        double b = lados[1];
        double c = lados[2];

        // Relação de múltiplo (usamos proporção)
        // Se a/b == 3/4 e a/c == 3/5, então é múltiplo de 3-4-5
        double proporcao1 = a / 3.0;
        double proporcao2 = b / 4.0;
        double proporcao3 = c / 5.0;

        // Usamos uma margem de erro para números decimais
        double epsilon = 0.0001;

        return Math.abs(proporcao1 - proporcao2) < epsilon &&
            Math.abs(proporcao1 - proporcao3) < epsilon;
}

    // Getters (caso precise exibir lados)
    public double getLado1() { return lado1; }
    public double getLado2() { return lado2; }
    public double getLado3() { return lado3; }
}
