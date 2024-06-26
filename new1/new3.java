@FunctionalInterface
interface A{
    int add (int a, int b);//function
    // int sub (int a, int b);
}

public class new3 { //main class
    public static void main(String[] args) { //main method
        // A obj = new A();
        
        // {
            // public int add(int a, int b) {
            //     return a + b;
            // }
            // public int sub(int a, int b) {
            //     return a - b;
            // }
        // };
        A obj = (int a, int b) -> a + b; //lambda expression
        A obj1 = (int a, int b) -> a - b; //lambda expression

            int res = obj.add(10, 20); //calling the method
            System.out.println(res); //printing the result

            int res1 = obj1.add(20, 10);
            System.out.println(res1);
        
    }  
}

