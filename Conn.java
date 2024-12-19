import java.sql.*;
public class Conn {
    
    Connection c;
    Statement s;
public static void main(String[] args) {
    
}
    Conn () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///universitymangementsystem", "root", "Sakshi@1406");
            s = c.createStatement();
            System.out.println("connection Succesfully");
        } catch (Exception e) {
            e.printStackTrace();
}    
        }
    }

