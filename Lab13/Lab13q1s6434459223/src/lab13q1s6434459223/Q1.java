/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab13q1s6434459223;

/**
 *
 * @author arm
 */
import java.io.FileWriter;
import java.io.File;  // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Q1 {

    public static void main(String[] args) {
        
        int lines = 0;
        int charectors = 0;
        int words = 0; 
        
        var input = new Scanner(System.in);
        String text = input.nextLine().trim();

        ArrayList<String> inputtext = new ArrayList<String>();

        while (!text.equals("quit")) {
            inputtext.add(text);
            text = input.nextLine().trim();
        }
        try {
            try (FileWriter myWriter = new FileWriter("sequential.txt")) {
                for (String str : inputtext) {
                    myWriter.write(str + System.lineSeparator());
                }
            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        
        try {
            File myRead = new File("sequential.txt");
            try (Scanner myReader = new Scanner(myRead)) {
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    words += data.split(" ").length;
                    charectors += data.length();
                    lines  += 1;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
        System.out.println(String.format("Total charecters: %d", charectors ));
        System.out.println(String.format("Total words: %d", words ));
        System.out.println(String.format("Total lines: %d",lines ));
    }
}
