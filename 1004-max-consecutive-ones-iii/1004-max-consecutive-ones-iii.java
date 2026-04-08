class Solution {
    public int longestOnes(int[] nums, int k) {

        int left = 0;
        int zeroCount = 0;
        int result = 0;

        for(int right = 0; right < nums.length; right++){
            int num = nums[right];

            if(num == 0){
                zeroCount++;
            }

            while(zeroCount > k){
                int leftElement = nums[left];

                if(leftElement == 0){
                    zeroCount--;
                }

                left++;
            }

            result = Math.max(result , right - left + 1);
        }
        return result;
    }
}