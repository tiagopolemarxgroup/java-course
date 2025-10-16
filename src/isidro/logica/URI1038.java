package isidro.logica;

import java.util.Scanner;

public class URI1038 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Entre com a cod do produto");
        int cod = s.nextInt();
        System.out.println("Entre com a quantidade de itens");
        double qtd = s.nextDouble();

        double total = 0;

        if(cod == 1){
            total = 4.00 * qtd;
            System.out.println("Total: RS" + total);
        }else if(cod == 2){
            total = 4.50 * qtd;
            System.out.println("Total: RS" + total);
        }else if(cod == 3){
            total = 5.00 * qtd;
            System.out.println("Total: RS" + total);
        }else if(cod == 4){
            total = 2.00 * qtd;
            System.out.println("Total: RS" + total);
        }else if(cod == 5){
            total = 1.30 * total;
            System.out.println("Total: RS" + total);
        }else {
            System.out.println("Cod invalido");
        }
    }
}
