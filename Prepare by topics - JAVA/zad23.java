import java.util.Locale;
import java.util.Scanner;

public class zad23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double payment = scanner.nextDouble();
        scanner.close();

        String paymentStr = Double.toString(payment);
        String firstTwo = paymentStr.substring(0, 2);
        String last = paymentStr.substring(2, paymentStr.length() - 1);
        String f1 = firstTwo + "," + last;
        String f2 = firstTwo + " " + last;
        System.out.println(f1);
        System.out.println(f2);

        System.out.println("US: " +  "$" + f1);
        System.out.println("India: " + "Rs." + f1);
        System.out.println("China: " + "￥" + f1);
        System.out.println("France: " + f2 + "€");
    }
}
