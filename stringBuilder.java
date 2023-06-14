import java.util.*;

public class stringBuilder {
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("Tony");
        System.out.println(sb);

        System.out.println(sb.charAt(0));

        // sb.setCharAt(0, 'p');
        // System.out.println(sb);
        sb.insert(0, 'S');
        System.out.println(sb);
        
        sb.insert(3, 'n');
        System.out.println(sb);

        //delete the extraaa n fron the string
        sb.delete(3, 4);
        System.out.println(sb);

        //adding something to the end to the string is called append
        sb.append(" Gandu Hai");
        System.out.println(sb);

    }
}
