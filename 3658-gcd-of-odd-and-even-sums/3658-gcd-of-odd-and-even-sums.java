class Solution {
    public int gcdOfOddEvenSums(int n) {
        

        int oddSum = 0;
        int evenSum = 0;

        for(int i = 1; i <= n * 2; i++){
            if(i % 2 == 0){
                evenSum = evenSum + i;
            }
            else{
                oddSum = oddSum + i;
            }
        }

        while(evenSum != 0){
            int temp = evenSum;
            evenSum = oddSum % evenSum;
            oddSum = temp;
        }

        return oddSum;
    }
}