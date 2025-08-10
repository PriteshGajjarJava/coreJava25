// java Puzzle1
// java Puzzle1 12
// java Puzzle1 12 4
// java Puzzle1 10 two
// java Puzzle1 10 0
class Puzzle1 {
    public static void main(String[] args) {

        int n1 = 0;
        int n2 = 0;
        
        try {
          n1 = Integer.parseInt(args[0]);
          n2 = Integer.parseInt(args[1]);
          System.out.println(n1/n2);
        } catch(ArrayIndexOutOfBoundsException e1) {
          System.out.println("Invalid array index..");
        } catch(NumberFormatException e2) {
          System.out.println("Invalid number format..");
        } finally {
          System.out.println("Finally");
        }
        System.out.println("End of program");
    }
}
