class Student{
    static int age = 21; //local variable - only callable in a class
    static String name = "Pooja";
    
    public void show(){ //method
        System.out.println(name + " : " + age);
    }
}

// class Blr{
//     int age = 21;
//     String name = "Pooja";

//     public void show(){
//         System.out.println(name + " : " + age);
//     }
// }

public class dirH {
    public static void main(String[] args) {
        // int age = 23;
        // String name = "Bulbul";

        // System.out.println(age);
        // System.err.println(name);

        Student s1 = new Student();
        s1.name = "Bulbul"; //instance
        // s1.name = "Rakesh"; //can overwrite data in heap
        // s1.name = "Madan";
        Student s2 = new Student();
        s2.name = "Pooja";
        Student s3 = new Student();
        s3.name = "Rahul";
        Student s4 = new Student();
        s4.name = "nikhil";
        s1.show();
    }    
}
