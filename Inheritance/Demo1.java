class Demo1 {
    public static void main(String[] args) {
        Student s1 = new Student("Raj", "Pune", 110, 70);
        s1.printDetails();
        s1.run();
        s1.walk();
        Student s2 = new Student();
        s2.printDetails();
    }
}
class Person {
    String name;  String address;
    Person() { System.out.println("Person constructor"); }
    Person(String name, String add) {
        System.out.println("Parent parameterised constructor");
        this.name = name; this.address = add;
    }
    void walk() { System.out.println("walking"); }
    void run() { System.out.println("running"); }
}
class Student extends Person {
    int rollNo;
    float marks;

    Student() { System.out.println("Student constructor"); }
    Student(String name, String address, int rollNo, float marks) {
        super(name,address); // parent class constructor
        this.rollNo = rollNo;
        this.marks = marks;
    }
    void printDetails() {
        System.out.println(super.name + "," + super.address + "," + this.rollNo +"," + this.marks);
    }
    void run() {
        super.walk();
        System.out.println(".... RUnninng >>>...");
    }
}



