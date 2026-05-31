class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        List<Integer> li = new ArrayList<>();
        
        while(left <= right){
            
            int num = left;
            boolean flag = true;

            while(num != 0){

                int digit = num % 10;
                num = num / 10;

                if(digit == 0 || left % digit != 0){
                    flag = false;
                    break;
                }
            }

            if(flag == true){
                li.add(left);
            }
            left++;
        }

        return li;

    }
}