package br.com.fecaf;
import br.com.fecaf.model.Imc;

public class App {

    public static void main(String[] args) {
        System.out.println("/*************************/");
        System.out.println("/****    Project IMC     */");
        System.out.println("/*************************/");

        Imc imc = new Imc();
        imc.peso = 60;
        imc.altura = 1.84;
        imc.calcularImc();
        imc.classificarImc();

        Imc imc2 = new Imc();
        imc2.peso = 60;
        imc2.altura = 1.82;
        imc2.calcularImc();
        imc2.classificarImc();

    }

}