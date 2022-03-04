package lab8q2s643445922;

import java.util.Random;

/**
 *
 * @author arm
 */
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MTX a, b, c;

        a = new MTX(randomMatrix(10, 5));

        b = new MTX(randomMatrix(10, 5));

        c = new MTX(randomMatrix(5, 3));

        System.out.println("\nA : \n");

        MTX.displayMatrix(a.getMatrix());

        System.out.println("\nB : \n");
        MTX.displayMatrix(b.getMatrix());

        System.out.println("\nC : \n");
        MTX.displayMatrix(c.getMatrix());

        System.out.println("\n A and B is equal " + a.equalSize(c) + " : \n");

        System.out.println("\nA+B : \n");

        MTX.displayMatrix(a.add(b));

        System.out.println("\n2*B : \n");

        MTX.displayMatrix(b.mul(2));

        if (a.complatible(b)) {
            System.out.println("\nA*B : \n");

            MTX.displayMatrix(a.mul(c));
        } else {
            System.out.println("\nA and B is not Completible");
        }

        if (a.complatible(c)) {
            System.out.println("\nA*C : \n");

            MTX.displayMatrix(a.mul(c));
        } else {
            System.out.println("\nA and C is not Completible");
        }

    }

    public static int[][] randomMatrix(int row, int column) {
        Random random = new Random();
        int[][] temp = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                temp[i][j] = random.nextInt(-100, 101);
            }
        }
        return temp;
    }
}
