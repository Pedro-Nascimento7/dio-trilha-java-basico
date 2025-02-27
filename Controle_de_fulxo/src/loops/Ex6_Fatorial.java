package loops;

import java.util.Scanner;

/*
 * Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usúario.
 * Ex.: 5! = 120 (5 x 4 x 3 x 2 x 1)
 */
public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;

        System.out.print(fatorial+"! = ");
        for (int i = fatorial ; i >= 1 ; i--){
            multiplicacao = multiplicacao *i;
        }

        System.out.println("Resultado: "+multiplicacao);

    }
}
