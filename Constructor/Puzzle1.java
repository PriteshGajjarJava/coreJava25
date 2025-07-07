public class Puzzle1 {
    { System.out.println("ONE");}
    static { System.out.println("TWO");}
    public static void main(String[] args) {
        System.out.println("THREE");
        Puzzle1 p2 = new Puzzle1();
    }
    Puzzle1() { System.out.println("SIX");}
    static { fun(); System.out.println("FOUR"); }
    static void fun() {
        System.out.println("FIVE");
        Puzzle1 p1 = new Puzzle1();
    }
}
