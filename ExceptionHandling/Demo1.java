import java.util.Scanner;

// n=3 
// n=10

class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 4, 0, 1, 6};

        System.out.println("Enter n:");
        int n = sc.nextInt();

        System.out.println("Start of program");
        System.out.println(arr[1]);
        


        try {
            System.out.println("try-start");
            System.out.println(arr[n]);
            System.out.println("try-end");
        }catch(ArrayIndexOutOfBoundsException e1) {
            System.out.println("You are accessing invalid array element...");
        }finally {
            System.out.println("Finally block");
        }

        System.out.println(arr[0]);
        System.out.println("End of program");
    }
}
