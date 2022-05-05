package lab7q3s6434459223;

import java.util.Scanner;


public class Q3 {

    public static void main(String[] args) {

        Student[] student_box = new Student[3];

        Course[] course_box = new Course[5];

        var input = new Scanner(System.in);
        
        
        System.out.println("Student : Enter ID, name ");

        for (int n_student = 0; n_student < student_box.length; n_student++) {


            String s_info = input.nextLine().trim();

            String[] s_info_array = s_info.split(" ", 0);

            String student_id = s_info_array[0];

            String student_name = s_info_array[1] + " " + s_info_array[2];

            student_box[n_student] = new Student(student_id, student_name);

        }
        
        System.out.println("Course : Enter ID, name, Credit");
        for (int n_subject = 0; n_subject < course_box.length; n_subject++) {

          

            String c_info = input.nextLine().trim();

            String[] c_info_array = c_info.split(" ", 0);

            String Subject_code = c_info_array[0];

//            System.out.println(c_info_array.length);

            if (c_info_array.length == 4) {

                int Credit = Integer.parseInt(c_info_array[3]);

                String Subject_name = c_info_array[1] + c_info_array[2];

                course_box[n_subject] = new Course(Subject_name, Subject_code, Credit);

            } else {
                int Credit = Integer.parseInt(c_info_array[4]);

                String Subject_name = c_info_array[1] + c_info_array[2] + c_info_array[3];

                course_box[n_subject] = new Course(Subject_name, Subject_code, Credit);
            }

        }

        for (int n_student = 0; n_student < student_box.length; n_student++) {
            
            System.out.println(student_box[n_student].getName() + " grade report: ");

            String grade_report = input.nextLine();

            while (!grade_report.equals("X")) {


                String[] course_info = grade_report.split(" ");

                for (int course = 0; course < course_box.length; course++) {

                    if (course_info[0].equals(course_box[course].getCid())) {

                        student_box[n_student].addGradeReport(course_box[course], course_info[1]);

                    }
                  
                }
                  grade_report = input.nextLine();

            }

        }

        for (int n_student = 0; n_student < student_box.length; n_student++) {
            System.out.println("------Transcript ------");

            System.out.println(student_box[n_student].getID() + " " + student_box[n_student].getName());
            System.out.print(student_box[n_student].getReport());

            System.out.println("\nGPA: " + student_box[n_student].calGPA());

        }
    }
}
