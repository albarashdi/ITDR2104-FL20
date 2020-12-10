/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_2;

/**
 *
 * @author a_alb
 */
public class Test {
    public static void main(String[] args) {
        Student s = new Student(33, "Ahmed", "Male", "2005493007", 
                "Software Development");
        Student s2 = new Student(22, "Salma", "Female", "2015493007", 
                "IT");
        System.out.println(s);
        System.out.println(s2);
    }
}
