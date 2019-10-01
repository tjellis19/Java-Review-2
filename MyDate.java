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
public class MyDate {
    //--------- Variables ---------\\
    int year, month, day;
    
    //--------- Constructor(s) ---------\\
    public MyDate()
    {
        this.day = 30;
        this.month = 8;
        this.year = 2019;
    }
    public MyDate(long milliseconds)
    {
        this.day = 1;
        this.month = 0;
        this.year = 1970;
        setDate(milliseconds);
    }
    public MyDate(int d, int m, int y)
    {
     this.day = d;
     this.month = m;
     this.year = y;
    }
    
    
    //--------- Setters and Gettersv---------\\

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
    
    
    //--------- Additional Methods ---------\\
    public void setDate(long elaspedTime)
    {
        
    }
    
    
    
    public String toString()
    {
       return "month/day/year\n" +
               month + "/" + day + "/" + year;
    }
}// end of class
