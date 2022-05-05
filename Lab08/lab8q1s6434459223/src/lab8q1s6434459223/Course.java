package lab8q1s6434459223;

import java.util.ArrayList;

public class Course {

    private String Subject_name;
    private final String Subject_code;
    private int Credit;

    static int num_course = 0;

    static ArrayList<FacCourse> facultyCourse = new ArrayList<>();

    public Course(String Subject_name, String Subject_code) {
        this.Subject_name = Subject_name;
        this.Subject_code = Subject_code;
        this.Credit = 3;

        this.newFacCourse(Subject_code);
        num_course += 1;
    }

    public Course(String Subject_name, String Subject_code, int Credit) {
        this.Subject_name = Subject_name;
        this.Subject_code = Subject_code;
        this.Credit = Credit;

        this.newFacCourse(Subject_code);
        num_course += 1;

    }

    public double calGPA() {
        double gpa = 0.0;
        return gpa;
    }

    public void setCname(String Subject_name) {
        this.Subject_name = Subject_name;
    }

    public void setCredit(int Credit) {
        this.Credit = Credit;

    }

    public String getCname() {
        return this.Subject_name;
    }

    public String getCid() {
        return this.Subject_code;
    }

    public int getCredit() {
        return this.Credit;
    }

    public boolean equals(Course CObj) {
        return this.Subject_name.equals(CObj.Subject_name)
                && this.Subject_code.equals(CObj.Subject_code)
                && this.Credit == CObj.Credit;

    }

    public String result(boolean state) {

        String result_equals = "";
        if (state == true) {
            result_equals = "Same course";
        } else if (state == false) {
            result_equals = "Different course name, course ID and credit.";
        }
        return result_equals;

    }

    @Override
    public String toString() {
        return this.Subject_code + " " + this.Subject_name + " " + this.Credit;
    }

    public int compare(Course CObj) {
        int result_code = 0;

        boolean p = this.Subject_name.equals(CObj.Subject_name);
        boolean q = this.Subject_code.equals(CObj.Subject_code);
        boolean r = this.Credit == CObj.Credit;

        if (p == true && q == true && r == true) {
            result_code = 0;
        } else if (p == true && q == false && r == true) {
            result_code = 1;
        } else if (p == false && q == true && r == true) {
            result_code = 2;
        } else if (p == true && q == true && r == false) {
            result_code = 3;
        } else if (p == false && q == true && r == false) {
            result_code = 4;
        } else if (p == true && q == false && r == false) {
            result_code = 5;
        } else if (p == false && q == false && r == true) {
            result_code = 6;
        } else if (p == false && q == false && r == false) {
            result_code = 7;
        }
        return result_code;
    }

    private int getIndexOfFaculty(int facultyCode) {
        for(int i = 0 ; i < facultyCourse.size(); i++){
            if(facultyCourse.get(i).getFacultyCode() == facultyCode){
                return i;
            }
        }
        
        return -1;
    }

    /**
     *
     * @param CourseID
     */
    public void newFacCourse(String CourseID) {
//        System.out.println(CourseID);

        int faccode = Integer.parseInt(CourseID.substring(0, 2));
        
//        System.out.println(faccode);
        
        int fac_idx = this.getIndexOfFaculty(faccode);
        
//        System.out.println(fac_idx);

        if (fac_idx != -1) {
            facultyCourse.get(fac_idx).addCourse();

        } else {
            facultyCourse.add(new FacCourse(faccode));
        }

    }

    public static ArrayList<Integer> getAllFaculty() {

        ArrayList<Integer> facultyList = new ArrayList<>();
        facultyCourse.forEach((faculty) -> facultyList.add(faculty.getFacultyCode()));
        return facultyList;
    }

    public static int numOfCourses() {

        return num_course;
    }
    public static int numberOfFacCourses(int facultyCode) {
        for(FacCourse faculty : facultyCourse){
            if(faculty.getFacultyCode() == facultyCode){
                return faculty.getNumberOfCourse();
            }
        }
        return -1;
    }
}
