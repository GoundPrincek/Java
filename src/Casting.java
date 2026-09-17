public class Casting {
    public static void main(String[] args) {
//        Casting
        double price = 100.00;
        double finalprice = price + 18; // => Implicit Casting (Allow)

        System.out.println(finalprice);

        int p = 100;
        int fp= p+(int)18.0; // => Ex[plicit Casting (Not Allow)
        System.out.println(fp);

//        Constants
        int age = 21 ;

        final float PI = 3.14f ;
//       pi = 30.45; =>This is Showing error


    }
}
