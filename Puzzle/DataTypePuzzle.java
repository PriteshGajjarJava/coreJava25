public class DataTypePuzzle {
    public static void main(String[] args) {
        byte b = (byte)130; //byte -128 to 127
        System.out.println(b);// -126

        char ch = 'A';
        int d = ch; // ASCII
        System.out.println(d);

        final int i = 10;
        i++;
    }
}