// package task03june;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exception {
    public Exception(String string) {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the file path : ");
        String filePath = in.nextLine();

        try {
            BufferedReader r = new BufferedReader(new FileReader(filePath));

            String line;
            while ((line = r.readLine()) != null) {
                System.out.println(line);
            }

            r.close();
        } catch (IOException e){
            System.out.println("Error reading the file : " + e.getMessage());
        }
    }
}
