
// javac AdditionDemo.java
// java AdditionDemo 11 22
public class AdditionDemo {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please run program with 2 argumenet like #java AdditionDemo 10 20");
            System.exit(0);
        }
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int result = Addition.add(num1, num2);

        System.out.println(num1 + " + " + num2 + " = " + result);
        System.out.printf("%d + %d = %d\n", num1, num2, result);
    }
}

class Addition {
    static int add(int n1, int n2) {
        return n1 + n2;
    }
}