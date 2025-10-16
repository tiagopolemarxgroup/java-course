package isidro.logica;

import java.util.Scanner;

public class URI1021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int saqueInt, saqueDec;
        int q100, q50, q20, q10, q5,  q2, q1;
        int qt1, q050, q025, q010, q05, q01;
        int resto;

        double valorSaque = sc.nextDouble();

        saqueInt = (int) valorSaque;
        valorSaque = valorSaque - saqueInt;

        saqueDec = (int) valorSaque * 100;

        System.out.println();


    }
}
