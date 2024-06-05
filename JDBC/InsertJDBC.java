//Creating Table using java Program 
import java.sql.*;

class InsertJDBC {
        public static void main(String[] args) {
        
    
            try{
                //load the driver
                Class.forName("com.mysql.jdbc.Driver");
                //create connection
                String url = "jdbc:mysql://localhost:3306/firstdb";
                String username = "root";
                String password = "2299";
                Connection con = DriverManager.getConnection(url,username,password);
                //Create a query
                String q = "create table table1(tId int(20)primary key auto_increment,tName varchar(200)not null,tCity varchar(400))";
                //create a statement
                Statement stmt = con.createStatement();
                stmt.executeUpdate(q);
                System.out.println("Table created successfully");
                con.close();
            //     if(con.isClosed())
            //     {
            //         System.out.println("connection is closed");
            //     }
            //     else{
            //         System.out.println("connection created");
            //     }
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
