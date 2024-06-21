import java.util.Scanner;

public class zad13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.getProperty("line.separator"));
        String A = scanner.next();
        String B = scanner.next();
        int length = A.length() + B.length();
        System.out.println(length);
        if (A.compareTo(B) > 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        String A0 = A.substring(0, 1).toUpperCase();
        String A1 = A0 + A.substring(1, A.length());
        String B0 = B.substring(0, 1).toUpperCase();
        String B1 = B0 + B.substring(1, B.length());
        System.out.println(A1 + " " + B1);
    }
}
