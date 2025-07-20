class CharCountInString {
    public static void main(String[] args) {
	String s = "We are learning core Java";
	char ch = 'a';

	int output = getCountOfCharInString(s, ch);
	System.out.println("Output is " + output);
 	
	System.out.println(getCountOfCharInString("I am glad that it can work like this too", 't'));
    }

    static int getCountOfCharInString(String input, char ch) {
	int cnt = 0;
	for (int i = 0; i < input.length(); i++) {
	   if (input.charAt(i) == ch) {
		cnt++;
	   }
	}
	return cnt;
    }
}
