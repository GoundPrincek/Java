import java.util.Scanner;

class MiniProject {
public static void main(String[] args) {
    //Mini Project
    Scanner sc = new Scanner(System.in);
    int myNumber = (int)(Math.random()*100);
    int userNumber = 0;
    do{
        System.out.println("Gues my Number: ");
        userNumber = sc.nextInt();
        if(userNumber == myNumber){
            System.out.println("Congrates...! you guesd the Right Number ");
            break;
        }else if(userNumber > myNumber){
            System.out.println("Your number is too Large ");
        }else{
            System.out.println("Your number is too Small");
        }
    }while(userNumber >= 0);

    }
}