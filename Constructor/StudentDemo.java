
public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 7;
        s1.name = "Pga";
        Student s2 = new Student(5, "John");

        System.out.println(s1); // To convert object into string representation
        System.out.println(s2);
    }
}
class Student {
    int id;
    String name;
    Student() {
        System.out.println("Default cosntructor");
    }
    Student(int id, String name) {
        this(); // Calling self constructor
        System.out.println("Parameterised constructor");
        this.id = id;
        this.name = name;
    }
    public String toString() {
        return this.id + ", " + this.name;
    }
}