package br.com.fecaf.model;

abstract class Veiculo {
    private String marca, modelo;
    private int ano;

    // Construtor
    public Veiculo (String marca, String modelo, int ano) {
        System.out.println("Você acaba de gerar um new Veiculo");
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Metodo Abstrato
    public abstract int calcularConsumo();


    // Aqui vamos aplicar polimorfismo
    public void exibirInformacoes () {
        System.out.println("Informações Veiculo");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }


    // Getters and Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}