/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FrontEnd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hemant
 */
public class JdbcConnection {
    Connection conn;
    int i=1;
    String m="Git trial";
    
    public Connection Connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/insurance","root","Northeastern@2023");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("SQL syntax error");
        }
        return conn;
    }
}

