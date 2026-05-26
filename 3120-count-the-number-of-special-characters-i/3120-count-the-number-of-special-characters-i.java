class Solution {
    public int numberOfSpecialChars(String word) {

        int count = 0;
        boolean[] upper = new boolean[26];
        boolean[] lower = new boolean[26];

        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);

            if(Character.isUpperCase(ch)){
                upper[ch - 'A'] = true;
            }
            else{
                lower[ch - 'a'] = true;
            }
        }

        for(int i = 0; i < 26; i++){
            if(upper[i] == true && lower[i] == true){
                count++;
            }
        }

        return count;
    }
}