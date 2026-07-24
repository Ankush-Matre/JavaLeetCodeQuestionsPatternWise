class Solution {
    public int mostFrequentEven(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of even numbers only
        for (int num : nums) {

            if (num % 2 == 0) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        // If there are no even numbers
        if (map.isEmpty()) {
            return -1;
        }

        int maxFrequency = 0;
        int answer = -1;

        // Find the most frequent even number
        for (int key : map.keySet()) {

            int frequency = map.get(key);

            // Higher frequency found
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                answer = key;
            }

            // Same frequency, choose the smaller even number
            else if (frequency == maxFrequency && key < answer) {
                answer = key;
            }
        }

        return answer;
    }
}