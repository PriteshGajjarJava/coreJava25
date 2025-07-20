
// input : mYpROgRAm output: MyProGraM
// input :  aAbbBcCCdD output : AaBBbCccDd


Check if String is ANAGRAM or NOT

//abcd 
//dcba

class AlternateCase {
    public static void main(String[] args) {
        String str = "mYpROgRAm";
        String output = alternateCaseInString(str);
        System.out.println("Output is:" + output);
    }

    static String alternateCaseInString(String str) {
        String result = "";
        for (int i=0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                result += Character.toLowerCase(ch);
            } else {
                result += Character.toUpperCase(ch);
            }
        }
        return result;
    }
}
