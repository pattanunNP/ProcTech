/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10q2s6434459223;

/**
 *
 * @author arm
 */
public class Customer {

    private String name, tel;

    public Customer(String name, String tel) {
        this.name = name;
        this.tel = tel;

    }
    
    

    @Override
    public String toString() {

        return this.name + " tel: " + this.tel;
    }
}
