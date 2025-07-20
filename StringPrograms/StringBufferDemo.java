
class StringBufferDemo {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Hello");
        s1.reverse();
        System.out.println(s1);

        String s = "Today is Sunday";
        System.out.println("Reverse is: " + reverse(s));

        StringBuffer b1 = new StringBuffer("We are Engineer");
        b1.insert(7, "GOOD ");
        b1.append("s.");
        System.out.println(b1);
    }

    static String reverse(String s) {
        StringBuffer buf = new StringBuffer(s);
        buf.reverse();
        return new String(buf);
    }
}
