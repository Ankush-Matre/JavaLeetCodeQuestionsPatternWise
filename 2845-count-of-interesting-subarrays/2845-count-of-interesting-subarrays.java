class Solution {
    public long countInterestingSubarrays(List<Integer> nums, int modulo, int k) {
          Map<Integer, Integer> map = new HashMap<>();

        // Empty prefix
        map.put(0, 1);

        long count = 0;
        int prefixSum = 0;

        for (int num : nums) {

            // Convert current element into 1 or 0
            if (num % modulo == k) {
                prefixSum++;
            }

            // Current prefix remainder
            int currentRemainder = prefixSum % modulo;

            // Required previous remainder
            int required = (currentRemainder - k + modulo) % modulo;

            // If found, add all its occurrences
            count += map.getOrDefault(required, 0);

            // Store current remainder
            map.put(currentRemainder,
                    map.getOrDefault(currentRemainder, 0) + 1);
        }

        return count;

    }
}