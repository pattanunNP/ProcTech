/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9q2s6434459223;

/**
 *
 * @author arm
 */
import java.util.Scanner;

public class FillInQuestion extends Question {
    
    
    /**
     * Empty Constructor 
     */
    public FillInQuestion() {

    }
    /**
     * 
     * @param questionText 
     */
    public void constructQuestionAndAnswer(String questionText) {
        Scanner parser = new Scanner(questionText);
        
        parser.useDelimiter("_");
        
        String question = parser.next();
        String answer = parser.next();
        parser.close();
        question += " ";
        for (int i = 0; i < answer.length(); i++) {
            question += "_ ";
        }
        this.setQuestion(question);
        this.setAnswer(answer);
        parser.close();
    }
}
