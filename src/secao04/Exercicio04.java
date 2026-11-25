package secao04;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int evenCount = countEven(n1, n2, n3);

        showResult(evenCount);

        sc.close();
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int countEven(int a, int b, int c) {
        int result = 0;
        if (isEven(a)) {
            result += 1;
        }
        if (isEven(b)) {
            result += 1;
        }
        if (isEven(c)) {
            result += 1;
        }
        return result;
    }

    public static void showResult(int count) {
        System.out.println("Even numbers = " + count);
    }


}
