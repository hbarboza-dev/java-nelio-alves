package secao03;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int v1 = sc.nextInt();
            int v2 = sc.nextInt();

            if (v2 == 0) {
                System.out.println("Divisão impossível");
            } else {
                double divisao = (double) v1 / v2;
                System.out.printf("%.1f%n", divisao);
            }
        }

        sc.close();
    }
}
