import java.util.*;

public class AnagramGrouper {

    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            map.get(sortedStr).add(s);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input the number of strings
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        // Input the strings
        String[] input = new String[n];
        System.out.println("Enter the strings:");
        for (int i=0;i<n;i++){
            input[i] = scanner.nextLine();
        }

        // Group the anagrams
        List<List<String>> groupedAnagrams = groupAnagrams(input);

        // Print the grouped anagrams
        System.out.println("Grouped Anagrams:");
        for (List<String> group : groupedAnagrams) {
            System.out.println(group);
        }

        scanner.close();
    }
}
