package isidro.logica;

import java.util.Scanner;

public class URI1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite o valor do seu salario: ");

        double salario = sc.nextDouble();

        System.out.println("Digite o valor das vendas: ");
        double vendas = sc.nextDouble();
        double comissao = (vendas * 15)/100;
        double totalreceber = (salario + comissao);
        System.out.printf("salarario a receber: %.2f ", totalreceber);
        System.out.println();
    }
}
