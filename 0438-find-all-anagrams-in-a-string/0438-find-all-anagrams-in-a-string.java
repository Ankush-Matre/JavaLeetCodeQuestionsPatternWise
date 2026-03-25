class Solution {
public List<Integer> findAnagrams(String s, String p) {
    List<Integer> result = new ArrayList<>();
    Map<Character, Integer> map = new HashMap<>();

    // Store frequency of pattern
    for (char c : p.toCharArray()) {
        map.put(c, map.getOrDefault(c, 0) + 1);
    }

    int count = map.size();
    int left = 0;

    for (int right = 0; right < s.length(); right++) {
        char ch = s.charAt(right);

        // Decrease frequency
        if (map.containsKey(ch)) {
            map.put(ch, map.get(ch) - 1);
            if (map.get(ch) == 0) count--;
        }

        // When window size matches
        if (right - left + 1 == p.length()) {

            // Valid anagram
            if (count == 0) result.add(left);

            char leftChar = s.charAt(left);

            // Remove left element
            if (map.containsKey(leftChar)) {
                if (map.get(leftChar) == 0) count++;
                map.put(leftChar, map.get(leftChar) + 1);
            }

            left++;
        }
    }
    return result;
}
}