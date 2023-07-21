package jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcDemo {
    public static void main(String[] args) throws SQLException {
        // Creating the connection
        String url = "jdbc:postgresql://localhost/demo";
        Connection conn = null;

        int rollNo = 3;
        String name = "abhik";
        int age = 19;
        String sql = "INSERT INTO public.student(rollNo, name, age) VALUES ("+rollNo+", '"+name+"', "+age+")";
        
        try{
            conn = DriverManager.getConnection(url, "postgres", "shikhu");

            Statement st = conn.createStatement();
            int m = st.executeUpdate(sql);
            if(m == 1)
                System.out.println("Inserted Successfully: " + sql);
            else
                System.out.println("Insertion failed");
        } catch(Exception ex){
            System.err.println(ex);
        } finally{
            conn.close();
        }
    }
}