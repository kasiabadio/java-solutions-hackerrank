import java.util.Scanner;

public class zad7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTestCases = scanner.nextInt();
        for (int i = 0; i < numberOfTestCases; i++){
            try {
                long number = scanner.nextLong();
                System.out.println(number + " can be fitted in:");
                if (number >= -Math.pow(2, 7) && number <= Math.pow(2, 7)-1){
                    System.out.println("* byte");
                }
                if (number >= -Math.pow(2, 15) && number <= Math.pow(2, 15)-1){
                    System.out.println("* short");
                }
                if (number >= -Math.pow(2, 31) && number <= Math.pow(2, 31)-1){
                    System.out.println("* int");
                }
                if (number >= -Math.pow(2, 63) && number <= Math.pow(2, 63)-1){
                    System.out.println("* long");
                }
            } catch (Exception e){
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }

        }
    }
}
