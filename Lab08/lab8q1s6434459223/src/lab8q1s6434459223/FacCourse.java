package lab8q1s6434459223;


public class FacCourse {

    private int numFacCourse;
    private final int FacCode;

    public FacCourse(int faccode) {
        this.FacCode = faccode;
        this.numFacCourse = 1;

    }

    public void addCourse() {
        this.numFacCourse++;
    }

    public int getFacultyCode() {
        return this.FacCode;
    }

    public int getNumberOfCourse() {
        return this.numFacCourse;
    }

}
