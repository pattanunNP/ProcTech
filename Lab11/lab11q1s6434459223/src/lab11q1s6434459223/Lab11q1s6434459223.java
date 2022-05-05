package lab11q1s6434459223;

/**
 *
 * @author arm
 */
import java.util.ArrayList;

public class Lab11q1s6434459223 {

    public static void main(String[] args) {

        Expo exp = new Expo(7, 1);
        exp.printValue();

        Sine sin = new Sine(7, Math.PI / 4);
        sin.printValue();

        Cosine cos = new Cosine(7, 1);
        cos.printValue();

        Taylor[] func_set = {new Expo(7, 1), new Sine(7, Math.PI / 4), new Cosine(7, 1)};
        
        for (Taylor func : func_set) {
            func.printValue();
        } 
    }

}
