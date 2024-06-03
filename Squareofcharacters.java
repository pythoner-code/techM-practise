import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
public class Squareofcharacters {
   public static void main(String[] args) {
       String s = "abccc";
       int k = 1;
       HashMap<Character, Integer> map = new HashMap<>();
       for(int i = 0;i<s.length();i++){
           if(map.containsKey(s.charAt(i))){
               map.put(s.charAt(i), map.get(s.charAt(i))+1);
           }else{
               map.put(s.charAt(i), 1);
           }
       }
       ArrayList<Integer> list = new ArrayList<>(map.values());
       Collections.sort(list);
       int res=0;
       int i = map.size() -1;
       while(k-->0){
           list.set(i,list.get(i)-1);
           Collections.sort(list);
       }
       for(i = 0;i<list.size();i++){
           res+=Math.pow(list.get(i), 2);
       }
         System.out.println(res);
   }
}