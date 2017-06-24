/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculateTNA;

/**
 *
 * @author Chek Wei
 */
public class CalculateScore {
    public static void main(String args[]){
        java.util.Scanner in = new java.util.Scanner(System.in);
        
        CalculateTNA c1 = new CalculateTNA();
        int numOfProc = c1.getNumberofProcess();
        System.out.print("Enter number of process: ");
        numOfProc = in.nextInt();
        
        int[] score = new int[numOfProc];
        for (int i = 0; i < numOfProc; i++){
            System.out.print("Enter score " + (i+1) + ": ");
            score[i] = in.nextInt();
            c1.CalculateTotalScore(score[i]);
        }
        c1.calAverage(numOfProc);
        System.out.println("The total score is " + c1.getTotalScore());
        System.out.println("The average score is " + c1.getAverage());
    }
}
