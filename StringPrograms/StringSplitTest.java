import java.util.Arrays;
class StringSplitTest {
	public static void main(String[] args) {
	  String s = "I#am##beginner";
	  String[] w = s.split("#"); // ["I", "am", "", "beginner"]
	  System.out.println(Arrays.toString(w));
	}
}
