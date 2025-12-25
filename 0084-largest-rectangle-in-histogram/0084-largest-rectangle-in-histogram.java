class Solution {
    public int largestRectangleArea(int[] heights) {
        
        Stack<Integer> st = new Stack<>();
        int n = heights.length;
        int[] nse = new int[heights.length];
        int[] pse = new int[heights.length];

        nse[n - 1] = n;
        st.push(n - 1);
        //next smaller Element
        for(int i = n - 2; i>= 0; i--){
            while(!st.isEmpty() && heights[i] <= heights[st.peek()]){
                st.pop();
            }

            if(st.isEmpty()){
                nse[i] = n;
            }
            else{
                nse[i] = st.peek();
            }

            st.push(i);
        }
        //Stack empty karun ghe
        while(!st.isEmpty()){
            st.pop();
        }

        //prev smaller element
        pse[0] = -1;
        st.push(0);

        for(int i = 1; i < n; i++){
            while(!st.isEmpty() && heights[i] <= heights[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                pse[i] = -1;
            }
            else{
                pse[i] = st.peek();
            }
            st.push(i);
        }

        int ans = -1;
        for(int i = 0; i < n; i++){
            int area = heights[i] * (nse[i] - pse[i] - 1);
            ans = Math.max(ans , area);
        }

        return ans;
    }
}