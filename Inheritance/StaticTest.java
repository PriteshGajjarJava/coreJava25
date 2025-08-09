class StaticTest{
    public static void main(String[] args) {
        A obj = new B();
        obj.f1();
        obj.f2();
        A.f1();
        B.f1();
    }
}
class A {
    public static void f1() { System.out.println("A:f1"); }
    public void f2()  { System.out.println("A:f2"); }
}
class B extends A {
    public static void f1() { System.out.println("B:f1"); }
    public void f2()  { System.out.println("B:f2"); }
}
