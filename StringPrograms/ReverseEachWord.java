
// WAP which reverse each word in given string
// e.g. input = "Today is Sunday" o/p= "yadoT si yadnuS"

class ReverseEachWord {
    public static void main(String[] args) {
	String input = "Today is Sunday";
	String output = revEachWord(input);
	System.out.println("Output is:" + output);
    }

    static String revEachWord(String str) {
	// str = "Today is Sunday"
	String[] words = str.split(" "); // ["Today", "is", "Sunday"]
	for (int i=0; i < words.length; i++) {
	  words[i] = reverse(words[i]);
	}
	// ["yadoT", "si", "yadnuS"]
	return String.join(" ", words);
    }

    static String reverse(String s) {
	char[] arr = s.toCharArray(); // ['T','o','d','a','y']

	for (int i=0, j=arr.length-1 ; i < j; i++, j--) {
	  // swap
	  char temp = arr[i];
	  arr[i] = arr[j];
	  arr[j] = temp;
	}
	// ['y','a','d','o','T']
	return new String(arr);// "yadoT"
    }
}
