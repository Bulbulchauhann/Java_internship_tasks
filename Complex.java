//24-May-2024/ Task-4/ Adding two complex numbers

public class Complex {
    
  public static void main(String[] args) {
    int n1, n2, n3, n4;
      n1=1;
      n2=2;
      n3=3;
      n4=4;
      String n5 = n1 + " + " + n2 + "i";
      String n6 = n3 + " + " + n4 + "i";

      int real = n1 + n3;
      int imaginary = n2 + n4;
      String sum = real + " + " + imaginary + "i";
      
      System.out.println("First Complex number : " + n5);
      System.out.println("Second Complex number : " + n6);
      System.out.println("Sum of both: " + sum);
      
  }
}
