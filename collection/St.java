import java.util.Iterator;
import java.util.Stack;

public class St {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {

        //stack-------------------------------------------------------

        Stack s1 = new Stack();

        System.out.println("Before adding elements: " + s1);

        s1.push(101);
        s1.push("Ajay");
        System.out.println("Stack after adding two elements : " + s1);
        s1.push(123);
        s1.push(33.23);
        s1.push("Shiv");
        System.out.println("Stack after adding multiple elements : " + s1);

        //iterator-------------------------------------------------------
        Iterator i1 = s1.iterator();
        while (i1.hasNext()) {
            System.out.println(i1.next());            
        }

        s1.pop(); //last one out (will remove shiv) (lifo)
        System.out.println("After popping elements : " + s1);
        
    }
}
