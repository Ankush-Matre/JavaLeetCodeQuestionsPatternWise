class Solution {
    public long sumAndMultiply(int n) {

        String str = "" + n;
        String temp = "";
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch != '0'){
                temp = temp + ch;
            }
        }

        long x = 0;
        if(temp.isEmpty()){
            x = 0;
        }
        else{
            x = Long.parseLong(temp);
        }

        int sum = 0;
        while(n != 0){
            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;

        }

        return x * sum;
    }
}