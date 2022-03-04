/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8q2s643445922;

/**
 *
 * @author arm
 */
public class MTX {

    private int rows, columns;
    private int[][] Matrix;

    public MTX(int[][] Matrix) {
        this.rows = Matrix[0].length;
        this.columns = Matrix[1].length;

        this.Matrix = Matrix;

    }

    public int getRows() {
        return this.rows;

    }

    public int getColumns() {
        return this.columns;

    }

    public int[][] getMatrix() {

        return this.Matrix;
    }

    public static void displayMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf(matrix[i][j] + ",\t");

            }
            System.out.println("");

        }
    }

    public int[][] add(MTX m) {
        int[][] result = new int[this.rows][this.columns];

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                result[i][j] = this.Matrix[i][j] + m.Matrix[i][j];
            }
        }
        return result;

    }

    public int[][] mul(int n) {
        int[][] result = new int[this.rows][this.columns];

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                result[i][j] = this.Matrix[i][j] * n;
            }
        }

        return result;

    }

    public int[][] mul(MTX m) {
        int[][] result = new int[this.rows][m.columns];
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < m.columns; j++) {
                for (int k = 0; k < m.rows; k++) {
                    result[i][j] += this.Matrix[i][k] * m.Matrix[k][j];

                }
            }
        }
        return result;
    }

    public boolean equalSize(MTX mtx) {

        return this.columns == mtx.columns && this.rows == mtx.rows;
    }

public boolean complatible(MTX mtx) {
        return this.columns == mtx.getRows();

    }

}
