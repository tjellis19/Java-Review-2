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
public class Java_Review2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyDate date1 = new MyDate();
        MyDate date2 = new MyDate(34355555133101L);
        
        System.out.println("Date 1:\n" + date1.toString());
        System.out.println("Date 2:\n" + date2.toString());
    }
    
}
