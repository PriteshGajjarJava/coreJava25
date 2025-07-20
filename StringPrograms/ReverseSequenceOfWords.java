

//Ajay is learning in 4th
//4th in learning is Ajay

class ReverseSequenceOfWords {
  public static void main(String[] args) {
	String s = "Ajay is learning in 4th";
	String output = revSequenceOfWords(s);
	System.out.println(output);
  }

  static String revSequenceOfWords(String input) {
	String[] words = input.split(" ");//["Ajay", "is", "learning", "in", "4th"]

	for (int i=0, j=words.length-1; i<j; i++,j--) {
 	  String t = words[i];
	  words[i] = words[j];
	  words[j] = t;
	}
	//["4th", "in", "learning", "is", "Ajay"]
	return String.join(" ", words);
  } 
}
