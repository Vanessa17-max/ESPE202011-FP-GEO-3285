/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;
/**
 *
 * @author FAMILIA TONATO
 */
public class FileManager {
 
 public static boolean createFile (String fileName){
     boolean created = false;
    
     try{
         File file = new File(fileName + ".txt");
           if(file.createNewFile()){
           System.out.println("File was Created");
           
           created = true;
           
           }else{
              System.out.println("File already Exists");  
              created = false;
           }          
     }catch (IOException ex){
         ex.printStackTrace();
         created = false;
     }
     return created;
 }   
 
 public static boolean save (String data,String fileName){
     boolean saved = false;
     
     createFile(fileName);
     
     try{
       FileWriter myWrite = new FileWriter(fileName + ".txt", true);
       myWrite.write(System.getProperty("line.separator") + data);
       myWrite.close();
       System.out.println("A new record of " + fileName + " was saved");
       saved = true; 
     }catch (IOException ex){
         ex.printStackTrace();
         saved = false;
 }
     return saved;
}
  public static String read (String fileName){
      
      String text = " ";
      
      try{
          Scanner s = new Scanner(new File(fileName));
      while(s.hasNextLine()){    
          text = text + s.hasNextLine() +  "\n";
         }
      }
      catch(FileNotFoundException e){
     System.out.println("file not found");
  }
        return text;
      }
}