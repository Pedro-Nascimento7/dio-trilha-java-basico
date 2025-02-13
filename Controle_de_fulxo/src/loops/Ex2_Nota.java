package loops;
/*Faça um programa que peça uma nota, entre zero e dez.
 * Mostra uma menssagem caso o valor seja inválido
 * e continue pedindo 
 * até que  o usuario informe um valor válido. 
 */

import java.util.Scanner;

public class Ex2_Nota {
   public static void main(String[] args) {
    Scanner Scan = new Scanner (System.in);

    int nota ;

    System.out.println("Nota: ");
    nota =  Scan.nextInt();

    while (nota < 0 | nota  > 10) {
        System.out.println("Nota Invalida! Digite novamente");
        nota = Scan.nextInt();
    }
   }
    
}
