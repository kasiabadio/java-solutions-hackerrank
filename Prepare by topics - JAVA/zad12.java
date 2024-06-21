import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class zad12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float number = scanner.nextFloat();
        String numberStr = Float.toString(number);
        String resultStr = numberStr.substring(numberStr.indexOf('.'), numberStr.length());
        for (int i = numberStr.indexOf('.') - 1; i >= 0; i--){
            resultStr = numberStr.charAt(i) + resultStr;
            if ((i+1)%3 == 0 && numberStr.charAt(i) != '.'){
                resultStr = "," + resultStr;
            }
        }
        Currency currencyUSD = Currency.getInstance(Locale.US);
        Currency currencyChina = Currency.getInstance(Locale.CHINA);
        Currency currencyFrance = Currency.getInstance(Locale.FRANCE);
        System.out.println("US: " + currencyUSD.getSymbol() + resultStr);
        System.out.println("India: Rs." + resultStr);
        System.out.println("China: " + currencyChina + resultStr);
        System.out.println("France: " + resultStr + " " + currencyFrance);
    }
}
