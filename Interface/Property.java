interface maternal{
    void car();
    void savings();
}

interface paternal{
    void house();
    void car();
}

class child implements paternal, maternal{
    public void house(){
        System.out.println("house is 3bhk");
    }
   
    public void car(){
        System.out.println("car is bmw");
    }

    public void savings(){
        System.out.println("savings are 56 crores");
    }
}


public class Property {
    public static void main(String[] args) {
        //maternal child;
        child c = new child();
        c.house();        
        c.car();    
        c.savings();        
    }
}
