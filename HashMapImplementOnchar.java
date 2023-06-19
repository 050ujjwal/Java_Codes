import java.util.*;

public class HashMapImplementOnchar {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char arr[]=new char[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.next().charAt(0);
        }
        HashMap<Character, Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            char key=arr[i];
            int freq=0;
            if(hm.containsKey(key)) freq=hm.get(key);
            freq++;
        }

        int q=sc.nextInt();
        while(q-->0){
            char c=sc.next().charAt(0);
            if(hm.containsKey(c)) System.out.println(c);
            else System.out.println(0);
        }
    }
}
