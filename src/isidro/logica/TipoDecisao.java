package isidro.logica;

import java.util.Scanner;

public class TipoDecisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();

        if(valor >= 0){
            System.out.println("Positivo");
        }else{
            System.out.println("Negativo");
        }

        System.out.println("fim");

    }
}
