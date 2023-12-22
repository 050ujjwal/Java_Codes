import java.util.*;

public class UniqueSubsiquences {
    public static void allSubsequences(String str, int index, String newString, HashSet<String> set){
        if(index==str.length()){
            if(set.contains(newString)){
                return;
            }
            else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar=str.charAt(index);
        // To be
        allSubsequences(str, index+1, newString+currChar, set);

        //currChar
        allSubsequences(str, index+1, newString, set);
    }
    public static void main(String args[]){
        String str="aaa";
        HashSet<String> set=new HashSet<>();
        allSubsequences(str, 0, "", set);
    }
}
