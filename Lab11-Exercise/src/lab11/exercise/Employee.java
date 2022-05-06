/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab11.exercise;

/**
 *
 * @author arm
 */
public abstract class Employee implements Payable {

    private String firstName;
    private String lastName;
    private String empID;

    public Employee(String first, String last, String ID) {

        firstName = first;
        lastName = last;
        empID = ID;
    }

    public void setFirstName(String first) {
        firstName = first;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String last) {
        lastName = last;
    }

    public String getLastName() {
        return lastName;
    }

    public void setEmpID(String ID) {
        empID = ID;
    }

    public String getEmpID() {
        return empID;
    }

    public String toString() {
        return String.format("%s:%s %s\nID : %s", getClass().getName(), getFirstName(), getLastName(), getEmpID());
    }

}
