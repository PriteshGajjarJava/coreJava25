
public class InheritanceTest {
    public static void main(String[] args) {
        B obj = new B();
    }
}
class A {
    A() { System.out.println("A:constructor");}
}

// B is a child class, whose parent is A
class B extends A {
    B() { System.out.println("B:constructor");}
}