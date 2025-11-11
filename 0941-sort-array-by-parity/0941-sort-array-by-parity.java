class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] ans = new int[nums.length];
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] % 2 == 0 && i < ans.length){
                ans[i] = nums[j];
                i++;
            }
        }
        for(int j = 0; j < nums.length; j++){
            if(nums[j] % 2 != 0 && i < ans.length){
                ans[i] = nums[j];
                i++;
            }
        }

        return ans;
    }
}