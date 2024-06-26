 interface A {
    void show();
}

// class B implements A {
//     public void show() {
//         System.out.println("interfaces");
//     }
// }

public class new2 {
    public static void main(String[] args) {
        // A a = new A() {
        //     public void a() {
        //         System.out.println("Hello");
        //     }
        // };

        // B obj = new B();
        // obj.show();

        A obj = new A(){
          public void show(){
              System.out.println("interfaces");
          }
        };
        obj.show();        
    }
}
