class Solution {
    public int characterReplacement(String s, int k) {

        int left = 0;
        int[] freq = new int[26];
        int maxFreq = 0;
        int result = 0;

        for(int right = 0; right < s.length(); right++){
            char ch = s.charAt(right);
            freq[ch - 'A']++;

            maxFreq = Math.max(maxFreq , freq[ch - 'A']);

            int windowSize = right - left + 1;

            int badCount = windowSize - maxFreq;

            while(badCount > k){
                char leftChar = s.charAt(left);
                freq[leftChar - 'A']--;
                left++;

                windowSize = right - left + 1;
                badCount = windowSize - maxFreq;
            }

            result = Math.max(result , windowSize);
        }

        return result;
    }
}