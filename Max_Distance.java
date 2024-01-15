/*Given an array with repeated elements, the task is to find the maximum distance between two occurrences of an element.

Examples:  

Input : arr[] = {3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2}
Output: 10
//-->maximum distance for 2 is 11-1 = 10 
//-->maximum distance for 1 is 4-2 = 2 
//-->maximum distance for 4 is 10-5 = 5 */
import java.util.*;

// public class Max_Distance {
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         int MaxCount=-1;
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if(arr[i]==arr[j]){
//                     int count = Math.abs(j - i); 
//                     MaxCount = MaxCount > count ? MaxCount : count;
//                 }
//             }
//         }
//         System.out.println(MaxCount);
//     }
    
// }

// Using hashmap solution

public class Max_Distance{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        HashMap<Integer, Integer> hm=new HashMap<>();
        int maxCount=0;
        for(int i=0;i<n;i++){
            if(hm.containsKey(arr[i])){
                maxCount=Math.max(maxCount,i-hm.get(arr[i]));
            }
            else{
		        hm.put(arr[i],i);
		    }
        }
        System.out.println(maxCount);
    }
}
