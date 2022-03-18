/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p11;

/**
 *
 * @author arm
 */
import java.lang.Math;


public class Line {
    private Point start, end;
    
    public Line (Point start, Point end){
        
        this.start = start;
        this.end = end;
    
    } 
    
    public double Length(){
        double lenght =  Math.sqrt(Math.pow(this.start.x, 2));
    
    }
}
