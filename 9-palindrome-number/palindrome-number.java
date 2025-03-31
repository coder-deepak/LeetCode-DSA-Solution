class Solution {
    public boolean isPalindrome(int x) {
        int y = x, z=0;
        if(y < 0){
            return false;
        }
        else{
            while(y > 0){
                z = z * 10 + (y % 10);
                y /= 10;
            }
        }
        return x == z;
    }
}