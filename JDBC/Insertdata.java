//insert data into table using preparedStatement
//PreparedStatement :insert
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class Insertdata {
    public static void main(String[] args) {
        try{
            //load the driver
            Class.forName("com.mysql.jdbc.Driver");
            //create connection
            String url = "jdbc:mysql://localhost:3306/firstdb";
            String username = "root";
            String password = "2299";
            Connection con = DriverManager.getConnection(url,username,password);
            //create a query
            String q = "insert into table1(tName,tCity) values(?,?)";
            //create a statement(get the PreparedStatement object )
            PreparedStatement pstmt = con.prepareStatement(q);

        //Inserting data to table with dynamic input

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter Name::");
            String name =br.readLine();
            System.out.println("Enter city");
            String city = br.readLine();
            pstmt.setString(1,name);
            pstmt.setString(2,city);

        

            //set the values
            // pstmt.setString(1,"Rahul");
            // pstmt.setString(2, "LUCKNOW");
            pstmt.executeUpdate();
            System.out.println("data inserted successfully");
            con.close();
        }catch(Exception e){
            // System.out.println(e);
            e.printStackTrace();
        }
    }
    
}
