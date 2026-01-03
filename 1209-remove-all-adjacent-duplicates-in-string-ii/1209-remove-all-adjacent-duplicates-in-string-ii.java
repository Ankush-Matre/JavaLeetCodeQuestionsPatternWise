import java.util.*;

class Solution {
    public String removeDuplicates(String s, int k) {

        Stack<Map.Entry<Character, Integer>> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (stack.isEmpty() || stack.peek().getKey() != ch) {
                stack.push(new AbstractMap.SimpleEntry<>(ch, 1));
            } else {
                stack.peek().setValue(stack.peek().getValue() + 1);

                if (stack.peek().getValue() == k) {
                    stack.pop();
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> p : stack) {
            sb.append(String.valueOf(p.getKey()).repeat(p.getValue()));
        }

        return sb.toString();
    }
}
