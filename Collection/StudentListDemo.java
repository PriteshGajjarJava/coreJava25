import java.util.*;
class StudentListDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        Student s1 = new Student(11, "John");
        list.add(s1);
        Student s2 = new Student(5, "Fred");
        list.add(s2);
        list.add(new Student(9, "Abe"));

        Student s = new Student(5, "Fred");
        System.out.println(list.contains(s));
        System.out.println(list);

    }
}

class Student {
    int id;
    String name;
    Student(int id, String name) {
        this.id = id; this.name = name;
    }
    // overriding equals method
    public boolean equals(Object obj) {
        Student s1 = this;
        Student s2 = (Student)obj;

        return s1.id == s2.id && s1.name.equals(s2.name);
    }

    public String toString() {
        return "id=" + this.id +",name="+this.name;
    }
}
