/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpmain.jurnalmod14_1302210070;

import java.io.*;

/**
 *
 * @author PRAKTIKAN
 */
public class FileStorageHelper{
    
    public static void saveToFile(Object obj, String filename){
        try{
            FileOutputStream fileOut = new FileOutputStream(filename);
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(obj);
        }catch(IOException e){
            System.out.println(e.toString());
        }
    }
    
    public static Object loadFromFile(String filename){
        Object data = new Object();
        
        try{
            FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream objIn = new ObjectInputStream(fileIn);
            data = (Object) objIn.readObject();
        }catch(IOException | ClassNotFoundException e){
            System.out.println(e.toString());
        }
        return data;
    }
}
