/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab12q1s6434459223;

/**
 *
 * @author arm
 */
public class Employee {

    private String name;
    private int salay;

    public Employee(String name, int salary) {
        this.name = name;
        this.salay = salary;

    }

    public void setSalary(int salary) {
        this.salay = salary;
    }

    @Override
    public String toString() {

        return this.name + " =" + this.salay;
    }

}
