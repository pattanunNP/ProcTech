/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

/**
 *
 * @author arm
 */


import java.util.GregorianCalendar;


public class Student {
    
    private String name;
    private String studentid;
    private GregorianCalendar brithday;
    
 
    
    
    public Student(String studentid, String name){
        this.name = name;
        this.studentid = studentid;
        this.brithday = new GregorianCalendar();
    }
    public Student(String studentid, String name, int  brithdate, int month, int year){
        this.name = name; 
        this.studentid = studentid;
        this.brithday = new GregorianCalendar(year, month, brithdate);
    } 
    public void setBD(GregorianCalendar brithday){
        this.brithday = brithday;
             
    }
    
    public void setName(String name ){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getID(){
        return this.studentid; 
    }
    public Boolean equals(Student studentObj){
       return (studentObj.name == this.name &&
               studentObj.studentid == this.studentid &&
               this.brithday == studentObj.brithday);
       
        
    }
    
  

    
}
