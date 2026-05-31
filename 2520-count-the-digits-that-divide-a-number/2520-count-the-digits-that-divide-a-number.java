class Solution {
    public int countDigits(int num) {

        if(num < 10){
            return 1;
        }

        int count = 0;
        int newNum = num;
        while(num != 0){
            int digit = num % 10;
            if(newNum % digit == 0){
                count++;
            }
            num = num / 10;
        }

        return count;
    }
}