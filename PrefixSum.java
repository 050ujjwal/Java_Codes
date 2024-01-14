/*Question:
William Macfarlane wants to look at an array.

You are given a list of N numbers and Q queries. Each query is specified by two numbers i and j; the answer to each query is the sum of every number between the range [i, j] (inclusive).

Note: the query ranges are specified using 0-based indexing.

Input
The first line contains N, the number of integers in our list (N <= 100,000). The next line holds N numbers that are guaranteed to fit inside an integer. Following the list is a number Q (Q <= 10,000). The next Q lines each contain two numbers i and j which specify a query you must answer (0 <= i, j <= N-1).

Output
For each query, output the answer to that query on its own line in the order the queries were made.

Example
Input:
3
1 4 1
3
1 1
1 2
0 2

Output:
4
5
6 */


import java.util.*;

public class PrefixSum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt() ,sum=0;
        int[] arr=new int[n];
        int[] prefixSum=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
            prefixSum[i]=sum;
        }
        int q=sc.nextInt();
        while(q>0){
            int l=sc.nextInt();
            int r=sc.nextInt();
            int right=prefixSum[r-1];
            int left=l==1?0:prefixSum[l-2];
            System.out.println(right-left);
            q--;
        }

    }
}
