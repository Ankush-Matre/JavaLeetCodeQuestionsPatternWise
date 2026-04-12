class Solution {
    public int maxArea(int[] height) {

        int start = 0, end = height.length - 1;
        int mostWater = 0;

        while(start < end){

            int w = end - start;
            int h = Math.min(height[start], height[end]);

            mostWater = Math.max(mostWater, (w * h));

            if(height[start] < height[end]) start++;
            else end--;
        }

        return mostWater;
    }
}