class blr{
    // int a;
    // int b; 

    static int a;
    static int b; 

    //constructor
    // public blr(int a, int b) {
    //     this.a = a;
    //     this.b = b;
    // }

    // // method
    // public void add(){
    //     int c = a+b;
    //     System.out.println(c);
    // }

     //static method
     public static void add(){
        int c = a+b;
        System.out.println(c);
    }
}

public class Meth {
        public static void main(String[] args) throws ClassNotFoundException {
            // Class b1 = Class.forName("blr");
            // System.out.println(b1);

            blr b1 = new blr();
            b1.a = 10;
            b1.b = 20;
            b1.add();
            blr b2 = new blr();
            b1.a = 109;
            b1.b = 175;
            b2.add();
        
    }
}
