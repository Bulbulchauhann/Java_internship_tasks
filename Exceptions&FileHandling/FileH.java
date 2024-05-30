import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileH {
    public static void main(String[] args) {
        // File a = new File("hello.txt");  //can also give path here only
        // try{
        //     if(a.createNewFile()){
        //     System.out.println("Created Successfuly");
        //     }
        //     else{
        //         System.out.println("File Already Exists !");
        //     }
        // }
        // catch(Exception e) {
        //     System.out.println("File Not Created");
        // }


        // File b = new File("C:\\Users\\Lenovo\\Downloads\\Java Programming.txt");
        // if(b.exists()){
        //     // System.out.println("File found");
        //     System.out.println("File name is - " + b.getName());
        //     System.out.println("File's Path is - " + b.getAbsolutePath());
        //     System.out.println("parent is - " + b.getParent());
        //     System.out.println("Size of the file - " + b.length() + " bytes."); //size in bytes
        //     System.out.println("is file readable? " + b.canRead());
        //     System.out.println("is file writeable? " + b.canWrite());
        // }
        // else{
        //     System.out.println("File not found");
        // }


        // try{
        // FileWriter a = new FileWriter("hello.txt"); 
        // a.write("Written using java");
        // a.close();
        // System.out.println("File Written successfully");
        // }
        // catch(Exception e) {
        //     System.out.println("File cannot be written");
        // }

        // try{
        //     File a = new File("hello.txt");
        //     Scanner b = new Scanner(a);
        //     String data = b.nextLine();
        //     System.out.println(data);
        //     // while(b.hasNextLine()){
        //     //     String data = b.nextLine();
        //     //     System.out.println(data);
                
        //     // }
        // }
        // catch (Exception e) {

        // }

        File a = new File("hello.txt");

        if(a.exists()){
            a.delete();
            System.out.println("File deleted successfully");
        } else {
            System.out.println("File Not found");
        }



       
    }
}
