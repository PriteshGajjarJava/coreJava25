public class InstanceBlockTest {
    public static void main(String[] arg) {
        A obj1 = new A();
        A obj2 = new A(4);
    }
}
class A {
    {
        System.out.println("instance-block-1");
    }
    static {
        System.out.println("static-block");
    }
    A() {
        System.out.println("A: Default constructor");
    }
    A(int x) {
        System.out.println("A: Parameterised constructor");
    }
    {
        System.out.println("instance-block-2");
    }
}
