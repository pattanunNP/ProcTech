/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6q1s6434459223;

/**
 *
 * @author arm
 */
public class Grade {

    public Grade() {

    }

    public float GradeCodeCovertor(String GradeCode) {

        switch (GradeCode) {

            case "A":
                return (float) 4.00;
            case "B+":
                return (float) 3.50;
            case "B":
                return (float) 3.00;
            case "C+":
                return (float) 2.50;
            case "C":
                return (float) 2.00;
            case "D+":
                return (float) 1.50;
            case "D":
                return (float) 1.00;
            case "F":
                return (float) 0.00;
            default:
                return (float) 0.00;

        }

    }

}
