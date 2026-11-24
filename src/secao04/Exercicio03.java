package secao04;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();


        int maxThree = maxOfThree(n1, n2, n3);


        showResult(maxThree);

        sc.close();
    }

    public static int maxOfTwo(int x, int y) {
        int maxTwo;
        if (x > y) {
            maxTwo = x;
        } else {
            maxTwo = y;
        }
        return maxTwo;
    }

    public static int maxOfThree(int x, int y, int z) {
        return maxOfTwo(x, maxOfTwo(y, z));
    }

    public static void showResult(int value) {
        System.out.println("Higher = " + value);
    }

}
