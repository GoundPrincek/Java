//```java
class Students {
    String name;
    int age;

    // Method to print student information
    public void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    // 1. Non-Parameterized Constructor
    Students() {
        System.out.println("Non-Parameterized Constructor Called");
        this.name = "Unknown";
        this.age = 0;
    }

    // 2. Parameterized Constructor
    Students(String name, int age) {
        System.out.println("Parameterized Constructor Called");
        this.name = name;
        this.age = age;
    }

    // 3. Copy Constructor
    Students(Students s2) {
        System.out.println("Copy Constructor Called");
        this.name = s2.name;
        this.age = s2.age;
    }
}

class Constructors {
    public static void main(String[] args) {

        // Using Non-Parameterized Constructor
        Students s1 = new Students();
        s1.printInfo();

        System.out.println();

        // Using Parameterized Constructor
        Students s2 = new Students("Prince", 21);
        s2.printInfo();

        System.out.println();

        // Using Copy Constructor
        Students s3 = new Students(s2);
        s3.printInfo();
    }
}
//```
