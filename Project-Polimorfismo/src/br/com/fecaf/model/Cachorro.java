package br.com.fecaf.model;
import java.util.Scanner;
public class Cachorro extends Animal {

    private  String apelido;

    @Override
    public  void cadastrarAnimal(){
        System.out.println("Informe o Apelido do cachorro:");
        apelido = scanner.nextLine();
        super.cadastrarAnimal();
    }

    @Override
    public void emitirSom(){
        System.out.println("AUUUUUUU! o " + apelido + " Está muito feliz!");
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
}
