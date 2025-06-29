class A {
    public static void main(String[] args) {
        System.out.println("A:test");
        // Calling static method
        B.f1();
        // Calling non-static (instance) method
        C obj = new C();
        obj.f2();
    }
}
class B {
    static void f1() { System.out.println("B:f1"); }
}
class C {
    void f2() { System.out.println("C:f2"); }

}

// javac Demo1.java