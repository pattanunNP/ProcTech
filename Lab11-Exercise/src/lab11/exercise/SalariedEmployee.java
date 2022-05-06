package lab11.exercise;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author arm
 */
public class SalariedEmployee extends Employee {

    private double weeklySalary;

    public SalariedEmployee(String first, String last, String ID, double salary) {
        super(first, last, ID);
        setWeeklySalary(salary);
    }

    public void setWeeklySalary(double salary) {
        weeklySalary = salary < 0.0 ? 0.0 : salary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }/* calculate earnings; implement interface Payable method that was abstract in superclass Employee */
    public double getPaymentAmount() {
        return getWeeklySalary();
    }

    public String toString() {
        return String.format("%s\nweekly salary: %s", super.toString(), getWeeklySalary());
    }
}
