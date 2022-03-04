package lab8q1s6434459223;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {

        ArrayList<Course> courseList = new ArrayList<Course>();

        var input = new Scanner(System.in);

        System.out.println("Course : Enter ID, name, Credit");

        String c_info = input.nextLine().trim();

        while (!c_info.equals("X")) {

            String[] c_info_array = c_info.split(" ", 0);

            String Subject_code = c_info_array[0];

            if (c_info_array.length == 4) {

                int Credit = Integer.parseInt(c_info_array[3]);

                String Subject_name = c_info_array[1] + c_info_array[2];

                //System.out.println(Subject_code + Subject_name + Credit);
                courseList.add(new Course(Subject_name, Subject_code, Credit));
            } else if (c_info_array.length == 5) {
                int Credit = Integer.parseInt(c_info_array[4]);
                String Subject_name = c_info_array[1] + c_info_array[2] + c_info_array[3];
                //System.out.println(Subject_code + Subject_name + Credit);
                courseList.add(new Course(Subject_name, Subject_code, Credit));

            }

            c_info = input.nextLine().trim();

        }

        System.out.println(Course.numOfCourses() + " courses");

        for (int faculty : Course.getAllFaculty()) {
            System.out.println(Course.numberOfFacCourses(faculty) + " courses for " + faculty);
        }

        //2301160 Com Prog 3
        //2301170 Prog Tech 4
        //2110110 Com Prog 3
    }
}
