class Students{
    static String name;
    String a;

    //constructor
    // public Students(String a) {
    //     this.a = a;
    // }   

    // public static void show(Students Students){
    //     System.out.println(Students.name);
    // }
}

public class methH {
    public static void main(String[] args) {

        // Students a = new Students();

        Students adit = new Students();
        adit.name = "Bulbul";

        Students csa = new Students();
        csa.name = "Pooja";

        adit.show(adit); 
        csa.show(adit);  //will overwrite bec static method
    }    
}
