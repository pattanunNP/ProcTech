/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author arm
 */
import java.util.Scanner;
        
public class q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter name:");
        String name = Sc.nextLine();
        System.out.print("Enter Age:");
        int age = Sc.nextInt();
        System.out.println(name + "was born in "+ (2565-age));

    }
    
}
