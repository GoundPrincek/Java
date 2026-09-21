
import org.w3c.dom.ls.LSOutput;

class pen {
    String color;
    String type;

    public void write() {
        System.out.println("Write Something");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

class Student {
        String name;
        int age;
        int id;
        String address;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.id);
        System.out.println(this.address);
    }
    }



public class oops {
    public static void main(String[] args) {
        pen pen1 =new pen();
        pen1.color ="Blue";
        pen1.type ="gel";

        pen pen2 = new pen();
        pen2.color ="Black";
        pen2.type ="Ball pen";

        pen1.write();
        pen1.printColor();
        pen2.printColor();

        Student s1 = new Student();  //
        s1.name="prince";
        s1.age=21;
        s1.id=423154;
        s1.address="Ashirwadnagar kamtghar bhiwandi";

        s1.printinfo();
    }
}
