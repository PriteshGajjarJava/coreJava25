import java.util.*;

class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(5, "Five");
        map.put(11, "Eleven");
        map.put(19, "Nineten");
        map.put(89, "Eighty Nine");
        map.put(30, "Three");

        System.out.println(map);

        System.out.println("value of 89 is: " + map.get(89));

        Set<Integer> keys = map.keySet();
        
        Iterator<Integer> it = keys.iterator();
        while(it.hasNext()) {
            int key = it.next();
            System.out.println(key + "=>" + map.get(key));
        }

        System.out.println("is 5 present:" + map.containsKey(5));
        map.remove(11);
        System.out.println(map);
    }
}
