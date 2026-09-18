
import java.util.Arrays;
import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
//        #Loops
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Random No.: ");
       int no = sc.nextInt();
       for(int i = 0; i <= no ; i=i+1) {
           System.out.println(i);
       }
       for(int i = 100; i>=1 ; i=i-1){
           System.out.println(i);
       }
//      #WhileLoop
        System.out.print("Enter the Starting and Ending Value: ");
       int a = sc.nextInt();
       int b = sc.nextInt();
       while(a >= b){
           System.out.println(a);
           a=a-1;
       }

//       #Do While Loop


        int k = 100;
       do{
           System.out.println(k);
           k=k-1;
       }while(k >=1 );
    }
}
