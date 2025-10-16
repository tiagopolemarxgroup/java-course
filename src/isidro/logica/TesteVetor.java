package isidro.logica;

import java.util.Scanner;

public class TesteVetor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String vetor[];

        vetor = new String[10];

        System.out.println("10 String diferentes");
        for(int pos=0; pos < vetor.length; pos++){
            vetor[pos] = s.nextLine();
        }

        System.out.println("-----------------------");
        for(int pos=0; pos < vetor.length; pos++){
            System.out.println("vetor["+pos+"]= "+vetor[pos]);
        }



    }
}
