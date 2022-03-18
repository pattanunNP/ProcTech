/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9q2s6434459223;

/**
 *
 * @author arm
 */
public class NumericQuestion extends Question {
    
    
    /**
     * 
     * @param text
     */
    public NumericQuestion(String text) {

        super(text);
    }
    
    /**
     * 
     * @param response
     * @return 
     */
    @Override
    public boolean checkAnswer(String response) {

        return Double.parseDouble(this.getAnwser()) - Double.parseDouble(response) <= 0.01;
    }
}
