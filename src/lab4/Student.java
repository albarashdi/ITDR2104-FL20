/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author a_alb
 */
public class Student extends Person{
    
    String studentID;
    String major;

    public Student(int age, String name, String gender, String studentID, String major) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.studentID = studentID;
        this.major = major;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    
    @Override
    public String toString(){
        return super.toString()+" and student id "+this.studentID+" and major is "+this.major;
    }
    
}
