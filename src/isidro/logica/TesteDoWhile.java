package isidro.logica;

import java.util.Scanner;

public class TesteDoWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um valor");
        int valor = s.nextInt();

        int n = 1;
        
        do{
            System.out.println("Contador: " + n);
            n++;
        }while(n <= valor);
    }
}
