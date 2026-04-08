class Solution {
    public int longestSubarray(int[] nums) {

        int left = 0;
        int zeroCount = 0;
        int result = 0;
        for (int right = 0; right < nums.length; right++) {
            int num = nums[right];

            if(num == 0){
                zeroCount++;
            }

            while(zeroCount > 1){
                int leftElement = nums[left];

                if(leftElement == 0){
                    zeroCount--;
                }
                left++;
            }
            result = Math.max(result , right - left);
        }

        return result;
    }
}