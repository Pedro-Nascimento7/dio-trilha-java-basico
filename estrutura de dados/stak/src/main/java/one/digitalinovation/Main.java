package one.digitalinovation;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Carro> stakCarros = new Stack<>();

        stakCarros.push(new Carro("Ford"));
        stakCarros.push(new Carro("Chevrolet"));
        stakCarros.push(new Carro("Fiat"));

        System.out.println(stakCarros);
        System.out.println(stakCarros.pop());
        System.out.println(stakCarros);

        System.out.println(stakCarros.peek());
        System.out.println(stakCarros);

    }
}
