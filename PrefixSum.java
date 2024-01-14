import java.util.*;


public class PrefixSum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        HashMap<Integer, Integer> hm=new HashMap<>();
        for(int i=0;i<q;i++){
            Integer a=sc.nextInt();
            Integer b=sc.nextInt();
            hm.put(a, b);
        }
    }
}
