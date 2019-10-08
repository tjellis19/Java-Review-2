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
public class Person {
    //--------- Variables ---------\\
    String name, address, phoneNumber, email;
    
    
    //--------- Constructor(s) ---------\\
    public Person()
    {
        name = "Steven Santos";
        address = "97 Rose Street Medina, OH 44256";
        phoneNumber = "(484) 906-6932";
        email = "ssantos@gmail.com";
    }
    //--------- Setters and Gettersv---------\\
    
    
    
    //--------- Additional Methods ---------\\
    public String toString()
    {
       return "Name: " + name + "\nAddress: " + address + "\nPhone number: "
               + phoneNumber + "\nEmail: " + email;
    }
}// end of class
