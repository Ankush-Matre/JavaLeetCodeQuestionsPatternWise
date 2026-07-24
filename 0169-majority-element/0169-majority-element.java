class Solution {
    public int majorityElement(int[] nums) {

        //Moore's Voting Algorithm (O(n) Time, O(1) Space)

        int count = 0;
        int candidate = 0;

        for(int i = 0; i < nums.length; i++){

            if(count == 0){
                candidate = nums[i];
            }

            if(candidate == nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }
}