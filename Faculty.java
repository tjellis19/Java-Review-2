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
public class Faculty extends Employee{
    //--------- Variables ---------\\
    String officeHours, rank;
    
    //--------- Constructor(s) ---------\\
    public Faculty()
    {
        officeHours = "1:00 - 3:00 MWF";
        rank = "Part-time Professor";
    }
    //--------- Setters and Gettersv---------\\
    
    
    
    //--------- Additional Methods ---------\\
    @Override
    public String toString()
    {
       return super.toString() + "\nOffice hours: " + officeHours 
               + "\nRank: " + rank;
    }
}// end of class
