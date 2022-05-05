/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9q2s6434459223;

/**
 *
 * @author arm
 */
public class Question {

    private String text;
    private String answer;

    //* Polymorphism Design
    public Question() {

    }

    /**
     *
     * @param text
     */
    public Question(String text) {
        this.text = text;
    }

    /**
     *
     * @param answer
     */
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    /**
     *
     * @return String of answer
     */
    public String getAnwser() {

        return this.answer;
    }

    /**
     *
     * @param question
     */
    public void setQuestion(String question) {
        this.text = question;
    }

    /**
     *
     * @return String of Question
     */
    public String getQuestion() {

        return this.text;
    }

    /**
     *
     * @param response
     * @return is true?
     */
    public boolean checkAnswer(String response) {

        return this.answer.equals(response);
    }

    /**
     * This display question
     */
    public void display() {
        System.out.println(this.text);
    }
}
