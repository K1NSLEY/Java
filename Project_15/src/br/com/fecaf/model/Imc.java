package br.com.fecaf.model;

public class Imc {
    // Atributos da minha class
    public int[] peso;
    public double altura, imc;
    public String statusImc;

    // Metodo - Acao
    public void calcularImc () {
        System.out.println("Calculando IMC");
        imc = peso / (altura * altura);
        System.out.println("O seu IMC é: " + imc);
    }
    public void classificarImc(){
        if (imc < 18.5){
            statusImc = "Passando fome, favor começar fisioterapia e feito encaminhamento para nutricionista";
        } else if (imc > 18.5 && imc < 24.99){
            statusImc = "Vitamina C, nem fede nem cheira";
        } else if (imc <= 29.99){
            statusImc = "Acima do peso";
        } else {
            statusImc = "Extra Gordo";
        }
        System.out.println("Você está " + statusImc);
    }






}
