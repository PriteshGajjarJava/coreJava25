import java.util.*;
class ComparatorDemo {
    public static void main(String[] args) {
        List<Emp> list = new ArrayList<Emp>();
        list.add(new Emp(15, "Fred", 19000));
        list.add(new Emp(5, "John", 9000));
        list.add(new Emp(7, "Kevin", 29000));
        list.add(new Emp(2, "Abe", 10000));
        list.add(new Emp(8, "Raj", 20000));

        Collections.sort(list, new EmpIdComparator());
        System.out.println(list);
        Collections.sort(list, new EmpSalaryComparator());
        System.out.println(list);
    }
}
class EmpIdComparator implements Comparator<Emp> {
    public int compare(Emp e1, Emp e2) {
        return e1.id == e2.id ? 0 : e1.id > e2.id ? 1 : -1;
    }
}
class EmpSalaryComparator implements Comparator<Emp> {
    public int compare(Emp e1, Emp e2) {
        return e1.salary == e2.salary ? 0 : e1.salary > e2.salary ? -1 : 1;
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

