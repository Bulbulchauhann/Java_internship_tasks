import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;



public class Al{
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {

        //arraylist-----------------------------------------------------

        ArrayList a1 = new ArrayList();

        System.out.println("Empty Array List " + a1);

        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(40);
        a1.add(50);

        System.out.println("Abhi a1 ka traverse : " + a1);

        for (int i = 0; i < a1.size(); i++) {
            System.out.println("Index : " + i + " Value : " + a1.get(i));
        }

        //iterator------------------------------------------------------------------------

        System.out.println("Using Iterator :");
        Iterator i1 = a1.iterator();
        while(i1.hasNext()){
            System.out.println(i1.next() + " ");
        }

        //listIterator------------------------------------------------------------------------

        System.out.println("Using ListIterator :");
        ListIterator l1 = a1.listIterator();
        while(l1.hasNext()){
            System.out.println(l1.next() + " ");
        }

        //in reverse order------------------------------------------------------------------------\

        System.out.println("In reverse order :");
        while (l1.hasPrevious()) {
            System.out.println(l1.previous() + " ");
        }        

        ArrayList a2 = (ArrayList) a1.clone();
        System.out.println("Original ArrayList : " + a1);
        System.out.println("Cloned ArrayList : " + a2);
    }
}