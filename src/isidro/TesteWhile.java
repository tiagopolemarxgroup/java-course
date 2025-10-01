package isidro;

import java.util.Scanner;

public class TesteWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um valor");
        int valor = s.nextInt();

        int n = 1;
        while(n <= valor){
            System.out.println("Contando vaslor: "+n);
            n++;
        }
    }
}
