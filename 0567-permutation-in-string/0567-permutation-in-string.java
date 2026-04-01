class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int[] freq = new int[26];

        for(char ch : s1.toCharArray()){
            freq[ch - 'a']++;
        }

        int left = 0;
        int count = s1.length();

        for(int right = 0; right < s2.length(); right++){

            char ch = s2.charAt(right);

            if(freq[ch - 'a'] > 0){
                count--;
            }

            freq[ch - 'a']--;

            if(right - left + 1 > s1.length()){
                char leftChar = s2.charAt(left);

                if(freq[leftChar - 'a'] >= 0){
                    count++;
                }

                freq[leftChar - 'a']++;
                left++;
            }

            if(count == 0){
                return true;
            }
        }

        return false;
    }
}