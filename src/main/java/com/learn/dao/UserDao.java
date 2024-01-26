/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learn.dao;
import com.learn.entities.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author Pawan Kumar
 */
public class UserDao {
    
    private Connection con;

    public UserDao(Connection con) {
        this.con = con;
    }
    public User getUser(String email){
        User user=null;
        try{
            String query="select * from user where email=?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, email);
            
            ResultSet rs=pstmt.executeQuery();
            while(rs.next()){
                user= new User();
                user.setId(rs.getInt(1));
                user.setName(rs.getString(2));
                user.setEmail(rs.getString(3));
                user.setPassword(rs.getString(4));
                user.setPhone(rs.getString(5));
                user.setAddress(rs.getString(6));
                user.setLandMark(rs.getString(7));
                user.setCity(rs.getString(8));
                user.setState(rs.getString(9));
                user.setPinCode(rs.getString(10));
                user.setUserType(rs.getString(11));
                
            }
            con.isClosed();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return user;
    }
    
    public User getUser(String email,String password){
        User user=null;
        try{
            String query="select * from user where email=? and password=?";
            PreparedStatement pstmt=con.prepareStatement(query);
            pstmt.setString(1, email);
            pstmt.setString(2, password);
            ResultSet rs=pstmt.executeQuery();
            
            while(rs.next()){
                user= new User();
                user.setId(rs.getInt(1));
                user.setName(rs.getString(2));
                user.setEmail(rs.getString(3));
                user.setPassword(rs.getString(4));
                user.setPhone(rs.getString(5));
                user.setAddress(rs.getString(6));
                user.setLandMark(rs.getString(7));
                user.setCity(rs.getString(8));
                user.setState(rs.getString(9));
                user.setPinCode(rs.getString(10));
                user.setUserType(rs.getString(11));
                
            }
            con.isClosed();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return user;
    }
    
    public int setUser(String name,String email,String password){
        int result=0;
        String query="insert into user (name,email, password,usertype) values (?,?,?,Normal)";
        try{
            PreparedStatement pstmt= con.prepareStatement(query);
            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.setString(3, password);
            
            result=pstmt.executeUpdate();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        
        return result;
    }
    
    
    
}
