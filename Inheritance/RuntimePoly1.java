class RuntimePoly1 {
    public static void main(String[] args) {
        A obj = new B(); 
        obj.f1();
        ((B)obj).f2();//Explicit type-cast 
    }
}
class A {
    void f1() { System.out.println("A:f1");} 
}
class B extends A {
    void f1() { System.out.println("B:f1"); }
    void f2() { System.out.println("B:f2"); }
}
