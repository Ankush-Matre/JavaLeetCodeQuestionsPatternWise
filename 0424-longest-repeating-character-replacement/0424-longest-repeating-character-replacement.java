class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left = 0;
        int maxFreq = 0;
        int result = 0;

        for (int right = 0; right < s.length(); right++) {

            freq[s.charAt(right) - 'A']++;

            maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']);

            int windowSize = right - left + 1;

            int badCount = windowSize - maxFreq;

            while (badCount > k) {
                freq[s.charAt(left) - 'A']--;
                left++;

                windowSize = right - left + 1;
                badCount = windowSize - maxFreq;
            }

            result = Math.max(result, windowSize);
        }
        return result;

    }
}