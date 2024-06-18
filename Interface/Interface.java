abstract class adit{

    // String name = "bulbul"; //default- private protected
    // private int age = 23;
    // public int salary = 10000;

    public abstract void blr();
    

    public void ddn(){
        System.out.println("DDN");
    }

    public void patna(){
        System.out.println("blr");
    }

    public void ald(){
        System.out.println("ald");
    }
}

class nsti extends adit{
    public void blr(){}
    
}
//concrete class 
class nsti1 extends adit{

}

public class Interface{
    public static void main(String[] args){
        adit a = new adit();
        // System.out.println(a.name);
        // System.out.println(a.age);
        // a.blr();
        // a.ddn();        
    }
}