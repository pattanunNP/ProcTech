/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9q2s6434459223;

import java.util.ArrayList;

/**
 *
 * @author arm
 */
public class ChoiceQuestion extends Question {

    private ArrayList<String> choices = new ArrayList<>();

    public ChoiceQuestion(String text) {
        super(text);

    }

    public void addChoice(String choice, boolean correct) {
        choices.add(choice);
        if (correct) {
            this.setAnswer(choice);
        }
    }

    @Override
    public boolean checkAnswer(String response) {

         return choices.indexOf(this.getAnwser())+1 == Integer.parseInt(response);

    }

    @Override
    public void display() {
        for (int i = 0; i < choices.size(); i++) {

            System.out.println(i + 1 + ": " + choices.get(i));
        }

    }
    
  

}
