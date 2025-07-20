// input = "We are learning String programs".
// output => Number of words is 5
// aa bb qq => 3

public class CountOfWords {
  public static void main(String[] args) {
	System.out.println(getCountOfWords("We are learning String programs"));
	System.out.println(getCountOfWords("aa bb cc"));
  }

  static int getCountOfWords(String input) {
	return input.split(" ").length;
  }
}
