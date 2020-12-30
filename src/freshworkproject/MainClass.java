/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freshworkproject;

/**
 *
 * @author kashif
 */
import java.io.*;
import java.util.*;
public class MainClass {
    public static void main(String[] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        Work w1=new Work();
        w1.name=sc.nextLine();
        w1.address=sc.nextLine();
        w1.email=sc.nextLine();
        w1.telephone=sc.nextLine();
        PropertyWorkPersister persister=new PropertyWorkPersister();
        persister.serialiseWork(w1);
        
    }
    
}