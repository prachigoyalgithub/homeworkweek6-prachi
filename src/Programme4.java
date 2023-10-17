public class Programme4 {

     int InstA =50;//  an instance variable
    int InstB = 60;// an instance variable

    static int StaticA = 100;// a static variable
    static  int StaticB = 200;//a static variable

    // one instance  method
    public  void instMethod () {

        System.out.println(InstA);
        System.out.println(InstB);
        System.out.println(StaticA);
        System.out.println(StaticB);

    }
//one static  method
        public static void staticMethod () {
            //System.out.println(InstA);
            //System.out.println(InstB);
            System.out.println(StaticA);
            System.out.println(StaticB);

        }
        public static void main (String[] args){
            Programme4 obj1 = new Programme4();

            obj1.instMethod();
            Programme4.staticMethod();


        }

        }










