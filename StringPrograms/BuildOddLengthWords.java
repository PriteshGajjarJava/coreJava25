class BuildOldLengthWords {
  public static void main(String[] args) {
	String str = "aa bbb ccccc ee f hhh";
	String output = buildStringWithOddWords(str);
  	System.out.println(output);
  }

  static String buildStringWithOddWords(String input) {
	String[] words = input.split(" ");
	String output = "";
	
	for (String w : words) {
	  if (w.length() %2 != 0) {
	    output = output + w + "#";
	  }
	}
	// bbb#ccccc#f#hhh#
	return output.substring(0, output.length()-1);
  }
}
