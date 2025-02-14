package arrays;

import java.util.Random;

/*
 * Faça um programa que leia 20 números inteiros aleatórios (entre 0 a 100) armazene-os em um vetor.
 * Ao final mostre os números e os seus sucessores.
 */
public class Ex3_NumerosAleatorio {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorio = new int[20]; 
        
        for(int i =0; i < numerosAleatorio.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorio[i] = numero;
        }
        System.out.print("Antecessor dos Numeros Aleatorios: ");
        for (int numero : numerosAleatorio) {
            System.out.print((numero - 1)+ " ");
        }
        System.out.print("\nAqui estão os Numeros Aleatorios: ");
        for (int numero : numerosAleatorio) {
            System.out.print(numero + " ");
        }
        
        System.out.print("\nSucessores dos Numeros Aleatorios: ");
        for (int numero : numerosAleatorio) {
            System.out.print((numero + 1)+ " ");
        }


    }
}