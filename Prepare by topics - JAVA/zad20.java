import java.io.*;
import java.util.*;

public class zad20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();
        Set<String> set = new HashSet<String> ();
        for (int i = 0; i < T; i++){
            String line = scanner.nextLine();
            set.add(line);
            System.out.println(set.size());
        }

    }
}
