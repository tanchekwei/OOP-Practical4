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
public class CalculateTNA {
    int numberOfScore, scores, totalScore;
    double average;
    
    public CalculateTNA(){
        
    }
    
    public CalculateTNA(int nop, int s){
        numberOfScore = nop;
        scores = s;
        totalScore = 0;
        average = 0;
    }
    
    public void CalculateTotalScore(int sc){
        totalScore = totalScore + sc;
    }
    
    public void calAverage(int nop){
        average = totalScore / nop;
    }
    
    public int getNumberofProcess(){
        return numberOfScore;
    }
    
    public int getScore(){
        return scores;
    }
    
    public int getTotalScore(){
        return totalScore;
    }
    
    public double getAverage(){
        return average;
    }
}
