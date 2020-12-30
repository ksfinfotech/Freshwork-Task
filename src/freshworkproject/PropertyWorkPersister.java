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
import java.util.*; 
import java.io.*;
public class PropertyWorkPersister{
     Scanner sc=new Scanner(System.in);
    
    public void serialiseWork(Work work)throws IOException{
        Properties properties = new Properties();
        
        properties.setProperty("name",work.name);
        properties.setProperty("address",work.address);
        properties.setProperty("telephone",work.telephone);
        properties.setProperty("email",work.email);
        File file=new File("Client work.json");
        FileWriter fw =new FileWriter("Client work.json");
        properties.store(fw, "Client Details");
        fw.close();
         System.out.println("If you want to delete client file?");
        System.out.println("enter Yes/No");
        String input=sc.nextLine();
       
        if(input.equalsIgnoreCase("Yes")){
            file.delete();
           System.out.println(file.getName()+" is deleted");
                 } 
        else
        {
          System.out.println(file.getName()+" file is successfully saved");   
        }
    
    }   
    }
