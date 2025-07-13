public class BasicDemo {
    public static void main(String[] args) {
        int[] rollNos = {4, 19, 10, 14, 90};
        String[] days = {"Monday", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        System.out.println("3rd day of the week: " + days[2]);

        // print all days using "For-each" loop
        for(String d: days) {
            System.out.println(d);
        }

        // Normal for-loop
        for (int i=0; i < rollNos.length; i++) {
            System.out.println(rollNos[i]);
        }
    }
}
