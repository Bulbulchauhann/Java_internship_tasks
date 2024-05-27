class Students{
    // static String name;
    String name;
    int id;
    String email;
    // static String email;
    // static String email =  "str@hg.com";

    // System.out.println(Students.name);

    public void display(){
        System.out.println(name + " " + id + " " + email);
        // return (id);
    }

    // public void display_name(){
    //     System.out.println("The student is called " + name);
    // }
    
}

public class Classes1 {
    public static void main(String[] args) {
        Students a1 = new Students();
        Students a2 = new Students();
        Students a3 = new Students();
        Students a4 = new Students();
        Students a5 = new Students();

        a1.name = "nashit";
        a1.id = 1;
        a1.email ="sbcsvh@nashit.com";

        a2.name = "shrey";
        a2.id = 2;
        a2.email ="shrey@nashit.com";
        
        a3.name = "mukesh";
        a3.id = 3;
        a3.email ="vdygh@nashit.com";

        a4.name = "rakesh";
        a4.id = 4;
        a4.email ="s1@gmail.com";

        a5.name = "pooja";
        a5.id = 5;
        a5.email ="1@pooja.com";   
        
        a1.name = "Peter";

        a1.display();
        a2.display();
        a3.display();
        a4.display();
        a5.display();        
    }
}
