/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P4Q3;
/**
 *
 * @author Tan Chek Wei
 */
public class P4Q3 {
    public static void main(String[] args) {
        Student2.setQuizContribution(20);
        
        //Student 1
        Student2 student1 = new Student2("16WMD02116", "Tan Chek Wei");
        student1.addQuiz(8);
        student1.addQuiz(9);
        student1.addQuiz(6);
        
        //Student 2
        Student2 student2 = new Student2();
        student2.setStudentID("16WMD03759");
        student2.setName("Tan Han Zong");
        student2.addQuiz(10);
        student2.addQuiz(9);
        student2.addQuiz(10);
        
        System.out.println("\nStudent 1:");
        System.out.println("----------");
        System.out.println("Student ID  : " + student1.getStudentID());
        System.out.println("Student name: " + student1.getName());
        System.out.println("Total score : " + student1.getTotalQuizScore());
        System.out.println("Average     : " + String.format("%.2f",student1.getAverageScore()));
        
        
        System.out.println("\nStudent 2:");
        System.out.println("----------");
        System.out.println("Student ID  : " + student2.getStudentID());
        System.out.println("Student name: " + student2.getName());
        System.out.println("Total score : " + student2.getTotalQuizScore());
        System.out.println("Average     : " + String.format("%.2f",student2.getAverageScore()));
        
        if(student1.getTotalQuizScore() > student2.getTotalQuizScore())
            System.out.println("\n" + student1.getName() + "'s total score is higher than " + student2.getName() + ".");
        else if(student1.getTotalQuizScore() == student2.getTotalQuizScore())
            System.out.println("\n" + student1.getName() + "'s total score is equal to " + student2.getName() + ".");
        else
            System.out.println("\n" + student2.getName() + "'s total score is higher than " + student1.getName() + ".");
    
        System.out.println("Quiz contribution of " + student1.getName() + " is " + String.format("%.2f", student1.getAverageScore()/10*Student2.getQuizContribution()));
        System.out.println("Quiz contribution of " + student2.getName() + " is " + String.format("%.2f", student2.getAverageScore()/10*Student2.getQuizContribution()));
    }
}
