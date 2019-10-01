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
        for(long i = elaspedTime; i > 86400000L; i++)
        {
           i = Math.subtractExact(i, 86400000L);
           day++;
           if (month == 0 && day > 31)
           {
               month = 1;
               day = 1;
           }
           else if(month == 1 && day > 28)
           {
               month = 2;
               day = 1;
           }
           else if(month == 2 && day > 31)
           {
               month = 3;
               day = 1;
           }
           else if(month == 3 && day > 30)
           {
               month = 4;
               day = 1;
           }
           else if(month == 4 && day > 31)
           {
               month = 5;
               day = 1;
           }
           else if(month == 5 && day > 30)
           {
               month = 6;
               day = 1;
           }
           else if(month == 6 && day > 31)
           {
               month = 7;
               day = 1;
           }
           else if(month == 7 && day > 31)
           {
               month = 8;
               day = 1;
           }
           else if(month == 8 && day > 30)
           {
               month = 9;
               day = 1;
           }
           else if(month == 9 && day > 31)
           {
               month = 10;
               day = 1;
           }
           else if(month == 10 && day > 30)
           {
               month = 11;
               day = 1;
           }
           else if(month == 11 && day > 31)
           {
               month = 0;
               day = 1;
               year++;
           }
           i--;
        }
    }
    
    
    
    public String toString()
    {
       return "month/day/year\n" +
               month + "/" + day + "/" + year;
    }
}// end of class
