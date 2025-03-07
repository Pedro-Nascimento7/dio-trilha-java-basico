

import java.io.IOException;
import java.util.Scanner;
public class desafio {
    


    
        public static void main(String[] args)  throws IOException {
            Scanner sc = new Scanner(System.in);

            String AN1,AN2,AN3;
    
            AN1 = sc.nextLine().toLowerCase();// para transforma em minuscula
            AN2 = sc.nextLine().toLowerCase();
            AN3 = sc.nextLine().toLowerCase();
    
            //TODO: Implemente as condição necessária para que seja verificado que tipo de animal é:
            //Dica: Você pode utilizar o método equals para realizar comparações.
    
            String animal = identificaAnimal(AN1, AN2,AN3);
    
            if (animal != null) {
                System.out.println(animal);
            } else {
                System.out.println("Animal não identificado com as características fornecidas.");
            }
    
            sc.close();
        }
        public static String identificaAnimal (String AN1, String AN2, String AN3) {
            if (AN1.equals("vertebrado")) {
                if (AN2.equals("ave")) {
                    if (AN3.equals("carnivoro")) {
                        return "aguia";
                    } else if (AN3.equals("onivoro")) {
                        return "pomba";
                    }
                } else if (AN2.equals("mamifero")) {
                    if (AN3.equals("onivoro")) {
                        return "homem";
                    } else if (AN3.equals("herbivoro")) {
                        return "vaca";
                    }
                }
            } else if (AN1.equals("invertebrado")) {
                if (AN2.equals("inseto")) {
                    if (AN3.equals("hematofago")) {
                        return "pulga";
                    } else if (AN3.equals("herbivoro")) {
                        return "lagarta";
                    }
                } else if (AN2.equals("anelideo")) {
                    if (AN3.equals("hematofago")) {
                        return "sanguessuga";
                    } else if (AN3.equals("onivoro")) {
                        return "minhoca";
                    }
                }
            }
            return null; // Animal não encontrado
        }
    }
    