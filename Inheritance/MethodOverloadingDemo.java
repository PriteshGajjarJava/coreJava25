class MethodOverloadingDemo {
    public static void main(String[] args) {
        System.out.println(add("PGA","#","Java"));
        System.out.println(add(4,5));
        System.out.println(add("Java", 21));
    }

    static String add(String s1, String s2, String s3) {
        return add(s1,s2) + s3;
    }
    
    static String add(String p1, String p2) { return p1 + p2; }
    
    static int add (int n1, int n2) { return n1 + n2; }
    
    static String add(String s1, int n1) { return s1 + n1; }
}
