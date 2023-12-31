package Restart;

import java.util.*;

public class Main {
    static int[] printArr(int nums[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
    
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        Integer[] sorted = new Integer[n];
        for(int i =0;i<n;i++){
            sorted[i] = nums[i];
        }
        Arrays.sort(sorted,new Comparator<Integer>(){
            @Override
            public int compare(Integer a, Integer b){
                if(map.get(a)==map.get(b)){
                    return b.compareTo(a);
                }
                return map.get(a) - map.get(b);
            }
        });
        return Arrays.stream(sorted).mapToInt(Integer::intValue).toArray();
    }
    
    public static void main(String args[]){
        int[] nums={1,2,3,4,5,6,7,8,9,10};
        System.out.println(printArr(nums));
    }
}
