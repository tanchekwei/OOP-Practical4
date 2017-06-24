/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P4Q2;

/**
 *
 * @author Chek Wei
 */
public class Student {

    String studentID, name;
    int numberOfQuiz, totalQuizScore;

    public Student() {

    }

    public Student(String s, String n) {
        studentID = s;
        name = n;
    }
    
    //Accessors
    public String getStudentID(){
        return studentID;
    }
    
    public String getName(){
        return name;
    }
    
    public int getNumberOfQuiz(){
        return numberOfQuiz;
    }
    
    public int getTotalQuizScore(){
        return totalQuizScore;
    }
    
    //Mutators
    public void setName(String n){
        name = n;
    }
    
    public void setNumberofQuiz(int n){
        numberOfQuiz = n;
    }
    
    public void setTotalQuizScore(int t){
        totalQuizScore = t;
    }
    
    public void addQuiz(int score) {
        //????
    }
    
    public int getTotalScore(){
        //??????
        return totalQuizScore; //????;
    }
    
    public double getAverageScore(){
        return (double)totalQuizScore / numberOfQuiz;
    }
}
