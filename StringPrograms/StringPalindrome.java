

class StringPalindrom {
  public static void main(String[] args) {
	System.out.println(isPalindrom("Nitin"));//t
	System.out.println(isPalindrom("Madam"));//t
	System.out.println(isPalindrom("aabbccaa"));//false
	System.out.println(isPalindrom("abcdba"));//false
  }

  static boolean isPalindrom(String input) {
	return input.equalsIgnoreCase(reverse(input));// "Nitin".equalsIgnoreCase("nitiN")
  }

  static String reverse(String s) {
        char[] arr = s.toCharArray();

        for (int i=0, j=arr.length-1 ; i < j; i++, j--) {
          // swap
          char temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
        return new String(arr);
  }

}
