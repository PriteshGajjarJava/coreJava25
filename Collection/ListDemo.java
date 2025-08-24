import java.util.*;

class ListDemo {
  public static void main(String[] args) {
    List<Integer> list1 = new ArrayList<Integer>();

    // add
    list1.add(5); list1.add(15); list1.add(42); list1.add(31);

    System.out.println(list1);
    
    // Get by index
    System.out.println(list1.get(1));

    // update
    list1.set(1, 77);
    System.out.println("Updated list:" + list1);

    // remove
    list1.remove(1);
    System.out.println("After removing:" + list1);

    // insert
    list1.add(1, 55);
     System.out.println("After inserting:" + list1);
    
    // search
    System.out.println(list1.contains(42));

    // traverse/iteration - for each
    for(Integer i: list1) { System.out.println(i); }

    Iterator<Integer> it = list1.iterator();
    while(it.hasNext()) {
        System.out.println(it.next());
    }

    Collections.sort(list1);
    System.out.println("Sorted list is: " + list1);
  }
}























