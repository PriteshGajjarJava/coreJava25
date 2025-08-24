import java.util.*;
class EmployeeSetDemo {
    public static void main(String[] args) {
        Set<Emp> set = new HashSet<Emp>();
        Emp e1 = new Emp(114, "John", 10000);//114+4+10000 = 10118
        Emp e2 = new Emp(67, "Fred", 20000);
        Emp e3 = new Emp(51, "Abe", 19000);
        Emp e4 = new Emp(67, "Fred", 20000);
        Emp e5 = new Emp(113, "Raja", 10001);//113+4+10001 = 10118

        set.add(e1); set.add(e2); set.add(e3); set.add(e4); set.add(e5);
        System.out.println(set);
    }
}
class Emp {
    int id;
    String name;
    float salary;

    Emp(int id, String name, float sal) { this.id = id; this.name = name; this.salary = sal; }

    public String toString() {
        return this.id +","+this.name+","+this.salary;
    }

    public int hashCode() {
        return this.id + this.name.length() + (int)this.salary;
    }

    public boolean equals(Object obj) {
    System.out.println("In equals");
        Emp e1 = this; Emp e2 = (Emp)obj;
        return e1.id == e2.id && e1.name.equals(e2.name) && e1.salary == e2.salary;
    }
}
