import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        printFiboSeries(n);
    }
    // n = 8 => 0 1 1 2 3 5 8 13
    static void printFiboSeries(int n) {
       int n1 = 0;
       int n2 = 1;

       System.out.print(n1 + ", " + n2 + ",");
       for(int i=2; i < n; i++) {
        int n3 = n1+n2;
        System.out.print(n3 +",");
        n1 = n2;
        n2 = n3;
       }
       System.out.println();
    }
}
