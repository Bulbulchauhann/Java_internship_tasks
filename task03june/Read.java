package task03june;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read {
    public static void main(String[] args) {
        String filePath = "Append.txt";

        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }            
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
