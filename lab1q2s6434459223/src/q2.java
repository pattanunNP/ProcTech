
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arm
 */
public class q2 {
    
    public static void main(String[] args) {
                    Scanner Sc = new Scanner(System.in);
                    System.out.print("Enter name:");
                    String name = Sc.nextLine();
                    System.out.print("Enter brith year:");
                    int year = Sc.nextInt();
                    System.out.println(name+" is "+(2565-year)+" years old.");
 
          }
}
