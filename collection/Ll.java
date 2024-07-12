import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;


public class Ll {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {

        // LinkedList-------------------------------------------------
        LinkedList ll1 = new LinkedList();

        System.out.println("Before adding elements : " + ll1);

        ll1.add("Rahul");
        ll1.add("Abhi");
        ll1.add("Shivam");
        ll1.add("Abhinav");
        ll1.add("Abhishek");

        System.out.println("After adding elements : " + ll1);

        // Iterator-----------------------------------------------------

        System.out.println("Using Iterator : ");

        Iterator<String> i1 = (Iterator<String>) ll1.iterator();

        // Iterator i1 = ll1.iterator();
        while (i1.hasNext()) {
            System.out.println(i1.next() + "");
        }

        // Adding first element-----------------------------------------
        ll1.addFirst("Vivek"); 
        System.out.println("After adding first : " + ll1);

        // Adding last element-----------------------------------------
        ll1.addLast("Pooja");
        System.out.println("After adding last : " + ll1);

        // Sorting-----------------------------------------------------
        Collections.sort(ll1); //alphabetically
        System.out.println("After sorting : " + ll1);

        // Sorting Customizes----------------------------------
        Collections.sort(ll1, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // return o1.compareTo(o2);
                return o2.compareTo(o1);
            }            
        });

        System.out.println("After sorting : " + ll1);

        // Adding multiple elements----------------------------
        ll1.add("Pooja"); //allow duplicate
        ll1.add("Madan");
        System.out.println("After adding multiple elements : " + ll1);

        // Remove element--------------------------------
        ll1.removeAll(Collections.singleton("Pooja"));
        // ll1.removeLast(Collections.singleton("Pooja"));
        // ll1.removeFirstOccurrence(Collections.singleton("Pooja"));
        System.out.println("After removing : " + ll1);

        //clear-------------------------------------------
        ll1.clear();
        System.out.println("After clearing : " + ll1);

    }
}
