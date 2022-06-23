/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javademoapp;
import java.sql.*;

/**
 *
 * @author kumar
 */
public class javadatabaseConnection 
{
    public static Connection getconnect()
    {
        Connection conn = null;
    try {
      String url = "jdbc:derby://localhost:1527/logindb";
     // String url="jdbc:mysql://localhost:3306/smsdb?zeroDateTimeBehavior=convertToNull";
     // conn = DriverManager.getConnection(url,"root","");
      conn = DriverManager.getConnection(url,"login","login");
      return conn;
    }
    catch (SQLException e) 
    {
        e.printStackTrace();
        }
    return conn;
    
    }
    
    
}
