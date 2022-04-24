/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classdesign;

/**
 *
 * @author arm
 */
public abstract class NetflixMember {

    private String menber_name, member_id;
    private double subscription_fee;

    public NetflixMember(String member_name, String member_id, double subscription_fee) {
        this.menber_name = member_name;
        this.member_id = member_id;
        this.subscription_fee = subscription_fee;
    }

    public String getName() {

        return this.menber_name;
    }

    public String getID() {

        return this.member_id;
    }

    public double getSubscriptionFee() {

        return this.subscription_fee;
    }
}
