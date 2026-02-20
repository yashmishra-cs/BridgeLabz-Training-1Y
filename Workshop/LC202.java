class Solution {
    public boolean isHappy(int n) {
        if(n<0){
            return false;
        }
         int sum;
        while (n != 1 && n != 4) {
            sum = 0;
            // find sum of squares of digits
            while (n > 0) {
                int digit = n % 10;
                sum = sum + (digit * digit);
                n = n / 10;
            }
            n = sum;
        }
        return n == 1;
    }
}