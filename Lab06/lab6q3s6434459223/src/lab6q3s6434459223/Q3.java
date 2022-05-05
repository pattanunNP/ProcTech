package lab6q3s6434459223;

import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;

public class Q3 {

    public static void main(String[] args) {

        double min = 0.0;

        double max = 0.0;

        double sum = 0.0;

        int counter = 0;

        try {
            File scoreFile = new File("src/score2.txt");
            Scanner scoreReader = new Scanner(scoreFile);
            while (scoreReader.hasNextLine()) {
                String text = scoreReader.nextLine();
                double value = Double.parseDouble(text);

                sum += value;

                counter += 1;

                if (value >= max) {
                    max = value;
                }
                if (value < min) {
                    min = value;
                }
            }
            System.out.println("Average score = " + (sum / counter));
            System.out.println("Highest score = " + max);
            System.out.println("Lowest score = " + min);

            scoreReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }

    }

}
