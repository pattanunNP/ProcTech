/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package airpurifier;

/**
 *
 * @author arm
 */
public class AirPurifierTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Filter f = new Filter();
        AntibacFilter at = new AntibacFilter();

        AirPurifier a = new AirPurifier();
        a.insertFilter(f);
        a.insertFilter(at);

        a.printFilterDetails();

        a.filter(4000);
        a.printFilterDetails();

        a.filter(35000);
        a.printFilterDetails();
        
        Filter f2 = new Filter();
        a.replaceFilterAtIndex(0, f2);
        a.printFilterDetails();
    }

}
