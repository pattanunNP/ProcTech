/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5q2s6434459223;

/**
 *
 * @author arm
 */
public class Course {

    private String Subject_name, Subject_code;
    private int Credit;

    public Course(String Subject_name, String Subject_code) {
        this.Subject_name = Subject_name;
        this.Subject_code = Subject_code;
        this.Credit = 3;
    }

    public Course(String Subject_name, String Subject_code, int Credit) {
        this.Subject_name = Subject_name;
        this.Subject_code = Subject_code;
        this.Credit = Credit;
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
}
