/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classdesign;

/**
 *
 * @author arm
 */
import java.util.Arrays;

public class NetflixBasic extends NetflixMember {

    private static final String VIDEO_QUALITY = "Best";

    private static final int DEVICES = 1;

    private static final String[] allowed_devices = {"Phone", "Tablet", "Computer", "TV"};

    public NetflixBasic(String member_name, String member_id, double subscription_fee) {

        super(member_name, member_id, subscription_fee);

    }

    public static String getVideoQuality() {

        return VIDEO_QUALITY;

    }

    public static int getDevice() {

        return DEVICES;

    }

    public String watch(String moive_name, String device) {

        if (Arrays.asList(allowed_devices).contains(device)) {
            return super.getName() + "is watching" + moive_name;
        } else {
            return super.getName() + "not allowed to watch from" + device;
        }

    }

}
