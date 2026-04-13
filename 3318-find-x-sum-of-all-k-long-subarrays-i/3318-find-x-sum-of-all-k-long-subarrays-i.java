import java.util.*;

class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] result = new int[n - k + 1];

        int[] freq = new int[51];
        int left = 0;

        for (int right = 0; right < n; right++) {

            freq[nums[right]]++;

            if (right - left + 1 == k) {

                List<int[]> list = new ArrayList<>();

                // build (value, frequency)
                for (int val = 1; val <= 50; val++) {
                    if (freq[val] > 0) {
                        list.add(new int[]{val, freq[val]});
                    }
                }

                // sort: freq DESC, value DESC
                list.sort((a, b) -> {
                    if (b[1] != a[1]) return b[1] - a[1];
                    return b[0] - a[0];
                });

                int sum = 0;

                // take top x distinct elements
                for (int i = 0; i < Math.min(x, list.size()); i++) {
                    int val = list.get(i)[0];
                    int f = list.get(i)[1];
                    sum += val * f;
                }

                result[left] = sum;

                // slide window
                freq[nums[left]]--;
                left++;
            }
        }

        return result;
    }
}