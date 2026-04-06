class Solution {
    public char findTheDifference(String s, String t) {

        char ch = 0;

        for(int i = 0; i < s.length(); i++){
            char sCh = s.charAt(i);
            ch ^= sCh;
        }

        for(int i = 0; i < t.length(); i++){
            char tCh = t.charAt(i);
            ch ^= tCh;
        }

        return ch;
    }
}