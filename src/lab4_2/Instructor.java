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
   
    public class Instructor extends Person{

    private String employeeNumber;
    private String academicTitle;
    private String department;

    public Instructor(int age, String name, String gender, String employeeNumber, String academicTitle, String department) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.employeeNumber = employeeNumber;
        this.academicTitle = academicTitle;
        this.department = department;
    }

    
    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getAcademicTitle() {
        return academicTitle;
    }

    public void setAcademicTitle(String position) {
        this.academicTitle = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public String toString(){
        return super.toString()+"";
    }
}

    

