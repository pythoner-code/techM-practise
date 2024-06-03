public class convertcharacter {
    public static void main(String[] args) {
 
        String str = "abcsdx";
        char ch = '#';
        int n = str.length();
        int k = 2;
 
        int div = 2 * k + 1;
        if (n / 2 <= k){
            System.out.print(1 + "\n");
            if (n > k){
                System.out.print(k + 1);
            }
            else{
                System.out.print(n);
            }
        }else{
            if (n % div == 0){
                int m = n / div;
                System.out.print(m + "\n");
                int pos = k + 1;
                System.out.print(pos + " ");
                for(int i = 1; i <= m; i++){
                    System.out.print(pos + " ");
                    pos += div;
                }
            }else{
                int m = n / div + 1;
                System.out.print(m + "\n");
                int pos = n % div;
                if (n % div > k){
                    pos -= k;
                }
                for(int i = 1; i <= m; i++){
                    System.out.print(pos + " ");
                    pos += div;}}}
 }
 }
 
 