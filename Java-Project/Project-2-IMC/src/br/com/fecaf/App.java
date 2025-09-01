package br.com.fecaf;

import br.com.fecaf.model.Imc;
import br.com.fecaf.model.Pessoa;

public class App {


    public static void main(String[] args) {
        System.out.println("Calculadora IMC");

      //Instacia new Pessoa
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        // Cadastra Pessoa 1
        pessoa1.cadastrarPessoa();

        // Cadastra Pessoa 2
        pessoa2.cadastrarPessoa();

        //Instancia Objeto IMC
        Imc imc = new Imc();

        // Calcular IMC
        imc.calcularImc(pessoa1.peso, pessoa1.altura);

        pessoa1.statusImc = imc.classificarImc();

        pessoa1.exibirInformacoes();

        // Calcular IMC pessoa 2
        imc.calcularImc(pessoa2.peso,pessoa2.altura);

        pessoa2.statusImc = imc.classificarImc();

        pessoa2.exibirInformacoes();


    }

}
