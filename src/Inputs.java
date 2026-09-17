import java.util.Scanner;
public class Inputs {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
        System.out.print("Enter your Age: ");
        int age = sc.nextInt();
       if(age==18){
           System.out.println("You are eligible for voting");
       }else{
           System.out.println("You are not eligible");
       }

//       comparison operators
//        a == b
//        a !=b
//        a >=b
//        a <=b


    }
}
