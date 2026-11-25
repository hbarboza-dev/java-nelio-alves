package secao04;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter unit price and quantity:");
        double unitPrice = sc.nextDouble();
        int quantity = sc.nextInt();

        double priceTotal = totalPrice(unitPrice, quantity);

        double totalDiscount = discount(priceTotal);

        double valueFinal = finalValue(priceTotal, totalDiscount);

        showResult(priceTotal, totalDiscount, valueFinal);

        sc.close();
    }

    public static double totalPrice(double price, int quantity) {
        return price * quantity;
    }

    public static double discount(double total) {
        double totalDiscount = 0;
        if (total >= 100) {
            totalDiscount = total * 0.10;
        }
        return totalDiscount;
    }

    public static double finalValue(double total, double discount) {
        return total - discount;
    }

    public static void showResult(double total, double discount, double finalValue) {
        System.out.printf("Total = %.2f%n", total);
        System.out.printf("Discount = %.2f%n", discount);
        System.out.printf("Final value = %.2f%n", finalValue);
    }

}
