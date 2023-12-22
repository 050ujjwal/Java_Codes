public class Subsequences {
    public static void allSubsequences(String str, int index, String newString){
        if(index==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar=str.charAt(index);
        // To be
        allSubsequences(str, index+1, newString+currChar);

        //currChar
        allSubsequences(str, index+1, newString);
    }
    public static void main(String args[]){
        String str="abcd";
        allSubsequences(str, 0, "");
    }
}
