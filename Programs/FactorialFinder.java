import java.util.Scanner;

public class FactorialFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt(); // scanf()
        int res = Facto.factorial(n);
        System.out.println(n + "! = " + res);// 5! = 120
    }
}

class Facto {
    static int factorial(int n) {
        //0! =1 , 1!=1
        // 5*4*3*2*1 = 5*4*3*2
        int res = 1;
        for (int i=n; i > 1; i--) {
            res = res * i;   // 120
        }
        return res;
    }
}
