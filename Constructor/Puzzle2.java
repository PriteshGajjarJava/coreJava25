public class Puzzle2 {
    { System.out.println("1"); }
    public static void main(String[] args) {
        B obj1 = new B();
        A obj2 = new A();
    }
}
class A {
    { System.out.println("3"); }
    A() { System.out.println("7"); }
    static { System.out.println("2");}
}
class B extends A {
    static { System.out.println("4");}
    { System.out.println("5"); }
    B() { System.out.println("6"); }
}
