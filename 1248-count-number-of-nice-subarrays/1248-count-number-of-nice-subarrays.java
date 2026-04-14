class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int ans = atMostK(nums , k) - atMostK(nums , k - 1);
        return ans;
    }

    public int atMostK(int[] nums , int k){
        
        int left = 0;
        int oddCount = 0;
        int result = 0;

        for(int right = 0; right < nums.length; right++){
            int num = nums[right];
            
            if(num % 2 != 0){
                oddCount++;
            }

            while(oddCount > k){
                int leftElement = nums[left];

                if(leftElement % 2 != 0){
                    oddCount--;
                }
                left++;
            }
            result = result + (right - left + 1);
        }
        return result;
    }
}