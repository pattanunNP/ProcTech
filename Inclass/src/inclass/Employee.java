/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inclass;

/**
 *
 * @author arm
 */
public abstract class Employee {
    
    private String firstname, lastname,id;

    public Employee(String firstname, String lastname, String id) {
        this.firstname = firstname;
        this.lastname = lastname;
    
    }

    public String toString() {
        String str ="";
        
        return str;
    }

    public abstract Double earning() {

    }
}