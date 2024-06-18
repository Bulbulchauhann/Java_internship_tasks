abstract class Car{
    abstract void start();
    
    public void ac(){
        System.out.println("ac is on");
    }
    abstract void stop();
}

class maruti extends Car{
    void start(){
        System.out.println("car is started");
    }

    void stop(){
        System.out.println("car is stopped");
    }

}

public class Abs {
    public static void main(String[] args) {
        Car c = new maruti();
        c.start();
        c.ac();
        c.stop();
    }
}