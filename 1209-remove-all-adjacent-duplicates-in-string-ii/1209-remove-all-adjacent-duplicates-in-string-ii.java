class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> charSt=new Stack<>();
        Stack<Integer> countSt=new Stack<>();
        
        for(char ch:s.toCharArray()){
            if(charSt.size()>0 && charSt.peek()==ch)
            {
                countSt.push(countSt.peek()+1);
            } 
            else{
            countSt.push(1);
            }

            charSt.push(ch);
            if(countSt.peek()==k){
                for(int i=0;i<k;i++){
                    charSt.pop();
                    countSt.pop();
                }
            }
        }
        
        // StringBuilder sb=new StringBuilder();
        // while(charSt.size()>0) sb.append(charSt.pop());
        // return sb.reverse().toString();

        String ans = "";
        while(charSt.size() > 0){
            ans = ans + charSt.pop();
        }
        String result ="";
        for(int i = ans.length() - 1; i >= 0; i--){
            char ch = ans.charAt(i);
            result = result + ch;
        }
        return result;
    }
}