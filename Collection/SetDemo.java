import java.util.*;

class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set1 = new TreeSet<Integer>();

        set1.add(5); set1.add(91); set1.add(15); set1.add(10); set1.add(2);

        System.out.println("Number of elements:" + set1.size());
        System.out.println("Set :" + set1);

        set1.remove(91);
        System.out.println("AFter removing: " + set1);
        System.out.println(set1.contains(91));

        Iterator<Integer> it = set1.iterator();
        while(it.hasNext()) {
         System.out.println(it.next());
        }
    
    }
}
