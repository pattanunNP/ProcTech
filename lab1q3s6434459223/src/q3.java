
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author arm
 */
public class q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner Sc = new Scanner(System.in);
          System.out.print("Enter a number:");
          float n1 = Sc.nextFloat();
          System.out.print("Enter another number:");
          float n2 = Sc.nextFloat();
          System.out.println("The ratio between their product and their sum is "+((n1*n2)/(n1+n2)));
 
    }
    
}
