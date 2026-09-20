import java.util.Arrays;
import java.util.Scanner;
public class MethodsandFunctions {
    //This is for Reapted name
    public static void printJava(){
        System.out.println("Hello java");
    }

    //This is for name
    public static void printName(String name){
        System.out.println(name);
    }

    //this is for sum
    public static void printSum(int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }


    public static void main(String[] args) {
//        #Methods
        printJava();
        printJava();
        printJava();
        printName("Prince");
        printSum(5 , 6);
    }
}
