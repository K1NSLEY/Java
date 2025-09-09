package br.com.fecaf;

import br.com.fecaf.controller.Menu;
import br.com.fecaf.model.Retangulo;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.executarMenu();
        System.out.println("----------------------------");
        System.out.println("/*   Cadastro Retângulo   */");
        System.out.println("----------------------------");
        // Instanciar um novo Retangulo
        Retangulo retangulo1 = new Retangulo();
        retangulo1.cadastrarRetangulo();
        retangulo1.calcularArea();
        retangulo1.calcularPerimetro();
        retangulo1.exibirInformacoes();


        Retangulo retangulo2 = new Retangulo();
        retangulo2.cadastrarRetangulo();
        retangulo2.calcularArea();
        retangulo2.calcularPerimetro();
        retangulo2.exibirInformacoes();

        if (retangulo1.obtemArea() > retangulo2.obtemArea()) {
            System.out.println(retangulo1.obtemNome() + " tem maior área.");
        } else if (retangulo1.obtemArea() < retangulo2.obtemArea()) {
            System.out.println(retangulo2.obtemNome() + " tem maior área.");
        } else {
            System.out.println("Os retângulos têm a mesma área.");
        }

        // Comparando perímetros
        if (retangulo1.obtemPerimetro() > retangulo2.obtemPerimetro()) {
            System.out.println(retangulo1.obtemNome() + " tem maior perímetro.");
        } else if (retangulo1.obtemPerimetro() < retangulo2.obtemPerimetro()) {
            System.out.println(retangulo2.obtemNome() + " tem maior perímetro.");
        } else {
            System.out.println("Os retângulos possuem o mesmo perímetro.");
        }




    }

}
