/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab11.exercise;

/**
 *
 * @author arm
 */
public class Lab11Exercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Payable payableObjects[] = new Payable[4];
        payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
        payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);

        payableObjects[2] = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
        payableObjects[3] = new SalariedEmployee("Lisa", "Barnes", "888-88-8888", 1200.00);
        System.out.println(
                "Invoices and Employees processed polymorphically:\n"); //generically process each element in array payableObjects
        for (int i = 0; i < payableObjects.length; i++) {
            System.out.println(payableObjects[i].toString() + "\n" + "payment due : " + payableObjects[i].getPaymentAmount() + "\n");
        }
    }

}


