import java.util.*;

public class Frequency {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), q=sc.nextInt();
        int[] arr=new int[n+1];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] freq=new int[n+1];
        for(int i=0;i<freq.length;i++){
            freq[arr[i]]++;
        }
        for(int i=0;i<q;i++){
            int x=sc.nextInt();
            System.out.println(freq[x]);
        }
    }
}
