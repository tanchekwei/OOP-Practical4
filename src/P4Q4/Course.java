/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P4Q4;

/**
 *
 * @author Tan Chek Wei
 */
public class Course {
    private String courseTitle;
    private double feesPerStudent;
    private int noOfStudents;
    private String[] studentNames = new String[100];
    private static int courseCount;
    
    public Course(String courseTitle, double feesPerStudent){
        
    }
    
    public String getCourseTitle(){
        return courseTitle;
    }
    
    public double getFeesPerStudent(){
        return feesPerStudent;
    }
    
    public int getNoOfStudents(){
        return noOfStudents;
    }
    
    public String[] getStudentNames(){
        return studentNames;
    }
    
    public int getCourseCount(){
        return courseCount;
    }
    
    public void setCourseTitle(String c){
        courseTitle = c;
    }
    
    public void setFeesPerStudent(double f){
        feesPerStudent = f;
    }
    
    public void setNoOfStudents(int n){
        noOfStudents = n;
    }
    
    public void setStudentNames(String[] s){
        studentNames = s;
    }

    public void setStudentNames(int c){
        courseCount = c;
    }
    
    public double calcFeesCollected(){
        
    }
}
