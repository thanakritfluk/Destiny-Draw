/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package destinydraw;

/**
 *
 * @author Piyaphol Wiengperm
 * @author Thanakrit Daowrueang
 */
public class Money {

    public static boolean isEnough(long money) {
        if (money < 0) {
            return false;
        }
        return true;
    }
}
