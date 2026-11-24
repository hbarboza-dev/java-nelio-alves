package secao04;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three grades:");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();

        double media = average (n1, n2, n3);

        String resp = status(media);

        showResult(media, resp);

        sc.close();
    }

    public static double average (double a, double b, double c){
        double media = (a + b + c) / 3;
        return media;
    }

    public static String status (double average){
        String resp;
        if (average >= 6) {
            resp = "APPROVED";
        } else {
            resp = "FAILED";
        }
        return resp;
    }

    public static void showResult(double average, String status) {
        System.out.printf("Average = %.2f%n", average);
        System.out.println("Status = " + status);
    }

}
