class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> li = new ArrayList<>();
        Map<Character, Integer> mp = new HashMap<>();

        for (int i = 0; i < p.length(); i++) {
            char ch = p.charAt(i);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }

        int count = mp.size();
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            if (mp.containsKey(ch)) {
                mp.put(ch, mp.get(ch) - 1);
                if (mp.get(ch) == 0) {
                    count--;
                }
            }

            if (right - left + 1 == p.length()) {

                if (count == 0) {
                    li.add(left);
                }

                char leftChar = s.charAt(left);

                if (mp.containsKey(leftChar)) {
                    if (mp.get(leftChar) == 0) {
                        count++;
                    }
                    mp.put(leftChar, mp.get(leftChar) + 1);
                }

                left++;
            }
        }
        return li;
    }
}