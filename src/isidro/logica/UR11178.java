package isidro.logica;

import java.util.Scanner;

public class UR11178 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double n[] = new double[100];

        n[0] = s.nextDouble();
        for(int i = 1; i < 100; i++){

            n[i] = n[i-1] / 2;
            System.out.printf("n[%d] = %.4f\n", i,  n[i]);
        }
    }
}
