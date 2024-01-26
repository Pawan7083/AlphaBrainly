/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learn.helper;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Pawan Kumar
 */
public class ConnectionProvider {
     private static Connection con=null;
     
     public static Connection getConnection(){
         try{
             if(con==null){
                 Class.forName("com.mysql.cj.jdbc.Driver");
                 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/alphabrainly","root","bscit");
             }
         }catch(Exception e){
             e.printStackTrace();
         }
         return con;
     }
    
    
    
}
