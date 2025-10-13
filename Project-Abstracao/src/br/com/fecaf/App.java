package br.com.fecaf;


import br.com.fecaf.model.Carro;

public class App {
    public static void main(String[] args) {
        System.out.println("Exemplo Abstração");

        Carro carro = new Carro("Hyundai", "Civic", 2024);
        carro.setCilindradas(2000);

        carro.exibirInformacoes();
    }
}