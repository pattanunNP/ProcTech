package p11;

/**
 *
 * @author arm
 */
public class Point {

    private int x, y, z;
    private static int counter;

    //private final double gravity_force;
    /**
     *
     * @param x
     * @param y
     * @param z
     */
    // polymorphism
    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;

        counter += 1;

    }

    public static int getNumPoint() {
        return counter;
    }

    /**
     *
     * @param dx
     * @param dy
     * @param dz
     */
    public void move(double dx, double dy, double dz) {

        this.x = this.x + (int) dx;
        this.y = this.y + (int) dy;
        this.z = this.z + (int) dz;

    }

    public boolean equal(Point that) {

        return this.x == that.x && this.y == that.y && this.z == that.z;
    }

    @Override
    public String toString() {

        return "X: " + this.x + " Y: " + this.y + " Z: " + this.z;

    }

    public static void showPoint(Point that) {
        System.out.println("X: " + that.x + " Y: " + that.y + " Z: " + that.z);

    }

}
