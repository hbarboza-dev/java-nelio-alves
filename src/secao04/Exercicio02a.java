package secao04;

import java.util.Scanner;

public class Exercicio02a {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n1 = sc.nextInt();

        int doubled = twice(n1);
        showResult(doubled);

        sc.close();
    }

    public static int twice(int a) {
        return a * 2;
    }

    public static void showResult(int value) {
        System.out.println("Result = " + value);
    }
}
