import java.io.*;
import java.util.*;

// Author: Katarzyna Badio 2024
// Java Output Formatting

public class zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String first = scanner.next();
            int second = scanner.nextInt();
            System.out.printf("%-15s%03d%n", first, second);
        }
        System.out.println("================================");
    }
}
