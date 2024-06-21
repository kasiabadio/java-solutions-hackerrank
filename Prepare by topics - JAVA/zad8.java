import java.util.Scanner;

public class zad8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.getProperty("line.separator"));
        int c = 0;
        while (scanner.hasNext()){
            String line = scanner.next();
            c += 1;
            System.out.println(c + " " + line);
        }
    }
}
