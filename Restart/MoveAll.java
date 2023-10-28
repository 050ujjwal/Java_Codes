package Restart;

public class MoveAll {
    public static void moveAllx(String str, int index, int count, String newString){
        if(index==str.length()){
            for(int i=0;i<count;i++){
                newString+='x';
            }
            System.out.println(newString);
            return;
        }
        char currChar=str.charAt(index);
        if(currChar=='x'){
            count++;
            moveAllx(str, index+1, count, newString);
        }
        else{
            newString+=currChar;
            moveAllx(str, index+1, count, newString);
        }
    }
	public static void main(String[] args) {
		String str="axbxcxdxexfxgxhx";
		moveAllx(str, 0, 0, "");
	}
}
