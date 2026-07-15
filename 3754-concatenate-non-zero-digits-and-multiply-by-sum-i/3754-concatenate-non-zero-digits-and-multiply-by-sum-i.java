class Solution {
    public long sumAndMultiply(int n) {

        int sum = 0;
        long numberWithoutZeros = 0;
        long place = 1;

        while (n > 0) {
            int digit = n % 10;

            sum += digit;

            if (digit != 0) {
                numberWithoutZeros += digit * place;
                place *= 10;
            }

            n /= 10;
        }

        return numberWithoutZeros * sum;
    }
}