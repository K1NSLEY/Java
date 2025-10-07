package br.com.fecaf;

import br.com.fecaf.model.Animal;
import br.com.fecaf.model.Cachorro;

public class App {

    public static void main(String[] args) {
        System.out.println("/****************************/");
        System.out.println("/          Pet Java         */");
        System.out.println("/****************************/");

        Animal animal = new Animal();
        animal.cadastrarAnimal();

        Cachorro cachorro = new Cachorro();
        cachorro.cadastrarAnimal();

        animal.emitirSom();
        cachorro.emitirSom();
    }

}
