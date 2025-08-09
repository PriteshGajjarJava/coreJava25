// An interface with ONLY SINGLE method

@FunctionalInterface
interface Maths {
    int add (int x,int y);
}

class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        Maths m = (x,y) -> x+y;
        int res = m.add(10,20);
        System.out.println("Result:" + res);
        
        Maths m2 = (x,y) -> ++x + ++y;
        System.out.println(m2.add(10,20));
    }
}
