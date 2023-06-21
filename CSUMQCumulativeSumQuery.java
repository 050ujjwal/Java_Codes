import java.util.*;

public class CSUMQCumulativeSumQuery {
    Scanner sc=new Scanner(System.in);
    // int a=sc.nextInt();
    // int arr[]=new int[a];
    // int b=sc.nextInt();
    // int sum[]=new int[a];
    // int summ=0;
    // for(int i=0;i<a;i++){
    //     summ+=arr[i];
    //     sum[i]=summ;
    // }
    // int z=sc.nextInt();
    // while(z-->0){
    //     int first=sc.nextInt(), second=sc.nextInt();

    // }
    int arr[]={8,3,5,2,3,1,6,5,7,4,3,1,4};
    HashMap<Integer, Integer> hm=new HashMap<>();
    for(int i=0;i<arr.length;i++){
        int key=arr[i];
        int freq=0;
        if(hm.containsKey(key)) freq=hm.get(key);
        freq++;
        hm.put(key, freq);
    }
}
