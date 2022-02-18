package lab6q4s6434459223;

import java.util.Scanner;

public class Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        System.out.println("Student 1: Enter ID, name ");

        String s1_info = input.nextLine().trim();

        String[] s1_info_array = s1_info.split(" ", 0);

        String s1_studentid = s1_info_array[0];
        String s1_name = s1_info_array[1];

        var Student1 = new Student(s1_studentid, s1_name);

        System.out.println("Student 2: Enter ID, name ");
        String s2_info = input.nextLine().trim();
        String[] s2_info_array = s2_info.split(" ", 0);

        String s2_studentid = s2_info_array[0];
        String s2_name = s2_info_array[1];

        var Student2 = new Student(s2_studentid, s2_name);

        System.out.println(
                Student1.SametoString(
                        Student1.sameYear(Student2),
                        Student1.sameLevel(Student2),
                        Student1.sameFaculty(Student2)
                )
        );

    }

}
// 6434459223 s
// 6434459221 s
