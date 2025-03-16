import java.util.Scanner;

public class desafioQuitanda {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
       Double morangoKg = input.nextDouble();
       Double macasKg = input.nextDouble();

//TODO: Implemente as condições necessárias para retornar o preço a ser pago pelo cliente, conforme a tabela de preços do seu Zé:
      Double precoMorangoAte5kg = 2.50;
      Double precoMorangoAcima5kg = 2.20;
      Double precoMacaAte5kg = 1.80;
      Double precoMacaAcima5kg = 1.50;
      
      Double precoMorango = (morangoKg <= 5) ? morangoKg * precoMorangoAte5kg : morangoKg * precoMorangoAcima5kg;
      Double precoMaca = (macasKg <= 5) ? macasKg * precoMacaAte5kg : macasKg * precoMacaAcima5kg;
      
      Double total = precoMorango + precoMaca;
      
       if (morangoKg + macasKg > 8 || total > 25){
         Double desconto = total * 0.10;
         total-=desconto;
       }
       System.out.println(total);
       
       input.close();
    }
}