import java.util.*;
public class SubstringComparison {
    public static void main(String[] args) {
        //taking input from user of string and k
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();
        sc.close();
        ///initializing the smallest and largest string
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        //iterating through the string to find the smallest and largest substring
        for (int i=0; i<=s.length()-k;i++){
            String sub = s.substring(i, i+k);
            //if difference is negative then sub is smaller than smallest
            if (sub.compareTo(smallest) < 0){
                smallest = sub;
            }
            //if difference is positive then sub is larger than largest
            if (sub.compareTo(largest) > 0){
                largest = sub;
            }
        }
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
    }
}
