class blr{
    String name;
    int age;
    String city;

    public void setAge(int a) {
        age = 23;
    }

    public void setCity(String b){
        city = "Bengaluru";
    }

    public String getName() {
        // name = "Rahul";
        return name;
    }    
}

public class getset {
    public static void main(String[] args) {
        blr b1 = new blr();
        // b1.name = "Pooja";
        // b1.setAge(24);
        // b1.setCity("Karachi");
        System.out.println(b1.getName());
        System.out.println(b1.age);
        System.out.println(b1.city);
    }
}
