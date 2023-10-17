package Restart;
import java.util.*;


public class Recur {
    public static int printNumb(int n){
        System.out.println(n);
        return printNumb(n-1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    }
}
