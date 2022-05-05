/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab9q2s6434459223;

/**
 *
 * @author arm
 */
import java.util.Scanner;

public class QuestionTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Question[] quiz = new Question[4];

        quiz[0] = new Question("Who was the inventor of Java?");
        quiz[0].setAnswer("James Gosling");

        ChoiceQuestion question = new ChoiceQuestion("In which country was the inventor of Java born?");

        question.addChoice("Australia", false);
        question.addChoice("Canada", true);
        question.addChoice("Denmark", false);
        question.addChoice("United States", false);

        quiz[1] = question;
        quiz[2] = new NumericQuestion("4.5 -2.3 = ?");
        quiz[2].setAnswer("2.2");

        FillInQuestion fiQuestion = new FillInQuestion();
        fiQuestion.constructQuestionAndAnswer("The method that returns a string representation for each object is _toString_");
        quiz[3] = fiQuestion;
        Scanner in = new Scanner(System.in);

        for (Question q : quiz) {
            q.display();
            System.out.print("Your answer: ");
            String response = in.nextLine();
            System.out.println(q.checkAnswer(response));
        }
    }

}
