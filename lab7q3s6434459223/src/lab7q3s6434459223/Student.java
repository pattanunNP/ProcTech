package lab7q3s6434459223;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class Student {

    /**
     * Student Class
     */
    private String name;
    private String studentid;
    private GregorianCalendar birthday;
    private ArrayList<CourseGrade> transcripts = new ArrayList<>();

    public Student(String studentid, String name) {

        this.name = name;
        this.studentid = studentid;
        this.birthday = new GregorianCalendar();
    }

    public Student(String studentid, String name, int brithdate, int month, int year) {
        this.name = name;
        this.studentid = studentid;
        this.birthday = new GregorianCalendar(year, month, brithdate);
    }

    /**
     *
     * @param brithdate
     * @param month
     * @param year
     */
    public void setBD(int brithdate, int month, int year) {

        this.birthday = new GregorianCalendar(year, month, brithdate);

    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return name of the object
     */
    public String getName() {
        return this.name;
    }

    /**
     *
     * @return Age of student calculate by current year - birth year
     */
    public int getAge() {
        var current_year = new GregorianCalendar();
        return current_year.get(Calendar.YEAR) - this.birthday.get(Calendar.YEAR);
    }

    /**
     *
     * @return id of student
     */
    public String getID() {
        return this.studentid;
    }

    /**
     *
     * @param days
     * @return
     */
    public int dayToYears(int days) {
        return days / 365;
    }

    /**
     *
     * @param studentObj
     * @return is equals
     */
    public Boolean equals(Student studentObj) {

        return this.name.equals(studentObj.name)
                && this.studentid.equals(studentObj.studentid)
                && this.birthday.get(Calendar.DATE) == studentObj.birthday.get(Calendar.DATE)
                && this.birthday.get(Calendar.MONTH) == studentObj.birthday.get(Calendar.MONTH)
                && this.birthday.get(Calendar.YEAR) == studentObj.birthday.get(Calendar.YEAR);

    }

    /**
     *
     * @return string of student info
     */
    @Override
    public String toString() {
        return this.name + " " + this.studentid + " "
                + this.birthday.get(Calendar.DATE)
                + " " + (this.birthday.get(Calendar.MONTH) + 1)
                + " " + this.birthday.get(Calendar.YEAR);
    }

    public String matchinfo(Boolean ismatch) {
        if (ismatch == true) {
            return "same";
        } else {
            return "not same";
        }
    }

    public void addGradeReport(Course course, String grade) {
        var courseobj = new CourseGrade(course, grade);

        transcripts.add(courseobj);

    }

    public double calGPA() {

        double sum_grade = 0.0;
        int sum_credit = 0;

        for (int counter = 0; counter < transcripts.size(); counter++) {
            var course_grade = transcripts.get(counter);

            sum_credit += course_grade.getCourse().getCredit();

            sum_grade += course_grade.GradeCodeConvertor() * course_grade.getCourse().getCredit();

        }

        return sum_grade / sum_credit;
    }

    public String getReport() {
        String report = "";

        for (int k = 0; k < this.transcripts.size(); k++) {
            report += "\n" + this.transcripts.get(k).getCourseInfo();
        }
        return report;
    }

    public ArrayList getTranscripts() {
        return this.transcripts;
    }
}
