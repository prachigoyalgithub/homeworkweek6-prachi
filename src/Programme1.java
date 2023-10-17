/**
 * Scope - within the class
 * Memory allocation - when object is created
 * memory - heap
 */

public class Programme1 {
    int p= 40;//p is an instance variable
    int r =50;//r is an instance variable

    String name="Prachi";// name is an instance variable

    public static void main(String[] args) {
        Programme1 a1 = new Programme1();
        System.out.println(a1.p);
        System.out.println(a1.r);
        System.out.println(a1.name);

    }

    public void myMethod(){
        Programme1 a2 =new Programme1();
        System.out.println(a2.p);
        System.out.println(a2.r);
        System.out.println(a2.name);

    }
}
