package br.com.fecaf.model;

public class Imc {

    public int peso;
    public double altura, imc;
    String statusImc;

    public void calcularImc () {
        System.out.println("Calculando IMC");
        imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + imc);

    }


    public void classificarImc () {
        System.out.println("Classificando IMC");
        if (imc < 18.5) {
            statusImc = "Abaixo do peso";
        } else  if (imc <= 24.99) {
            statusImc = "Normal";
        } else if ( imc <= 29.99) {
            statusImc = "Sobrepeso";
        } else {
            statusImc = "Obeso";
        }

        System.out.println("Seu status IMC é: " + statusImc);
    }

}





