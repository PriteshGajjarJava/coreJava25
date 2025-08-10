import java.util.Scanner;
class AgeInvalidException extends Exception {}

class UserDefinedExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        try {
           boolean b = isAgeValid(age);
        }catch(AgeInvalidException e) {
          System.out.println("Age is INVALID");
          System.exit(0);
        }
        System.out.println("Age is valid");
    }

    static boolean isAgeValid(int age) throws AgeInvalidException {
        if (age < 0 || age > 100) {
            throw new AgeInvalidException();
        }
        return true;
    }
}
