class MainOverloading {
    public static void main(String[] args) {
        main(2, "overloading", "is","comipile-time", "polymorphism");
    }
    static void main(int x, String ...args) {
        main(args.length);
        main(args[3]);
        main(args[2].charAt(8));
        System.out.println(x + args.length + args[x].length());
    }
    static void main(int x) {
        System.out.println(x);
    }
    static void main(String y) {
        System.out.println(y);
    }
    static void main(char ch) {
        System.out.println(ch);
    }
}
