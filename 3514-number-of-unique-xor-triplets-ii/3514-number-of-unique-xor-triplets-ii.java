class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length; int max = 0;
        for(int num : nums)max = Math.max(max,num);

        int u = 1;
        while(u <= max){
            u <<= 1;
        }
        boolean[]s = new boolean[u];
        s[0] = true;

        for(int i = 0 ; i < n ; i++){
            for(int j = i+1 ; j < n ; j++){
                s[nums[i]^nums[j]] = true;
            }
        }

        boolean[]t = new boolean[u];
        for(int i = 0 ; i < u ; i++){
            if(!s[i])continue;
            for(int num : nums){
                t[num ^ i] = true;
            }
        }

        int result = 0;
        for(boolean val : t){
            if(val)result++;
        }

        return result;
    }
}