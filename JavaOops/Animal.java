public class Animal {
    public static void main(String[] args) {

        Animal shonali = new Animal(); //object of animal class
        shonali.eat();
        shonali.run();

        Birds cutu = new Birds(); //object of bird class
        cutu.fly();
        
    }

    public void eat(){
        System.out.println("I am eating");
    }

    public void run(){
        System.out.println("i am running");
    }
}

class Birds{

    public void fly(){
        System.out.println("I am flying");
    }

}