import java.util.*;
import java.text.*;
public class CurrencyFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //taking input from user
        System.out.println("Enter the currency amount: ");
        double amount = sc.nextDouble();
        sc.close();
        //creating a currency formatter
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String us = usFormat.format(amount);
        Locale indiaLocale = new Locale ("en","IN");
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(indiaLocale);
        String india = indiaFormat.format(amount);
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = chinaFormat.format(amount);
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = franceFormat.format(amount);
        //displaying the formatted currency
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);


    }
}
