package Restart;
import java.util.*;

public class Sum_of_Unique_Elements {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int freq[]=new int[101];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        int sum=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]==1) sum+=i;
        }
        System.out.println(sum);
    }
}
