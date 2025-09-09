package br.com.fecaf.controller;
import br.com.fecaf.model.Retangulo;

import java.util.Scanner;


public class Menu {
    Scanner scanner = new Scanner(System.in);
    Retangulo retangulo = new Retangulo();
    public void executarMenu(){
        boolean exit = false;
        while (!exit){

            System.out.println("/*********************************/");
            System.out.println("/*******         Menu       ******/");
            System.out.println("/*********************************/");
            System.out.println("/****** 1 - Retangulo       ******/");
            System.out.println("/****** 2 - Circulo       ********/");
            System.out.println("/****** 3 - Triangulo       ******/");
            System.out.println("/****** 4 - Sair       ***********/");
            System.out.println("/*********************************/");

            System.out.println("Escolha uma opção");
            int userOption = scanner.nextInt();

            switch (userOption){
                case 1:

                    boolean exitRetangulo = false;
                    while (!exitRetangulo){

                        System.out.println("/*********************************/");
                        System.out.println("/*******    Retangulo       ******/");
                        System.out.println("/*********************************/");
                        System.out.println("/****** 1 - Cadastrar Retangulo **/");
                        System.out.println("/****** 2 - calcular area       ***");
                        System.out.println("/****** 3 - Calcular Perimetro  **/");
                        System.out.println("/****** 4 - Exibir Informações   */");
                        System.out.println("/****** 5 - Retorar ao Menu  *****/");
                        System.out.println("/*********************************/");

                        System.out.println("Escolha uma opção");
                        int userOptionRetangulo = scanner.nextInt();

                        switch (userOptionRetangulo){

                            case 1:
                                retangulo.cadastrarRetangulo();
                                break;
                            case 2:
                                retangulo.calcularArea();
                                break;
                            case 3:
                                retangulo.calcularPerimetro();
                                break;
                            case 4:
                                retangulo.exibirInformacoes();
                                break;
                            case 5:
                                System.out.println("saindo...");
                                exitRetangulo = true;
                                break;
                            default:
                                System.out.println("retornar ao menu");
                        }
                    }



                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("kitando");
                    exit = true;
                    break;
                default:
                    System.out.println("esoclha uma opção valida");
            }
        }
    }
}
