package Restart;

public class String_Paindrome {
    public static int main(String args[]){
        String str="";
        for(int i=S.length()-1;i>=0;i--){
            str+=S.charAt(i);
        }
        if(str.equals(S)) return 1;
        else return 0;
    }
}
