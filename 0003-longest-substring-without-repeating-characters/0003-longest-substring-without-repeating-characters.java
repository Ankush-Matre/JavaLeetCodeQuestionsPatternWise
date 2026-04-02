class Solution {
    public int lengthOfLongestSubstring(String s) {

        Map<Character , Integer> mp = new HashMap<>();
        int left = 0;
        int result = 0;

        for(int right = 0; right < s.length(); right++){
            char ch = s.charAt(right);
            mp.put(ch , mp.getOrDefault(ch , 0) + 1);

            while(mp.get(ch) > 1){
                char leftChar = s.charAt(left);

                mp.put(leftChar , mp.get(leftChar) - 1);

                if(mp.get(leftChar) == 0){
                    mp.remove(leftChar);
                }
                left++;
            }
            result = Math.max(result , right - left + 1);
        }
        return result;
    }
}