import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        // Step 1: HashMap to store next greater element of nums2 values
        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 2: Stack to help find next greater elements
        Stack<Integer> stack = new Stack<>();

        // Step 3: Traverse nums2 from right to left
        for (int i = nums2.length - 1; i >= 0; i--) {

            // Remove all elements smaller than or equal to current
            while (!stack.isEmpty() && stack.peek() <= nums2[i]) {
                stack.pop();
            }

            // If stack is empty, no greater element exists
            if (stack.isEmpty()) {
                map.put(nums2[i], -1);
            } else {
                map.put(nums2[i], stack.peek());
            }

            // Push current element into stack
            stack.push(nums2[i]);
        }

        // Step 4: Build result for nums1 using HashMap
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]);
        }

        return result;
    }
}
