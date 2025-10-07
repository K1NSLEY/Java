package br.com.fecaf.model;

public class Juiz extends Pessoa{

    public Juiz(String cpf) {
        super(cpf);
    }

    public void aplicarCartaoAmarelo() {
        System.out.println("O Juiz roubou para o flamengo !!");
    }

}