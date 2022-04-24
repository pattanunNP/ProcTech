/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab13q3s6434459223;

/**
 *
 * @author arm
 */
class TransactionRecord {

    private int account_number;
    private double amount;

    public TransactionRecord(int account_number, double amount) {
        this.account_number = account_number;
        this.amount = amount;
    }

    public int getAccountNumber() {
        return this.account_number;
    }

    public void setAccountNumber(int account_number) {
        this.account_number = account_number;

    }

    public double getAmount() {
        return this.amount;
    }

    public void setAccoun(double amount) {
        this.amount = amount;
    }
}
