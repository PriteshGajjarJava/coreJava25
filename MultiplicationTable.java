public class MultiplicationTable {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        Maths.printTable(n);
    }
}

class Maths {
    static void printTable(int n) {
        for (int i=1; i <=10; i++) {
            int res = n * i;
            System.out.printf("%d*%d=%d\n", n, i, res);
        }
    }
}