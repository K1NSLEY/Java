package br.com.fecaf.model;

public class Carro extends Veiculo {
    private int cilindradas;

    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }


    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Cilindradas: " + cilindradas);
    }

    // Get and Set
    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}