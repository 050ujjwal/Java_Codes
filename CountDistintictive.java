// Count number of substrings having at least K distinct characters
import java.util.*;

public class CountDistintictive {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int k=sc.nextInt();
        int n=str.length();
        HashMap<Character, Integer> hm=new HashMap<>();
        int begin=0, end=0;
        int ans=0;
        while(end<n){
           char c=str.charAt(end);
           hm.put(c, hm.getOrDefault(c, 0)+1);
           end++;
           while(hm.size()>=k){
            char p=str.charAt(begin);
            hm.put(p, hm.getOrDefault(p, 0)-1);
            if (hm.get(p)==0){
                hm.remove(p);
            }
            ans += str.length() - end + 1;
            begin++;
           }
        }
        System.out.println(ans);
    }
}
