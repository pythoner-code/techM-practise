import java.util.*;
public class First {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string to reversed : ");
    String input = sc.nextLine();
    String reversed = reverseStrings(input);
    System.out.println(reversed);
    }
    public static String reverseStrings(String str) {
    str = str.trim().replaceAll("\\s+", " ");
    String[] words = str.split(" ");
    StringBuilder reversed = new StringBuilder();
    for (int i = words.length - 1; i >= 0; i--) {
    reversed.append(words[i]);
    if (i > 0) {
    reversed.append(" ");
    }
    }
    return reversed.toString();
    }
    }