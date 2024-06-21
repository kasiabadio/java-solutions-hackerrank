import java.util.Scanner;

public class zad14 {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        for (int i = 0; i <= s.length()-k; i+=1){
            String s2 = s.substring(i, i+k);
            if (i == 0){
                smallest = s2;
                largest = s2;
            }
            if (s2.compareTo(smallest) < 0){
                smallest = s2;
            }
            if (s2.compareTo(largest) > 0){
                largest = s2;
            }
        }


        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}