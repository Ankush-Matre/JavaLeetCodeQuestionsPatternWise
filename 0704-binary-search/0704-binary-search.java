class Solution {
    public int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        boolean flag = false;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target == nums[mid]){
                flag = true;
                return mid;
            }
            else if(target > nums[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        
        if(flag == false){
            return -1;
        }
        return start;
    }
}