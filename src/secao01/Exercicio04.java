package secao01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int Nfuncionario = sc.nextInt();
        int HorasTrabalhadas = sc.nextInt();
        double ValorHora = sc.nextDouble();
        double salario = HorasTrabalhadas * ValorHora;

        System.out.println("NUMBER = " + Nfuncionario);
        System.out.printf("SALARY = U$ %.2f%n", salario);
        sc.close();

    }
}
