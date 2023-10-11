package Restart;
import java.util.*;

public class TwoStrings {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String word1=sc.next(), word2=sc.next();
        char[] ca=word1.toCharArray();
        char[] da=word2.toCharArray();
        HashMap<Character, Integer> hm1=new HashMap<>();
        HashMap<Character, Integer> hm2=new HashMap<>();
        for(int i=0;i<ca.length;i++){
            if(hm1.containsKey(ca[i])){
                hm1.put(ca[i], hm1.get(ca[i])+1);
            }
            else{
                hm1.put((char) i, 1);
            }
        }
        for(int i=0;i<da.length;i++){
            if(hm2.containsKey(da[i])){
                hm2.put(ca[i], hm2.get(da[i])+1);
            }
            else{
                hm2.put((char) i, 1);
            }
        }
        
    }
}
