import br.com.fecaf.model.Imc;

public class App {
    public static void main(String[] args) {
        System.out.println("**************************");
        System.out.println("/*        Projeto       */");
        System.out.println("**************************");

        // Instanciar Objeto

        Imc imc = new Imc();
        // Set valores nos atributos
        imc.peso = new int[]{170, 60};
        imc.altura = 1.75;
        //execução do método
        imc.calcularImc(Imc.peso[1]);
        imc.classificarImc(2);


    }
}

