package isidro.logica;

import java.util.Scanner;

public class URI1073 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, numero;

        n = s.nextInt();
        for (numero = 2; numero <= n; numero+=2){
            System.out.println(numero*numero);
        }


    }
}
