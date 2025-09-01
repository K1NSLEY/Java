package br.com.fecaf;

import br.com.fecaf.model.Pessoa;

public class App {
    public static void main(String[] args) {
        System.out.println("Project Bank");

        //Instanciar Objeto Pessoa
        Pessoa pessoa1 = new Pessoa(40028922, "Giovanna");

        pessoa1.setCpf(666888667);

        long cpfTest = pessoa1.getCpf();
        System.out.println(cpfTest);

        pessoa1.setNome("Meu Amor");

        String nameTest = pessoa1.getNome();
        System.out.println(nameTest);





    }
}
