/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lmsProject;
import java.sql.*;
/**
 *
 * @author Taha Imran
 */

public class ConnectionProvider {
    public static void main(String[]args){
        getConn();
    }
    
    public static Connection getConn(){
        String jdbcURL = "jdbc:oracle:thin:@//host:port/sid";
        String username = "sys";
        String password = "pass";
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            Connection conn = DriverManager.getConnection(jdbcURL, username, password);
            return conn;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
}
