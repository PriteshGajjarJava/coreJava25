

class SumOfDigits {
    public static void main(String[] args) {
	String s = "aa71b5f2";// 7+1+5+2 = 15
	System.out.println(getSumOfDigits(s));
    }

    static int getSumOfDigits(String input) {
    	int sum = 0;
	for (int i=0; i < input.length(); i++) {
	   char ch = input.charAt(i);
	   if( Character.isDigit(ch)) {
		sum = sum + Character.getNumericValue(ch);
	   }
	}
	return sum;
    }
}
