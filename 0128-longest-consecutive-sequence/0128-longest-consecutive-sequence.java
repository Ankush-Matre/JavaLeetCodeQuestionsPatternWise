class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            hs.add(nums[i]);
        }
        
        int result = 0;
        for(int num : hs){
            
            int currentNum = num;
            int currentStreak = 0;
            if(!hs.contains(num - 1)){

                currentStreak = 1;

                while(hs.contains(currentNum + 1)){
                    currentNum++;
                    currentStreak++;
                }
            }
            result = Math.max(result , currentStreak);
        }
        return result;
    }
}