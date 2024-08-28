import java.io.*;
import java.util.*;

public class zad19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfTestCases = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numOfTestCases; i++){
            String username = scanner.nextLine();
            char c = username.charAt(0);
            boolean flag = false;
            for (int j = 0; j < username.length(); j++){
                char c2 = username.charAt(j);
                if (!Character.isLetterOrDigit(c2) && c2 != '_'){
                    System.out.println("Invalid");
                    flag = true;
                    break;
                }
            }
            if ((username.length() < 8 || username.length() > 30) && !flag){
                System.out.println("Invalid");
            } else if (Character.isLetter(c) == false && !flag){
                System.out.println("Invalid");
            } else if (!flag) {
                System.out.println("Valid");
            }
        }
    }
}