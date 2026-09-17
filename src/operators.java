import java.sql.SQLOutput;

public class operators {
    public static void main(String[] args) {
//       ##Operators
//       # 1.Arthematic Operators => + , - , * , / , %
//       # 2.Assignment Operators
//       # 3.Logical Operators
//       #4.Comparison Operators

//       # Arthematic Operators
        System.out.println("Arthematic Operators");
        int a = 1 ;
        int b = 2 ;
        int add = a + b;
        int sub = a-b ;
        int multi = a*b;
        double div = a/b;
        double modulo = a%b;

        System.out.println(add);
        System.out.println(sub);
        System.out.println(multi);
        System.out.println(div);
        System.out.println(modulo);

//       # Assignment Operator
        System.out.println("Assignment Operators");
        int c =1;
        System.out.println(c++);// O/P =>1 ++ badme matlab change badme hoga
        System.out.println(++c);// O/P =>3 ++ pehle matlab changes pehle hi hojayenge
        System.out.println(c);// O/P =>3


//     ## Maths
//     # min and max
        System.out.println("This is for min and max");
        System.out.println(Math.min(5,6));
        System.out.println(Math.max(10,9));

//      #Random
        System.out.println("These are the rnadom variables");
        System.out.println(Math.random());
        System.out.println((int)(Math.random()*100));




    }
}
