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
import java.util.Calendar;


public class Student {
    
   /**
    *  Student Class
    */
    private String name;
    private String studentid;
    private GregorianCalendar birthday;
    
 
    
    
    public Student(String studentid, String name){
        
        this.name = name;
        this.studentid = studentid;
        this.birthday = new GregorianCalendar();
    }
    public Student(String studentid, String name, int  brithdate, int month, int year){
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
    public void setBD( int brithdate, int month, int year){
        
        this.birthday = new GregorianCalendar(year, month, brithdate);
          
    }
    
    /**
     * 
     * @param name 
     */
    public void setName(String name ){
        this.name = name;
    }
    
    /**
     * 
     * @return name of the object
     */
    public String getName(){
        return this.name;
    }
    /**
     * 
     * @return Age of student calculate by current year - birth year
     */ 
    public int getAge(){
        var current_year = new GregorianCalendar();
        return current_year.get(Calendar.YEAR) - this.birthday.get(Calendar.YEAR); 
    }
    
    /**
     * 
     * @return id of student 
     */
    public String getID(){
        return this.studentid; 
    }
    
    /**
     * 
     * @param days
     * @return 
     */
    public int dayToYears(int days){
        return days/365;
    }
    /**
     * 
     * @param studentObj
     * @return is equals
     */
    public Boolean equals(Student studentObj){
     
       return (new String(this.name).equals( new String(studentObj.name)) &&
               new String(this.name).equals( new String(studentObj.name)) &&
               this.birthday.get(Calendar.DATE) == studentObj.birthday.get(Calendar.DATE) &&
               this.birthday.get(Calendar.MONTH) == studentObj.birthday.get(Calendar.MONTH) &&               
               this.birthday.get(Calendar.YEAR) == studentObj.birthday.get(Calendar.YEAR));
             
        
    }
    /**
     * 
     * @return string of student info 
     */
    
    public String toString(){
        return this.name + " " + this.studentid +" "+
                this.birthday.get(Calendar.DATE)+
                " "+ (this.birthday.get(Calendar.MONTH)+1 )+
                " "+this.birthday.get(Calendar.YEAR);
    }
   public String matchinfo(Boolean ismatch){
       if (ismatch == true){
           return "same";
       }else{
           return "not same";
       }
   }
  
    
}
