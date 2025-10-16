package isidro.logica;

import java.util.Scanner;

public class ExemploDeVariaveis {
    public static void main(String args[]){
        int anosEmDias, qtdAnos, qtdMeses, qtdDias, resto;

        Scanner teclado = new Scanner(System.in);
        anosEmDias = teclado.nextInt();
        qtdAnos = anosEmDias / 365;
        resto = anosEmDias % 365;
        qtdMeses = resto / 30;
        qtdDias = resto % 30;

        System.out.println(qtdAnos + " +anos");
        System.out.println(qtdMeses + qtdAnos+ " +meses");
        System.out.println(qtdDias + " dias");






    }
}
