import java.util.ArrayList;
import java.util.Scanner;

public class zad24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int j = 0; j < i; j++){
            int value = scanner.nextInt();
            numbers.add(value);
        }
        if (numbers.size() == 1){
            if (numbers.get(0) < 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        } else {
            int numberOfNegative = 0;
            for (int k = 0; k < numbers.size(); k++){
                for (i = 0; i < numbers.size(); i++){
                    int sum = 0;
                    for (int h = k; h <= i; h++){
                        sum += numbers.get(h);
                    }
                    if (sum < 0){
                        numberOfNegative += 1;
                    }
                }
            }
            System.out.println(numberOfNegative);
        }


    }
}
