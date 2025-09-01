package br.com.fecaf.controller;

import br.com.fecaf.model.Circulo;
import br.com.fecaf.model.Retangulo;

import java.util.Scanner;

public class Menu {

    public void executarMenu(){

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit){
            System.out.println("/***********************************/");
            System.out.println("/*                Menu             */");
            System.out.println("/***********************************/");
            System.out.println("/* 1 - Retângulo                   */");
            System.out.println("/* 2 - Circulo                     */");
            System.out.println("/* 3 - Triângulo                   */");
            System.out.println("/* 4 - Sair                        */");
            System.out.println("/***********************************/");

            System.out.print("Informe a opção desejada: ");

            int userOption = scanner.nextInt();

            switch (userOption) {
                case 1:

                    boolean validaRetangulo = false;

                    Retangulo retangulo = new Retangulo();

                    boolean exitRetangulo = false;

                    while(!exitRetangulo) {

                        System.out.println("/***********************************/");
                        System.out.println("/*           Retângulo              */");
                        System.out.println("/************************************/");
                        System.out.println("/* 1 - Cadastar                     */");
                        System.out.println("/* 2 - Calcular Area                */");
                        System.out.println("/* 3 - Calcular Perimetro           */");
                        System.out.println("/* 4 - Validar Quadrado             */");
                        System.out.println("/* 5 - Sair                         */");
                        System.out.println("/************************************/");

                        System.out.print("Informe a opção desejada: ");

                        int userOptionRetangulo = scanner.nextInt();





                        switch (userOptionRetangulo){
                            case 1:
                                validaRetangulo = retangulo.cadastrarRetangulo();
                                break;
                            case 2:
                                if (validaRetangulo) {
                                    retangulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um Retângulo...");
                                }
                                break;
                            case 3:
                                if (validaRetangulo) {
                                retangulo.calcularPerimetro();
                                }else {
                                    System.out.println("Cadastre um Retângulo...");
                                }
                                break;
                            case 4:
                                if (validaRetangulo) {
                                    retangulo.validarQuadrado();
                                }else {
                                    System.out.println("Cadastre um Retângulo...");
                                }
                                break;
                            case 5:
                                System.out.println("Retornando ao Menu...");
                                exitRetangulo = true;
                                break;
                            default:
                                System.out.println("Escolha um opção valida...");
                        }

                    }
                    break;
                case 2:

                    boolean validaCirculo = false;

                    Circulo circulo = new Circulo();

                    boolean exitCirculo = false;

                    while(!exitCirculo) {

                        System.out.println("/***********************************/");
                        System.out.println("/*           Circulo              */");
                        System.out.println("/************************************/");
                        System.out.println("/* 1 - Cadastar                     */");
                        System.out.println("/* 2 - Calcular Area                */");
                        System.out.println("/* 3 - Calcular Perimetro           */");
                        System.out.println("/* 4 -  Exibir  Circulo              */");
                        System.out.println("/* 5 - Sair                         */");
                        System.out.println("/************************************/");

                        System.out.print("Informe a opção desejada: ");

                        int userOptionCirculo = scanner.nextInt();





                        switch (userOptionCirculo){
                            case 1:
                                validaCirculo = circulo.cadastrarCirculo();
                                break;
                            case 2:
                                if (validaCirculo) {
                                    circulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um Circulo...");
                                }
                                break;
                            case 3:
                                if (validaCirculo) {
                                    circulo.calcularPerimetro();
                                }else {
                                    System.out.println("Cadastre um Circulo...");
                                }
                                break;
                            case 4:
                                if (validaCirculo) {
                                    circulo.exibirCirculo();
                                }else {
                                    System.out.println("Cadastre um Circulo...");
                                }
                                break;
                            case 5:
                                System.out.println("Retornando ao Menu...");
                                exitCirculo = true;
                                break;
                            default:
                                System.out.println("Escolha um opção valida...");
                        }

                    }

                    break;
                case 3:
                    System.out.println("Feature in Development");
                    break;
                case 4:
                    System.out.println("Saindo...");
                    exit = true;
                    break;
                default:
                    System.out.println("Escolha uma opção válida...");
            }

        }

    }

}
