import java.util.Scanner;

public class zad10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        try {
            String numberStr = Integer.toString(number);
            System.out.println("Good job");
        } catch (Exception e){
            System.out.println("Wrong answer");
        }
    }
}
