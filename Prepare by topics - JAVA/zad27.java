import java.util.ArrayList;
import java.util.Scanner;

public class zad27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < N; i++){
            int value = scanner.nextInt();
            array.add(value);
        }
        int Q = scanner.nextInt();
        for (int i = 0; i < Q; i++){
            String query = scanner.next();
            if (query.equals("Insert")){
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                array.add(x, y);
            }
            if (query.equals("Delete")){
                int x = scanner.nextInt();
                array.remove(x);
            }
        }
        for (int i = 0; i < array.size(); i++){
            System.out.print(array.get(i) + " ");
        }
    }
}
