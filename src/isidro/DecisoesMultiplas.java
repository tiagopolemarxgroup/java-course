package isidro;

import java.util.Scanner;

public class DecisoesMultiplas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double n1, n2, media;

        System.out.println("Nota 1");
        n1 = s.nextDouble();
        System.out.println("Nota 2");
        n2 = s.nextDouble();

        media = (n1 + n2) / 2;

        if(media < 0){
            System.out.println("Digite um valor valido");
        }
        else if( media < 5){
            System.out.println("Reprovado: media ->" + media);
        }else if(media == 5){
            System.out.println("Recuperação: media :" + media);
        }else if(media > 5 || media <= 7){
            System.out.println("Aprovado mas mediano: " + media);
        }else {
            System.out.println("Aluno acima da media" + media);
        }

    }
}
