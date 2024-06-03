import java.util.*;
public class Second {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
ArrayList<String> list = new ArrayList<>();
System.out.println("Enter elements separated by spaces: ");
String input = scanner.nextLine();
String[] s = input.split(" ");
for (String a : s) {
list.add(a);
}
System.out.println("Original list: " + list);
System.out.print("Enter the element to insert at the first position: ");
String insert = scanner.nextLine();
list.add(0, insert);
System.out.println("Modified list: " + list);
}
}
