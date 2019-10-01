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
public class Employee extends Person{
    //--------- Variables ---------\\
    String office;
    int salary;
    MyDate dateHired;
    
    //--------- Constructor(s) ---------\\
    public Employee()
    {
        office = "221 Soul Grove Building";
        salary = 133783;
        dateHired = new MyDate(1,2,2007);
    }
    //--------- Setters and Gettersv---------\\
    
    
    
    //--------- Additional Methods ---------\\
    @Override
    public String toString()
    {
       return super.toString() + "\nOffice: " + office + "\nSalary: $" 
               + salary + "\nDate hired: " + dateHired.toString();
    }
}// end of class
