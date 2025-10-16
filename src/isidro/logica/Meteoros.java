package isidro.logica;

import java.util.Scanner;

public class Meteoros {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x1, x2, y1,y2, x, y, n, contador =0;

    do {
        x1 = s.nextInt();
        x2 = s.nextInt();
        y1 = s.nextInt();
        y2 = s.nextInt();
        x = s.nextInt();
        y = s.nextInt();
        n = s.nextInt();

        for (int i = 0; i < n; i++) {
            x = s.nextInt();
            y = s.nextInt();

            if (x >= x1 && x <= x2 && y >= y2 && y <= y1) {
                contador++;
                System.out.println("Dentro da fazenda");
            } else {
                System.out.println("Fora da fazenda");
            }
        }

        System.out.println(contador);

    }while (!(x1 != 0 || x2 != 0 || y1 != 0 || y2 != 0));

    }
}
