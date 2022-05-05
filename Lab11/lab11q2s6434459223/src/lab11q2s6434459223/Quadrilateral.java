package lab11q2s6434459223;

/**
 *
 * @author arm
 */
import java.awt.Point;

public abstract class Quadrilateral {

    private Point a, b, c, d;

    public Quadrilateral(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        a = new Point(x1, y1);
        b = new Point(x2, y2);
        c = new Point(x3, y3);
        d = new Point(x4, y4);
    }

    public double[] getSortedDist() {

        double[] dis = new double[6];
        dis[0] = a.distance(b);
        dis[1] = a.distance(c);
        dis[2] = a.distance(d);
        dis[3] = b.distance(c);
        dis[4] = b.distance(d);
        dis[5] = c.distance(d);

        for (int i = 0; i < dis.length; i++) {
            for (int j = i + 1; j < dis.length; j++) {
                double tmp;
                if (dis[i] > dis[j]) {
                    tmp = dis[i];
                    dis[i] = dis[j];
                    dis[j] = tmp;
                }
            }
        }
        return dis;
    }

    @Override
    public String toString() {

        return a + "\n" + b + "\n" + c + "\n" + d;
    }

    public abstract double area();
}
