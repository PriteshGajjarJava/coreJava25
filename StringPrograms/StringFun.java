class StringFun {
   public static void main(String[] args) {
	String s1 = "String objects are immutable";

	System.out.println(s1.indexOf("ject"));
	System.out.println(s1.contains("table"));

	String s2 = s1.substring(s1.indexOf("im"));
	System.out.println(s2.length());
	System.out.println(s1.split(" ").length);

	System.out.println(s1.split(" ")[3]);

   }
}
