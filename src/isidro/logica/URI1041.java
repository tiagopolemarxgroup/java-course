package isidro.logica;

import java.util.Scanner;

public class URI1041 {
    public static void main(String[] args) {

        //q1 x e y > 0
        //q2 x < 0 e y > 0
        //q3  x e y < 0
        //q4 x > 0 e y < 0
        Scanner s = new Scanner(System.in);
        double x, y, q1, q2, q3, q4;

        x = s.nextDouble();
        y = s.nextDouble();

        if(x == 0 && y == 0) {
            System.out.println("Origem");
        }else if(x == 0 && y != 0) {
            System.out.println("Eixo x");
        }else if(x !=0 && y == 0){
            System.out.println("eixo y");
        }else if(x > 0 && y > 0){
            System.out.println("q1");
        }else if(x < 0 && y > 0){
            System.out.println("q2");
        }else if(x < 0 && y > 0){
            System.out.println("q3");
        }else if(x> 0 && y < 0){
            System.out.println("q4");
        }
    }
}
