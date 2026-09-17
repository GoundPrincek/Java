import java.util.Arrays;
import java.util.StringTokenizer;

public class Array {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1]  =98;
        marks[2]  =95;
        System.out.println(marks[2]);
        String[] name = {"Batman" , "Shaktiman" , "Spiderman" , "Superman" };

//       # Length
        System.out.println(marks.length);

//       # Sorting
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);

//      ##2D Arrays
        int[][] finalMarks = {{91,98,96} , {92,94,93}};
        System.out.println(finalMarks[0][0]);

//

    }
}
