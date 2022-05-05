package lab6q2s6434459223;

import java.util.Scanner;

import java.lang.Math;

public class Q2 {
    
    public static void main(String[] args) {
        
        var input = new Scanner(System.in);
        
           
        System.out.println("Enter a, b, c: ");
        
        String text = input.nextLine();
        
        int sum = 0 ;
     
        String[] temp = text.split(" ", 0);
        
        
        var a = Integer.parseInt(temp[0]);
        
        var b = Integer.parseInt(temp[1]);
        
        var c = Integer.parseInt(temp[2]);
        
        for (int i = a; i <= b; i++) {
            for (int j = i; j <= c * i; j++) {
                sum += (int) (Math.pow(i, 2) + j);
            }
        
        }
        System.out.println(sum);
        
    }
}