import java.util.Scanner;
public class PrimeFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        boolean res = PrimeFinder.isPrime(n);
        if (res == true) {
            System.out.println("Number " + n + " is prime");
        } else {
            System.out.println("Number " + n + " is NOT prime");
        }
        // Test code
        // for (int i=1; i<=100;i++) {
        //     if (isPrime(i)) { System.out.println(i + "is prime number");}
        // }
    }
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i=2; i <= n/2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}