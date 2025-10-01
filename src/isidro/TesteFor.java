package isidro;

import java.util.Scanner;

public class TesteFor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um valor");
        int valor = s.nextInt();
        int n;

        /*
        for(n = 1; n <= valor; n++){
            System.out.println("Contador: " + n);
            if(n == 5){
                break;
            }
        }

        System.out.println("for---------------------------------");
        for(n = 1; n <= valor; n++){
            if(n==5){
                continue;
            }
            System.out.println("Contador: " + n);
        }
         */

        System.out.println("while-------------------------------");
        n = 1;
        while(n <= valor){
            if(n==5){
                continue;
            }
            System.out.println("Contador: " + n);
            n++;

        }

    }
}
