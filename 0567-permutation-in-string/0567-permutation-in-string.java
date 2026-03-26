class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> map = new HashMap<>();

    // Step 1: Store frequency of s1
    for (char c : s1.toCharArray()) {
        map.put(c, map.getOrDefault(c, 0) + 1);
    }

    int count = map.size(); // unique characters to match
    int left = 0;

    // Step 2: Sliding window
    for (int right = 0; right < s2.length(); right++) {
        char ch = s2.charAt(right);

        // Reduce frequency if char exists
        if (map.containsKey(ch)) {
            map.put(ch, map.get(ch) - 1);
            if (map.get(ch) == 0) count--;
        }

        // Step 3: When window size equals s1 length
        if (right - left + 1 == s1.length()) {

            // Check if valid permutation
            if (count == 0) return true;

            char leftChar = s2.charAt(left);

            // Remove left character (slide window)
            if (map.containsKey(leftChar)) {
                if (map.get(leftChar) == 0) count++;
                map.put(leftChar, map.get(leftChar) + 1);
            }

            left++;
        }
    }

    return false;
    }
}