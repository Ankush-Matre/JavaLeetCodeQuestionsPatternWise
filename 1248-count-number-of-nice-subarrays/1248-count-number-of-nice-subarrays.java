class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    private int atMost(int[] nums, int k) {
        int left = 0;
        int countOdd = 0;
        int result = 0;

        for (int right = 0; right < nums.length; right++) {

            if (nums[right] % 2 != 0) {
                countOdd++;
            }

            while (countOdd > k) {
                if (nums[left] % 2 != 0) {
                    countOdd--;
                }
                left++;
            }

            // all subarrays ending at right
            result += (right - left + 1);
        }

        return result;
    }
}