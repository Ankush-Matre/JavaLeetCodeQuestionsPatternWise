class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int i = 0;
        int j = nums.length - 1;

        int index = nums.length - 1;

        while(i <= j){
            if(Math.abs(nums[i]) > Math.abs(nums[j])){
                ans[index] = nums[i] * nums[i];
                index--;
                i++;
            }
            else{
                ans[index] = nums[j] * nums[j];
                index--;
                j--;
            }
        }

       return ans; 
    }
}