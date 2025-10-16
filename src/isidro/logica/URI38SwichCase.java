package isidro.logica;

import java.util.Scanner;

public class URI38SwichCase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cod, qtd;
        double total;

        cod = s.nextInt();
        qtd = s.nextInt();

        switch (cod){
            case 1:
                total = qtd * 4.00;
                System.out.printf("TOTAL: %.2f", total);
                break;
            case 2:
                total = qtd * 4.50;
                System.out.printf("TOTAL: %.2f", total);
                break;
            case 3:
                total = qtd * 5.00;
                System.out.printf("TOTAL: %.2f", total);
                break;
            case 4:
                total = qtd * 2.00;
                System.out.printf("TOTAL: %.2f", total);
                break;
            case 5:
                total = qtd * 1.30;
                System.out.printf("TOTAL: %.2f", total);
                break;
            default:
                System.out.println("Codigo invalido");
        }



    }
}
