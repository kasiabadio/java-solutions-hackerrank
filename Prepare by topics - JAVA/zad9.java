import java.util.Scanner;

public class zad9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int breadth = scanner.nextInt();
        int height = scanner.nextInt();
        int area = breadth*height;
        if (breadth > 0 && height > 0){
            System.out.println(area);
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }

    }
}
