
interface X {
    void f1(); // abstract method
    static void f2() {
        System.out.println("static method");
    }
    default void f3() {
        System.out.println("default method");
        f4();
    }
    private void f4() {
        System.out.println("private method");
    }
}

class Test implements X {
    public void f1() {
        System.out.println("Test:f1");
    }
}

class Java8InterfaceDemo {
    public static void main(String[] args) {
        // Annonymous inner class
        X x = new X() {
            public void f1() {
              System.out.println("X:f1");
            }
        };
        x.f1();
        X.f2();
        x.f3();
        // x.f4();// ERROR

        X t = new Test();
        t.f1();
    }
}
