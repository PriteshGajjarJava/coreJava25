class TeaCoffeePuzzle {
    public static void main(String[] args) {
        A obj = new B();
        obj.f2();
    }
}

class A {
    void f1() { System.out.println("A:f1"); }
    void f2() {
        System.out.println("A:f2");
        this.f1();
    }
}
class B extends A {
    void f1() { System.out.println("B:f1"); }
}
