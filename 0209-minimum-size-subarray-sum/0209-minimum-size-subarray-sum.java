class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int left = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;

        for(int right = 0; right < nums.length; right++){
            
            int num = nums[right];
            sum = sum + num;

            while(sum >= target){
                result = Math.min(result , right - left + 1);

                sum = sum - nums[left];
                left++;
            }


        }

        if(result == Integer.MAX_VALUE){
            return 0;
        }
        else{
            return result;
        }
    
    }
}