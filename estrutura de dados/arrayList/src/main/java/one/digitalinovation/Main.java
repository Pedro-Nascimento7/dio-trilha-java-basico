package one.digitalinovation;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

       List<Carro> listaCarros = new ArrayList<>();

       listaCarros.add(new Carro("Ford"));
       listaCarros.add(new Carro("Chevrolet"));
       listaCarros.add(new Carro("Fiat"));
       listaCarros.add(new Carro("Volkswagem"));

       System.out.println(listaCarros.contains(new Carro("Ford")));

       System.out.println(listaCarros.get(2));

        System.out.println(listaCarros.indexOf(new Carro("Fiat")));

        System.out.println(listaCarros.remove(2));
        System.out.println(listaCarros);


    }
}
