//In Java, a constructor is a special method used to initialize objects. It is called automatically when an object of a class is created using the new keyword (12:30).
//
//Key Characteristics of Constructors:
//Naming: The constructor must have the exact same name as the class (13:45).
//Return Type: Constructors do not have a return type—not even void (13:56).
//Invocation: It is called only once per object creation (14:14).
//Types of Constructors:
//Non-Parameterized Constructor: A constructor with no arguments. If you do not define any constructor, Java provides a default one automatically (13:31, 15:43).
//Parameterized Constructor: A constructor that accepts arguments, allowing you to pass values to initialize an object's properties during creation (15:57). Inside these, the this keyword is often used to refer to the current object's attributes (16:15).
//Copy Constructor: A constructor that accepts an object of the same class as a parameter to copy its values into a new object (17:20).
//Constructor Chaining
//When using inheritance, the constructor of the base class is called before the constructor of the derived (child) class. This process ensures that the parent object is properly initialized before the child object's specific logic is executed (56:22).


class Students {
    String name;
    int age;


    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

//    //non parpmeter
//    Students(){
//        System.out.println("Contructor called");


    //parameter

    Students(String name, int age){
        this.name = name ;
        this.age = age;
        }
    }
}



public class Constructors {
    public static void main(String[] args) {
        Students s1 =new Students();
        s1.name ="Prince";
        s1.age = 21;


        s1.printinfo();
    }
}
