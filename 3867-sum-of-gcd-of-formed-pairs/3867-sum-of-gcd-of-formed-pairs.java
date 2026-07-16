class Solution {

    public int gcdTwoNumber(int a , int b){

        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;

    }
    public long gcdSum(int[] nums) {
        
        int[] prefixGcd = new int[nums.length];

        int maxElement = 0;
        for(int i = 0; i < nums.length; i++){

            maxElement = Math.max(nums[i] , maxElement);
            
            prefixGcd[i] = gcdTwoNumber(nums[i] , maxElement);
        }
        
        Arrays.sort(prefixGcd);
        
        int i = 0;
        int j = prefixGcd.length - 1;
        long sum = 0;
        
        while(i < j) {
        	
        	long p1 = gcdTwoNumber(prefixGcd[i] , prefixGcd[j]);
        	sum = sum + p1;
        	i++;
        	j--;
        			
        }
        
        return sum;

    }
}