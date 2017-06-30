/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 * @author Tan Chek Wei
 *
*/
package P4Q3;

public class Student2 {

    private String studentID, name;
    private int numberOfQuiz, totalQuizScore;
    private static double quizContribution; //Using static variable
    public Student2() {
        this("", "");
    }

    public Student2(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
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
    
    public static double getQuizContribution(){
        return quizContribution;
    }

    //Appropriate mutators
    public void setStudentID(String id) {
        studentID = id;
    }

    public void setName(String n) {
        name = n;
    }
    
    public static void setQuizContribution(double qc){
        quizContribution = qc;
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