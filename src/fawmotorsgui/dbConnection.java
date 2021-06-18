/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fawmotorsgui;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Eisha Ahmad
 */
public class dbConnection {
    
    
        Connection con;
        Statement stmt;
        
        
        dbConnection()
        {
             try
        {
            // String s = "jdbc:sqlserver://localhost\\tarvihafatima:1433;databaseName=medicineStore";
             String s="jdbc:sqlserver://localhost:1433;databaseName=FawMotors";
             con=DriverManager.getConnection(s,"admin","coco123");


            stmt = con.createStatement(); 
            
            
        }
        catch(Exception e)
        {
            System.out.println(e);
            System.out.println("line42");
        }
            
            
            
        }
        
        Boolean signIn()
        {
           return true;
        }
        
        
    
}
