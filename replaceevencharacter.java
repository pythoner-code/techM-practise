public class replaceevencharacter {
    public static void main(String[] args) {
        String str1 = "abcdef";
        String str2 = "ffffff";
        int N = str1.length();
        char[] str = str1.toCharArray();
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (str[i] == str2.charAt(i)) {
                continue;
            }
            int ptr = i;
            while (ptr < N && str[ptr] != str2.charAt(ptr)) {
                str[ptr] = str2.charAt(ptr);
                ptr += 2;
            }
            count++;
        }
        System.out.println(count);
    }
 }
 