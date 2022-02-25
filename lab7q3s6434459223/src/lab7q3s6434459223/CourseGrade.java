package lab7q3s6434459223;

//import java.util.ArrayList;
public class CourseGrade {

    private String GradeCode;
    private Course course;

    public CourseGrade(Course course, String grade) {
        this.GradeCode = grade;
        this.course = course;

    }

    public Course getCourse() {

        return this.course;
    }

    public String getCourseInfo() {
        return this.course.getCid() + " " + this.course.getCname() + " " + this.course.getCredit() + " " + this.GradeCode;
    }

    public double GradeCodeConvertor() {

        switch (this.GradeCode) {

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
