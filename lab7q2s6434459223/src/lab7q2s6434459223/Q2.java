/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab7q2s6434459223;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author arm
 */
public class Q2 {

    public static void main(String[] args) {

        String primeNumbers = "";

        var input = new Scanner(System.in);

        System.out.print("Enter n: ");

        int N = input.nextInt();

        ArrayList<Integer> primelist = new ArrayList<>();

        int checknum = 0;
        for (int i = 0; checknum < N; i++) {

            int flag = 0;

            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    flag += 1;
                }
            }
            if (flag == 1) {
                primelist.add(i);
                checknum++;
            }
        }

        for (int k = 0; k < primelist.size(); k++) {
            System.out.println(primelist.get(k));
        }
    }

    
}
