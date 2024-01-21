
package com.learn.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Pawan Kumar
 */
public class FactoryProvider {
    private static SessionFactory factory=null;
    
    public static SessionFactory getFactory(){
        try{
            if(factory==null){
                factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return factory;
    }
    public void main(String arg[]){
        System.out.println(FactoryProvider.getFactory());
    }
}
