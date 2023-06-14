import java.util.*;

public class Recursion {
    static int power(int n){
        if(n==0){
            return 1;
        }
        int smallerProblem=power(n-1);
        int bigProblem=2*smallerProblem;
        return bigProblem;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int ans=power(a);
        System.out.println(ans);
    }
}
