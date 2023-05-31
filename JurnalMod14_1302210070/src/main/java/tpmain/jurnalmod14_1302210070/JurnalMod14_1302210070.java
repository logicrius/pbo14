/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tpmain.jurnalmod14_1302210070;

/**
 *
 * @author PRAKTIKAN
 */
public class JurnalMod14_1302210070 {

    public static void main(String[] args) {
        LocalPCStaem pcStaem1 = new LocalPCStaem();
        LocalPCStaem pcStaem2 = new LocalPCStaem();
        
        pcStaem1.addStaemUser(new StaemUser("robert", "iron", 1000000, "tony"));
        pcStaem1.addStaemUser(new StaemUser("chris", "captain", 150000, "steve"));
        pcStaem1.addStaemUser(new StaemUser("scarlett", "black", 250000, "natasha"));
        pcStaem1.addStaemUser(new StaemUser("tom", "spider", 10000, "peter"));
        
        pcStaem1.saveUsersDatatoFile();
        
        System.out.println("Staem Account List:");
        
        pcStaem2.loadUsersDataFromFile();
    }
}
