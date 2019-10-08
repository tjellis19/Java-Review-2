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
        System.out.println("");
        
        Person p = new Person();
        System.out.println("Person:\n" + p.toString() + "\n");
        
        Student s = new Student();
        System.out.println("Student:\n" + s.toString() + "\n");
        
        Employee e = new Employee();
        System.out.println("Employee:\n" + e.toString() + "\n");
        
        Faculty f = new Faculty();
        System.out.println("Faculty:\n" + f.toString() + "\n");
        
        Staff st = new Staff();
        System.out.println("Staff:\n" + st.toString() + "\n");
    }
    
}
