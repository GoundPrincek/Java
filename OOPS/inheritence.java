
class shape {
    String color;
    public void area(){
        System.out.println("Display area");
    }
}
class Triangle extends shape{
    public void area(int l , int h) {
        System.out.println(1/2*l*h);
}

public class inheritence {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "Orange";

//        4 Types :
//        single level inheritence




    }
}
