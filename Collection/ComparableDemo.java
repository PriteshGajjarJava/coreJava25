import java.util.*;
class ComparableDemo {
    public static void main(String[] args) {
        List<Emp> list = new ArrayList<Emp>();
        list.add(new Emp(15, "Fred", 19000));
        list.add(new Emp(5, "John", 9000));
        list.add(new Emp(7, "Kevin", 29000));
        list.add(new Emp(2, "Abe", 10000));
        list.add(new Emp(8, "Raj", 20000));

        Collections.sort(list);
        System.out.println(list);
    }
}
class Emp implements Comparable {
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
        Emp e1 = this; Emp e2 = (Emp)obj;
        return e1.id == e2.id && e1.name.equals(e2.name) && e1.salary == e2.salary;
    }

    public int compareTo(Object e) {
       Emp e1 = this;
       Emp e2 = (Emp)e;
       return e1.salary== e2.salary ? 0 : e1.salary > e2.salary ? -1 : 1;
    }
}

