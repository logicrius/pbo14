/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpmain.jurnalmod14_1302210070;

import java.util.ArrayList;
/**
 *
 * @author PRAKTIKAN
 */
public class LocalPCStaem {
    private ArrayList<StaemUser> localUsers;
    private final String LOCAL_DB_USERS_FILE = "loc_db.dat";
    
    public LocalPCStaem(){
        localUsers = new ArrayList<StaemUser>();   
    }
    
    public void addStaemUser(StaemUser user){
        localUsers.add(user);
    }
    
    public void saveUsersDatatoFile(){
        FileStorageHelper.saveToFile(this.localUsers, LOCAL_DB_USERS_FILE);
    }
    
    public void loadUsersDataFromFile(){
        localUsers = (ArrayList<StaemUser>)FileStorageHelper.loadFromFile(LOCAL_DB_USERS_FILE);
        for (int i = 0; i < localUsers.size(); i++) {
            System.out.println("#Account: " + (i + 1));
            localUsers.get(i).printUserDetails();
            System.out.println("");
        }
    }
}
