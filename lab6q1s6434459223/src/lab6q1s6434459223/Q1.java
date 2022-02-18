package lab6q1s6434459223;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var gradeUtil = new Grade();

        float sum_grade = 0;
        int sum_credit = 0;
        float grade;
        int credit = 0;

        String text = "";

        System.out.println("Enter course ID, credit, and grade; or X to terminate.");

        //System.out.println(text);

        while (!text.equals("X")) {

            text = input.nextLine();

            //System.out.println(text);

            String[] temp = text.split(" ", 0);

            if (temp.length > 2) {

                grade = gradeUtil.GradeCodeCovertor(temp[2]);

                credit = Integer.parseInt(temp[1]);

                sum_grade += grade * credit;

                sum_credit += credit;

                //System.out.println("Grade :" + sum_grade);

                //System.out.println("Credit :" + sum_credit);
            }

        }
        
        System.out.println("GPA = " + (sum_grade / sum_credit));
        
    }

}
