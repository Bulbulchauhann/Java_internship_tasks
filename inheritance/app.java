// import javax.management.ObjectName;
import calc.Addition;

public class app {
    public static void main(String[] args) {
        Addition obj = new Addition();
        int res = obj.add(2, 4);
        int res1 = obj.sub(13,5);
        int res2 = obj.div(14, 7);
        int res3 = obj.multi(2, 5);
        System.out.println(res);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        // System.out.println("helloo");        
    }
}
