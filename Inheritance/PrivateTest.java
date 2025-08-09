import java.util.Scanner;

class PrivateTest {
    private void f1() {
      System.out.println("private method");
    }
    void f2() {
      this.f1();
      System.out.println("f2");
    }
    
    void getInfo(boolean isHR, int empId) {
        if (isHR) {
            int sal = this.getSalary(empId);
            System.out.println("Salary is: " + sal);
            return;
        }
        System.err.println("You DO NOT have permission");
    }

    private int getSalary(int empId) {
        return 50000;
    }
}

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrivateTest t = new PrivateTest();
        String userName, pwd;
        System.out.println("Enter username");
        userName = sc.nextLine();
        System.out.println("Enter password");
        pwd = sc.nextLine();
        boolean isHR = userName.equals("HR") && pwd.equals("HR@123");
        t.getInfo(isHR, 101);
    }
}
