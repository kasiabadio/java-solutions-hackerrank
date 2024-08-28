import java.util.Scanner;

public class zad17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.getProperty("line.separator"));
        String line = scanner.next();
        line = line.trim();

        if (line.length() == 0) {
            System.out.println(0);
            return;
        }

        String[] tokens = line.split("[ !,?._'@]+");
        int numOfTokens = tokens.length;
        System.out.println(numOfTokens);
        for (int i = 0; i < tokens.length; i++){
            System.out.println(tokens[i]);
        }
    }
}