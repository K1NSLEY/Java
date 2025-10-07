package br.com.fecaf.model;

public class Jogador extends Pessoa {

    private int numeroCamisa;
    private String posicao;

    public Jogador(String cpf) {
        super(cpf);
        this.posicao = posicao;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
}
