package ConnectionsCheck;
import java.sql.*;

class FirstJDBC {
    public static void main(String args[]){
        try{
                class.forName("com.mysql.jdbc.Driver");


        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
