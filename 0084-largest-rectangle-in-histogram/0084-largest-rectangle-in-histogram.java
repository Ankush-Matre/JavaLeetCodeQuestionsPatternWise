class Solution {
    public int largestRectangleArea(int[] heights) {

        Stack<Integer> st = new Stack<>();
        int n = heights.length;
        int[] nse = new int[n];
        int[] pse = new int[n];

        //nse
        nse[n - 1] = n;
        st.push(n - 1);
        for(int i = n - 2; i >= 0; i--){
            while(st.size() > 0 && heights[i] <= heights[st.peek()]){
                st.pop();
            }
            if(st.size() == 0){
                nse[i] = n;
            }
            else{
                nse[i] = st.peek();
            }
            st.push(i);
        }

        while(!st.isEmpty()){
            st.pop();
        }

        //pse
        pse[0] = -1;
        st.push(0);
        for(int i = 1; i < n; i++){
            while(st.size() > 0 && heights[i] <= heights[st.peek()]){
                st.pop();
            }
            if(st.size() == 0){
                pse[i] = -1;
            }
            else{
                pse[i] = st.peek();
            }
            st.push(i);
        }

        int max = -1;
        for(int i = 0; i < n; i++){
            int area = heights[i] * (nse[i] - pse[i] - 1);
            max = Math.max(max , area);
        }
        
        return max;
    }
}