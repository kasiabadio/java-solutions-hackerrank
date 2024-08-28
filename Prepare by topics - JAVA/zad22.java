import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class zad22 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();

        int maxSum = 0;
        for (int y = 0; y < 4; y++){
            for (int x = 0; x < 4; x++){
                int first = arr.get(y).get(x);
                int second = arr.get(y).get(x+1);
                int third = arr.get(y).get(x+2);
                int fourth = arr.get(y+1).get(x+1);
                int fifth = arr.get(y+2).get(x);
                int sixth = arr.get(y+2).get(x+1);
                int seventh = arr.get(y+2).get(x+2);
                int sum = first+second+third+fourth+fifth+sixth+seventh;
                if (y == 0 & x == 0){
                    maxSum = sum;
                } else if(sum > maxSum){
                    maxSum = sum;
                }
            }
        }
        System.out.println(maxSum);
    }
}
