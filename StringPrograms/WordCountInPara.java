


class WordCountInPara {
    public static void main(String[] args) {
        String s1 = "aabe deaapqaa ghaa xyaax"; //aa
        String w = "aa";
        int cnt = getCountOfWords(s1,w);
        System.out.println("aa count is: " + cnt);
    }

    static int getCountOfWords(String s, String w) {
       int cnt = 0;
       
       while (s.contains(w)) {
        cnt++;
        int pos = s.indexOf(w);
        s = s.substring(pos + w.length());
       }
       return cnt;
    }
}
