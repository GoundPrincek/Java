//Compile time polymorphisom
class data{
    String name;
    int age;
    public void printinfo(String name){
        System.out.println(this.name);
    }
}





public class polymorphisom {
    public static void main(String[] args) {
     data s1 = new data();
     s1.name="Prince";
     s1.age=21;

     s1.printinfo(s1.name,s1.age);
    }
}
