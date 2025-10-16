package isidro.logica;

import java.util.Scanner;

public class URI1064 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int positivo = 0;
        double media, valor,  soma = 0;


        for(int i = 0; i <= 6; i++){
            System.out.println("Digite um valor");
            valor = s.nextDouble();
            if(valor > 0){
                soma += valor;
                positivo++;
            }
        }

        media = soma / positivo;

        System.out.printf("media : %.1f \n", media);

    }
}
