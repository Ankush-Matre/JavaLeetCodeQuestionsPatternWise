class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }

        int result = 0;
        
        for(int num : set){
            int currentElement = num;
            
            if(!set.contains(currentElement - 1)){
                int currentStreak = 1;

                while(set.contains(currentElement + 1)){
                    currentElement++;
                    currentStreak++;
                }

                result = Math.max(result , currentStreak);
            }
        }
        return result;
    }
}