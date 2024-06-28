import java.io.*;

public class BufferIn {
    public static void main(String[] args) throws IOException {
        // java.io.BufferedReader a = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));

        // System.out.print("Enter your name :");
        System.out.println("Enter your age : ");

        // String age = a.readLine();
        // String name = a.readLine();
        // System.out.println("your name is : " + name);

        int age1 = Integer.parseInt(a.readLine());
        // System.out.println(2*age1);

        System.out.println("Your age is : " + 2*age1);

    }
}
