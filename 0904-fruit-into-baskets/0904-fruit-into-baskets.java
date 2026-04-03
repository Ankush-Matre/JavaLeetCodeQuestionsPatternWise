class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0;
        int result = 0;

        Map<Integer , Integer> mp = new HashMap<>();

        for(int right = 0; right < fruits.length; right++){
            int fruit = fruits[right];

            mp.put(fruit , mp.getOrDefault(fruit , 0) + 1);

            while(mp.size() > 2){
                int leftFruit = fruits[left];

                mp.put(leftFruit , mp.get(leftFruit) - 1);

                if(mp.get(leftFruit) == 0){
                    mp.remove(leftFruit);
                }
                left++;
            }
            result = Math.max(result , right - left + 1);

        }
        return result;
    }
}