package lab7q1s6434459223;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {

        String primeNumbers = "";

        var input = new Scanner(System.in);

        System.out.print("Enter n: ");

        int N = input.nextInt();

        Integer[] primelist = new Integer[N];

        int checknum = 0;
        for (int i = 0; checknum < N; i++) {

            int flag = 0;

            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    flag += 1;
                }
            }
            if (flag == 1) {
                primelist[checknum] = i;
                checknum++;
            }
        }

        for (int k = 0; k < primelist.length; k++) {
            System.out.println(primelist[k]);
        }
    }

}
