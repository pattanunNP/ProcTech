package lab14q3s6434459223;

import java.util.Scanner;

/**
 *
 * @author arm
 */
public class Hanoi {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter number of disks : ");
        int n = inp.nextInt();
        moveDisks(n, 'A', 'B', 'C');
    }

    public static void moveDisks(int n, char from, char temp, char des) {
        if (n == 0) {
            return;
        }

        moveDisks(n - 1, from, des, temp);
        System.out.println("Move " + n + " from " + from + " to " + des);
        moveDisks(n - 1, temp, from, des);
    }

}
