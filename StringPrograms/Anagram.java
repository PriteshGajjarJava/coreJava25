
import java.util.Arrays;
class Anagram {
    public static void main(String[] args) {
        String s1 = "li$ten*";
        String s2 = "$ile*nt";

        System.out.println(isAnagram(s1,s2));
    }

    static boolean isAnagram(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        s1 = new String(arr1);
        s2 = new String(arr2);
        System.out.println("s1 is: " + s1);

        System.out.println("s2 is: " + s2);
        return s1.equals(s2);
    }
}
