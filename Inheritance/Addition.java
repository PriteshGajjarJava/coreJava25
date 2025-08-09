class Addition {
    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(add(5,6,7,8));
        System.out.println(add(1,2,3,4,5,6,7,8,9,10));
        System.out.println(add());//0
    }

    //... Var argument list
    static int add(int... arr) {
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
