// class A extends Thread{
//     public void run(){
//         System.out.println(currentThread());
//         System.out.println(currentThread().getName());
//         System.out.println(currentThread().getPriority());
//         System.out.println(currentThread().getState());

//         for (int i = 0; i < 100; i++) {
//         System.out.println("AAAA - Class");
//         }
//         try {
//             Thread.sleep(1);
//         }  catch (InterruptedException e) {
//             e.printStackTrace();
//         }
//     }
// }



class A implements Runnable{
    public void run(){

        for (int i = 0; i < 100; i++) {
        System.out.println("AAAA - Class");
        }
        try {
            Thread.sleep(1);
        }  catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class B extends Thread{
    public void run(){
        // for (int i = 0; i < 100; i++) {
        // System.out.println("BBBB - Class");
        // }
    }
}

public class threadd {
    public static void main(String[] args) {
        // A obj =  new A();
        // B obj1  = new B();
        // // System.out.println(obj.getPriority() + " " + obj1.getPriority());
        // obj.setPriority(2);
        // obj1.setPriority(8);
        // obj.start();   
        // try {
        //     Thread.sleep(2);
        // }  catch (InterruptedException e) {
        //     e.printStackTrace();
        // }
        // obj1.start();
        // try {
        //     Thread.sleep(2);
        // }  catch (InterruptedException e) {
        //     e.printStackTrace();
        // }

        Runnable obj = new A();
        Runnable obj1 = new B();
        Thread t = new Thread(obj);
        Thread t1 = new Thread(obj1);
        t.start();
        t1.start();
    }
}
