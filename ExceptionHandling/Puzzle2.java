// java Puzzle2 12
// java Puzzle2 12 4
// java Puzzle2 10 two
// java Puzzle2 10 0

class Puzzle2 {
    public static void main(String[] args) {
        int n1=0,n2=0;
        try {
          n1 = Integer.parseInt(args[0]);
          n2 = Integer.parseInt(args[1]);
          System.out.println(n1/n2);
        } catch(ArithmeticException e1) {
          System.out.println("Invalid arithmetic operation..");
        } catch(NumberFormatException e2) {
          System.out.println("Invalid number format..");
        } catch(Exception e) {
          System.out.println("Exception handled..");
          System.exit(0);
        } finally {
          System.out.println("Finally");
        }
        System.out.println("End of program");
    }
}
