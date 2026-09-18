import java.util.Arrays;
import java.util.Scanner;
public class BreakandContinue {
    public static void main(String[] args) {
//       #BreakandContinue
        int i=0;
        while(true){
            if( i==3){
                i=i+1;
                continue; // rukna nahi hai aage badna hai
            }
            System.out.println(i);
            i=i+1;
            if(i > 5){
                break;
            }
        }
    }
}
