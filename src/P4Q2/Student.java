/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P4Q2;

/**
 *
 * @author Tan Chek Wei
 *
 */
public class Student {

    private String studentID, name;
    private int numberOfQuiz, totalQuizScore;

    public Student() {
        numberOfQuiz = 0;
        totalQuizScore = 0;
    }

    public Student(String s, String n) {
        studentID = s;
        name = n;
        numberOfQuiz = 0;
        totalQuizScore = 0;
    }

    //Accessors
    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfQuiz() {
        return numberOfQuiz;
    }

    public int getTotalQuizScore() {
        return totalQuizScore;
    }

    //Appropriate mutators
    public void setStudentID(String id) {
        studentID = id;
    }

    public void setName(String n) {
        name = n;
    }

    /*    
    public void setNumberofQuiz(int n){
        numberOfQuiz = n;
    }
    
    public void setTotalQuizScore(int t){
        totalQuizScore = t;
    }
     */
    public void addQuiz(int score) {
        totalQuizScore += score;
        numberOfQuiz++;
    }

    public double getAverageScore() {
        return (double) totalQuizScore / numberOfQuiz;
    }
}
