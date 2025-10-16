package isidro.logica;

import java.util.Scanner;

public class URI1181 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int e[][] = new int[n][n];

        for (int l = 0; l < n; l++) {
            for (int c = 0; c < n; c++) {
                e[l][c] = s.nextInt();
            }
        }

        int somaRef = 0;
        for (int c = 0; c < n; c++) {
            somaRef += e[0][c];
        }

        boolean qm = true;
        for (int l = 1; l < n && qm == true; l++) {
            int somaLinha = 0;
            for(int c=0; c<n; c++){
                somaLinha = e[l][c];
            }
            if(somaLinha != somaRef){
                qm = false;
            }

        }
        for(int c=0; c<n && qm == true; c++){
            int somaColuna = 0;
            for(int l=0; l<n; l++){
                somaColuna += e[l][c];
            }
            if(somaColuna != somaRef){
                qm = false;
            }
        }
        if(qm){
            System.out.println("Sim");
        }else{
            System.out.println("Não");
        }
    }
}