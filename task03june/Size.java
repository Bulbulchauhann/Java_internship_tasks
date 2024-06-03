// package task03june;

import java.io.File;

public class Size {
    public static void main(String[] args) {
        String filePath = "Append.txt";

        File file = new File(filePath);

        if (file.exists()) {
            long fileSizeBytes = file.length();

            double fileSizeKb = (double) fileSizeBytes / 1024;
            double fileSizeMb = fileSizeKb / 1024;

            // Display the file size in bytes, kilobytes, and megabytes
            System.out.println("File Size:");
            System.out.println("Bytes: " + fileSizeBytes);
            System.out.println("Kilobytes: " + fileSizeKb);
            System.out.println("Megabytes: " + fileSizeMb);
        } else {
            // If the file does not exist, display an error message
            System.out.println("File does not exist.");
        }
    }    
}
