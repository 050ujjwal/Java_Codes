import java.util.*;


public class Factorial {
    static int factorial(int n){
        if(n==0){
            return 1;
        }
        int choti=factorial(n-1);
        int baddi=n*choti;
        return baddi;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int ans=factorial(a);
        System.out.println(ans);
    }
}
