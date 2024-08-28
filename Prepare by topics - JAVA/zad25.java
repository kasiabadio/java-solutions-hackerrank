import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class zad25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<ArrayList<Integer>> numbers = new ArrayList<>(n);
        for (int i = 0; i < n; i++){
            int d = scanner.nextInt();
            ArrayList<Integer> innerList= new ArrayList<>(d);

            for (int j = 0; j< d; j++){
                innerList.add(scanner.nextInt());
            }
            numbers.add(innerList);
        }
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a >= 1 && a <= numbers.size() && b >= 1 && b <= numbers.get(a-1).size()) {
                int value = numbers.get(a - 1).get(b - 1);
                System.out.println(value);
            } else {
                System.out.println("ERROR!");
            }
        }


    }
}
