class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character>charSt = new Stack<>();
        Stack<Integer>countSt = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(charSt.size() > 0 && charSt.peek() == ch){
                countSt.push(countSt.peek() + 1);
            }
            else{
                countSt.push(1);
            }

            //kahi zal tri char charStack madhye takav ch lagel
            charSt.push(ch);

            if(countSt.peek() == k){
                for(int j = 0; j < k; j++){
                    countSt.pop();
                    charSt.pop();
                }
            }
        }

        StringBuilder ans = new StringBuilder();

        while(!charSt.isEmpty()){
            ans.append(charSt.pop());
        }
        return ans.reverse().toString();
    }
}