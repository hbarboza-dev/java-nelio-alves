package secao02;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int item = sc.nextInt();
        int quantidade = sc.nextInt();

        double total = 0;
        if (item == 1) {
            total = quantidade * 4.00;
        } else if (item == 2) {
            total = quantidade * 4.50;
        } else if (item == 3) {
            total = quantidade * 5.00;
        } else if (item == 4) {
            total = quantidade * 2.00;
        } else if (item == 5) {
            total = quantidade * 1.50;
        } else {
            System.out.println("Item não cadastrado");
        }

        System.out.printf("Total: R$ %.2f%n", total);

        sc.close();
    }
}
