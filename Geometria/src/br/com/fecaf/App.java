package br.com.fecaf;

import br.com.fecaf.model.Retangulo;

public class App {
    public static void main(String[] args) {
        System.out.println("----------------------------");
        System.out.println("/*   Cadastro Retângulo   */");
        System.out.println("----------------------------");
        // Instanciar um novo Retangulo
        Retangulo retangulo = new Retangulo();
        retangulo.cadastrarRetangulo();
        retangulo.calcularArea();
        retangulo.calcularPerimetro();
        retangulo.exibirinformacoes();
    }
}
