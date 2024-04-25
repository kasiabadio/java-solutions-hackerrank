import java.io.*;
import java.util.*;

// Author: Katarzyna Badio 2024
// Java Stdin and Stdout II


public class zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intOne = scanner.nextInt();
        double doubleOne = scanner.nextDouble();
        scanner.nextLine();
        String stringOne = scanner.nextLine();

        System.out.println("String: " + stringOne);
        System.out.println("Double: " + doubleOne);
        System.out.println("Int: " + intOne);
    }

}
