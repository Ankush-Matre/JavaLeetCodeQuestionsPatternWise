class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int left = 0;
        double sum = 0.0;
        double avg = 0.0;
        double maxAvg = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){

            sum = sum + nums[i];
            avg = sum / k;
            
            if(i - left + 1 == k){
                maxAvg = Math.max(avg , maxAvg);

                sum = sum - nums[left];
                left++;
            }
            
        }
        return maxAvg;
    }
}