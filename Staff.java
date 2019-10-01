/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_review2;

/**
 *
 * @author tjell
 */
public class Staff extends Employee{
    //--------- Variables ---------\\
    String title;
    
    //--------- Constructor(s) ---------\\
    public Staff()
    {
        title = "Advisor";
    }
    //--------- Setters and Gettersv---------\\
    
    
    
    //--------- Additional Methods ---------\\
    @Override
    public String toString()
    {
       return super.toString() + "\nTitle: " + title;
    }
}// end of class
