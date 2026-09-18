import java.util.Scanner;
public class Inputs {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
        System.out.print("Enter your Age: ");
        int age = sc.nextInt();
       if(age>=18){
           System.out.println("You are eligible for voting");
       }else{
           System.out.println("You are not eligible");
       }

//       #comparison operators
//        a == b
//        a !=b
//        a >=b
//        a <=b


//      #Logical Operators (AND)  (&&)
        System.out.println("Enter the Value of the A and B");
        int a = sc.nextInt() ;
        int b = sc.nextInt();

        if(a <= 50 && b <= 50){
            System.out.println("Both less than 50");
        }else{
            System.out.println("The values are random");
        }

//      #Logical (OR)  ( || )
        if (a < 50 || b < 50 ){
            System.out.println("the Vlaue is true");
        }

    }
}
