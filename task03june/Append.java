// package task03june;

import java.io.File;
import java.io.FileWriter;

public class Append {
    public static void main(String[] args) {
        File File1 = new File ("Append.txt");
        try{
            if(File1.createNewFile()){
            System.out.println("Created Successfuly");
            }
            else{
                System.out.println("File Already Exists !");
            }
        }
        catch(Exception e) {
            System.out.println("File Not Created");
        }


        //APPENDING TEXT
        try{
        FileWriter a = new FileWriter("Append.txt"); 
        a.write("This is a appended text");
        a.close();
        System.out.println("File Written successfully");
        }
        catch(Exception e) {
            System.out.println("File cannot be written");
        }
    }
}
