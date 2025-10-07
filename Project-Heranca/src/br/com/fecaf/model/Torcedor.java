package br.com.fecaf.model;

public class Torcedor extends Pessoa {

    public Torcedor(String cpf) {
        super(cpf);
    }

    public void  comprarIngresso(){
        System.out.println("O torcedor pagou caro para ver o jogo");
        System.out.println("O torcedor apanhou da policia");
    }

}