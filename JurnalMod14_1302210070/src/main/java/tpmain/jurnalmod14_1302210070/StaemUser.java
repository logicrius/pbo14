/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpmain.jurnalmod14_1302210070;
/**
 *
 * @author PRAKTIKAN
 */
import java.io.Serializable;

public class StaemUser implements Serializable{
    private String accountName;
    private transient String  password;
    private String alias;
    private double walletBalance;
    
    public StaemUser(){
    }
    
    public StaemUser(String acc, String pw, double wb, String alias){
        this.accountName = acc;
        this.password = pw;
        this.walletBalance = wb;
        this.alias = alias;
    }
    
    public void setAlias(String alias){
        this.alias = alias;
    }
    
    public void setWalletBalance(double wb){
        this.walletBalance = wb;
    }
    
    public String getAlias(){
        return alias;
    }
    
    public double getWalletBalance(){
        return walletBalance;
    }
    
    public void printUserDetails(){
        System.out.println("Account Name: " + this.accountName);
        System.out.println("Password: " + this.password);
        System.out.println("Alias: " + this.alias);
        System.out.println("Jumlah Balance: " + this.walletBalance);
    }
    
}
