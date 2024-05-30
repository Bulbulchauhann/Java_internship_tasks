public class EHand {
    public static void main(String[] args) {
        int a = 76;
        int b = 0;
        int c1 =a/b;

        // int d = a + b;
        // System.out.println(d);

        int[] d ={3, 4, 5};
        String c = null;


        try{
            System.out.println(c.length());
            System.out.println(d[5]);
            System.out.println("try1");
            System.out.println("try2");
            System.out.println("finaltry block");
        }
        
        catch(ArithmeticException k){
            System.out.println("divided by 0 error");
        }
        catch(ArrayIndexOutOfBoundsException l){
            System.out.println("array error");
        }
        catch(Exception m){
            System.out.println("new error");
        }

        
        System.out.println(c1);


        // try{          //if block
        //     // System.out.println(c);
        // }
        // // catch(Exception e ) { //else block  //exception- argument of catch
        //     System.out.println("error");
        // }
        
        System.out.println("hello");
    }
}
