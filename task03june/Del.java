// package task03june;

import java.io.File;

public class Del {
    public static void main(String[] args) {
         File a = new File("hello.txt");

        if(a.exists()){
            a.delete();
            System.out.println("File deleted successfully");
        } else {
            System.out.println("File Not found");
        }

    }
}
