class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int i = nums.length - 1;
        int st = 0;
        int ed = nums.length - 1;

        while(st <= ed){
            if(Math.abs(nums[st]) > Math.abs(nums[ed])){
                ans[i] = nums[st] * nums[st];
                st++;
                i--;
            }
            else{
                ans[i] = nums[ed] * nums[ed];
                ed--;
                i--;
            }
        }
        return ans;
        
    }
}