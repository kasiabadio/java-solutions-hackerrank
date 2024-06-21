import java.util.Scanner;

public class zad16 {

    static boolean isAnagram(String a, String b) {
        int[] countsA = new int[26];
        int[] countsB = new int[26];
        for (int i = 0; i < 26; i++){
            countsA[i] = 0;
            countsB[i] = 0;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();
        for (int i = 0; i < a.length(); i++){
            char cA = a.charAt(i);
            int tempA = (int) cA;
            int posA = tempA - 97;
            countsA[posA] += 1;
        }
        for (int i = 0; i < b.length(); i++){
            char cB = b.charAt(i);
            int tempB = (int) cB;
            int posB = tempB - 97;
            countsB[posB] += 1;
        }
        for (int i = 0; i < 26; i++){
            if (countsA[i] != countsB[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}