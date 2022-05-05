package lab6q4s6434459223;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Student {

    /**
     * Student Class
     */
    private String name;
    private String studentid;
    private GregorianCalendar birthday;
    private int Code;
    private String sameyear_str, samelevel_str, samefac_str;


    
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
    @Override
    public Boolean equals(Student studentObj) {

        return (this.name.equals(studentObj.name)
                && this.studentid.equals(studentObj.studentid)
                && this.birthday.get(Calendar.DATE) == studentObj.birthday.get(Calendar.DATE)
                && this.birthday.get(Calendar.MONTH) == studentObj.birthday.get(Calendar.MONTH)
                && this.birthday.get(Calendar.YEAR) == studentObj.birthday.get(Calendar.YEAR));
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

    /**
     *
     * @return Faculty Code
     */
    public int getFacultyCode() {
        return Integer.parseInt(this.studentid.substring(8, 9));
    }

    public int getLevelCode() {
        //System.out.println("sub:"+this.studentid.substring(2,3));
        return Integer.parseInt(this.studentid.substring(2, 3));
    }

    public int getYear() {
        return Integer.parseInt(this.studentid.substring(0, 1));

    }

    private int getDigit(int start, int end) {

        if (start == 0 && end == 1) {
            Code = getYear();

        } else if (start == 2 && end == 2) {
            Code = getLevelCode();

        } else if (start == 8 && end == 9) {
            Code = getFacultyCode();
        }
        return Code;

    }

    public boolean sameYear(Student student) {
        return student.getDigit(0, 1) == getDigit(0, 1);
    }

    public boolean sameLevel(Student student) {
        return student.getDigit(2, 2) == getDigit(2, 2);
    }

    public boolean sameFaculty(Student student) {
        return student.getDigit(8, 9) == getDigit(8, 9);
    }

    public String SametoString(boolean sameyear, boolean samelevel, boolean samefac) {

        if (sameyear == true) {
            sameyear_str = "same year";
        } else {
            sameyear_str = "different year";
        }
        if (samefac == true) {
            samefac_str = "same faculty";
        } else {
            samefac_str = "different faculty";
        }
        if (samelevel == true) {
            samelevel_str = "same level";
        } else {
            samelevel_str = "different level";
        }

        return sameyear_str + ", " + samelevel_str + ", " + samefac_str;
    }

}
