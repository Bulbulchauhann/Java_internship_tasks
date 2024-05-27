class math{
    public int add (int a, int b){
        // System.out.println(a + b);
        return a + b;
    }

    public int pro (int a, int b){
        return a * b;
    }
}

public class Classes2 {
    public static void main(String[] args) {
        math a1 = new math();  
        int x = 4;
        int y = 3;      
        int z= a1.add(x, y);
        System.out.println(z);

        int x1 = 14;
        int y1 = 13;      
        int z1= a1.pro(x1, y1);
        System.out.println(z1);
        
    }
}
