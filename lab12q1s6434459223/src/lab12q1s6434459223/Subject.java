/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab12q1s6434459223;

/**
 *
 * @author arm
 */
public class Subject implements Evaluation {
     private String subjName;
    private int[] score;
    
    public Subject(String subjName, int[] score){
        this.subjName = subjName;
        this.score = score;
    }

    @Override
    public double evaluate() {
        int total = 0;
        int count = score.length;
        
        for (int sc: score){
            total += sc;
        }
        
        return (double) total / count;
    }

    @Override
    public char grade(double score) {
        return score >= 70 ? 'P' : 'F';
    }
    
    @Override
    public String toString(){
        return this.subjName;
    }
}
