public class StaticBlock {
    public static void main(String[] args) {
        A obj1 = new A();
        A obj2 = new A();
    }
}

class A {
    static {
        System.out.println("static-block-1");
    }
    A() {
        System.out.println("A: constructor");
    }
    static {
        System.out.println("static-block-2");
    }
}
