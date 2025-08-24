import java.util.*;
class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(8);
        s.push(10);
        s.push(4);
        s.push(1);

        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s);
    }
}
