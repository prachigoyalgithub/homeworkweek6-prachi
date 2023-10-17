/**
 * static variable - class
 * scope - within the class
 * Memory allocation- when class is loaded
 * store - non heap memory
 */


public class Programme2 {

     static int a =50;// a is a static variable
    static int b =100;//b is a static variable
    static String name="Tina";//name is a static variable


    public static void main(String[] args) {
        System.out.println(a);
        System.out.println( Programme2.a);
        System.out.println(b);
        System.out.println(Programme2.b);

    }
    public void p1(){
        System.out.println(a);
        System.out.println(Programme2 .a);
        System.out.println(b);
        System.out.println(Programme2.b);
    }




}
