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
public class Student extends Person {
    //--------- Variables ---------\\
    final String FIRST_YEAR, SECOND_YEAR, THIRD_YEAR, FOURTH_YEAR;
    
    //--------- Constructor(s) ---------\\
    public Student()
    {
        FIRST_YEAR = "Freshman";
        SECOND_YEAR = "Sophomore";
        THIRD_YEAR = "Junior";
        FOURTH_YEAR = "Senior";
    }
    //--------- Setters and Gettersv---------\\
    
    
    
    //--------- Additional Methods ---------\\
    @Override
    public String toString()
    {
       return super.toString() + "\nStatus: " + THIRD_YEAR;
    }
}// end of class
