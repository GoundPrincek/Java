import java.util.Arrays;
import java.util.Scanner;
public class ExceptionHandling {
    public static void main(String[] args) {
//        ##Catch in Exception Handling
        int[] marks = {97, 95, 86};
        try{
            System.out.println(marks[5]);
        }catch(Exception exception){
            //Do something after catching

        }
        System.out.println("The name is Prince");
    }
}
