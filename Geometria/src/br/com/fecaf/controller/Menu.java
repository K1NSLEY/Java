package br.com.fecaf.controller;

import br.com.fecaf.model.Triangulo;
import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);

    public void executarMenu() {
        Triangulo triangulo = new Triangulo();
        int opcao;

        do {
            System.out.println("\n===== MENU TRIÂNGULO =====");
            System.out.println("1 - Cadastrar Triângulo");
            System.out.println("2 - Verificar se é válido");
            System.out.println("3 - Verificar se é retângulo");
            System.out.println("4 - Verificar se é do tipo 3-4-5");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    triangulo.cadastrarTriangulo();
                    break;
                case 2:
                    if (triangulo.ehValido())
                        System.out.println("O triângulo é válido.");
                    else
                        System.out.println("O triângulo NÃO é válido.");
                    break;
                case 3:
                    if (triangulo.ehRetangulo())
                        System.out.println("O triângulo é RETÂNGULO.");
                    else
                        System.out.println("O triângulo NÃO é retângulo.");
                    break;
                case 4:
                    if (triangulo.ehTresQuatroCinco())
                        System.out.println("O triângulo é do tipo 3-4-5.");
                    else
                        System.out.println("O triângulo NÃO é do tipo 3-4-5.");
                    break;
                case 0:
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
}
