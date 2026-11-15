package secao01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int CodigoPeca1 = sc.nextInt();
        int NumeroDePecas1 = sc.nextInt();
        double ValorUnitario1 = sc.nextDouble();

        int Codigopeca2 = sc.nextInt();
        int NumeroDePecas2 = sc.nextInt();
        double ValorUnitario2 = sc.nextDouble();

        double ValorPagar = NumeroDePecas1 * ValorUnitario1 + NumeroDePecas2 * ValorUnitario2;

        System.out.printf("VALOR A PAGAR: %.2f%n", ValorPagar);

        sc.close();
    }
}
