//program for jdbc 1 program
//how to create connection using java App
import java.sql.*;
/**
 * FirstJDBC
 */
class FirstJDBC {
    public static void main(String[] args) {
        
    
    try{
        //load the driver
        Class.forName("com.mysql.jdbc.Driver");
        //create connection
        String url = "jdbc:mysql://localhost:3306/firstdb";
        String username = "root";
        String password = "2299";
        Connection con = DriverManager.getConnection(url,username,password);
        if(con.isClosed())
        {
            System.out.println("connection is closed");
        }
        else{
            System.out.println("connection created");
        }
    }
    catch(Exception e){
        // System.out.println(e);
        e.printStackTrace();
    }
    // finally{
    //     // System.out.println("connection established");
    // }

    }
}