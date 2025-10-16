package isidro.logica;

public class Teste {
    public static void main(String[] args) {

        int salara = 500;
        double comissao = 0.15;
        double totalreceber = salara += (salara * comissao);
        System.out.println((500 * 15) / 100);
        System.out.println("salara a receber: " + totalreceber);
    }
}
