class A{
    int a; int b; int c;
}

enum students{
    Shrey, Pooja, Ankita, Smriti;


    public void show(){
       System.out.println("Students are studying");
    }

    public String Display(){
        return "Hello";
    }
}


public class patna {
    public static void main(String[] args) { 
        // students obj = students.Pooja;
        students obj[] = students.values();
        System.out.println(obj);
        // obj.show();   
        // System.out.println(obj.Display());   
        
        // for (int i = 0; i < obj.length; i++) {
        //     System.out.println(obj[i]);
        // }

        for(students s : students.values()){
            // System.out.println(s.ordinal()+1 + " " + s);
            // System.out.println(s.name());
            // System.out.println(s.toString());
            // System.out.println(s.valueOf("Shrey"));
            // System.out.println("student : " + s);            
            System.out.println(s);
        }
    }
}