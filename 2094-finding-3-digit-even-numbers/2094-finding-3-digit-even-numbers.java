class Solution {
    public int[] findEvenNumbers(int[] digits) {
        
        int[] freq = new int[10];
        
        // Step 1: Count frequency of digits
        for (int d : digits) {
            freq[d]++;
        }
        
        List<Integer> result = new ArrayList<>();
        
        // Step 2: Generate all 3-digit numbers
        for (int num = 100; num <= 999; num++) {
            
            if (num % 2 != 0) continue; // must be even
            
            int a = num / 100;         // hundreds
            int b = (num / 10) % 10;   // tens
            int c = num % 10;          // ones
            
            // Step 3: Check availability
            int[] temp = new int[10];
            temp[a]++;
            temp[b]++;
            temp[c]++;
            
            boolean valid = true;
            
            for (int i = 0; i < 10; i++) {
                if (temp[i] > freq[i]) {
                    valid = false;
                    break;
                }
            }
            
            if (valid) {
                result.add(num);
            }
        }
        
        // Convert list to array
        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }
        
        return ans;
    }
}