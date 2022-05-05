/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10q1s6434459223;

/**
 *
 * @author arm
 */
public class MGenCard {

    public static int memberFee = 150;
    public static int cnt = 0;
    private int number;
    private String name;
    private int point;

    public MGenCard(String name) {
        cnt++;
        this.number = cnt;
        this.name = name;
    }

    public void usePoint() {
        // ให้ใช้แต้ม 20 แต้มแลกตั๋วฟรีได้ครั้งละ 1 ใบเท่านั้น แล้วแสดงข้อความว่า You got a free Cinema ticket   
        if (point >= 20) {
            System.out.println("You got a free Cinema ticket");
            point -= 20;
        } else {
            System.out.println("You don't have enough points");
            // ก่อนจบ method ให้เรียก toString() เพื่อสั่งพิมพ์ค่า ณ ปัจจุบัน
        }
        System.out.println(toString());
    }

    public void buyTicket(Cinema c, int n_ticket) {

        double total = c.getTicketPrice() * n_ticket;

        this.point += (int) total / 50;

        String cname = c.getName();
        System.out.println(cname + " Total amount: " + total);

        System.out.println(toString());

    }
    
    @Override
    public String toString() {
        String str = "iconcineconic.MGenCard[number:" + this.number + ", " + "name : " + this.name + ", point : " + this.point + "]";

        return str;
    }

    

}
