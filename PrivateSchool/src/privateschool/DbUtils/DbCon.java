/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package privateschool.DbUtils;
import java.sql.*;
/**
 *
 * @author PSO
 */
public class DbCon {
    
    private static final String DB_DRIVER =
           "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL =
            "jdbc:mysql://localhost:3306/private_school";

    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "2547";

    public static Connection getConnection(){
        Connection conn = null;
        try{

            Class.forName(DB_DRIVER);


            conn = DriverManager.
                    getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);

            if(conn != null){
                System.out.println("Successfully connected.");
            }else{
                System.out.println("Failed to connect.");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return conn;
    }

    
    
    
    
    
}
