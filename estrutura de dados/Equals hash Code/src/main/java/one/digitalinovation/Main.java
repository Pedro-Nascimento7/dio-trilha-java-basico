package one.digitalinovation;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Carro> listaCarro = new ArrayList<>();

        listaCarro.add(new Carro("Ford"));
        listaCarro.add(new Carro("Chevrolet"));
        listaCarro.add(new Carro("Fiat"));

        System.out.println(listaCarro.contains(new Carro("Ford")));
        System.out.println(new Carro("Ford").hashCode());
        System.out.println(new Carro("Chevrolet").hashCode());

        Carro carro1 = new Carro("Ford");
        Carro carro2 = new Carro("Ford");

        System.out.println(carro1.equals(carro2));
    }
}
