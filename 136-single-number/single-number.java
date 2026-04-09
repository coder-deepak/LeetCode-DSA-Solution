class Solution {
    public int singleNumber(int[] nums) {
        int res= nums[0];
        for(int i = 0; i < nums.length-1; i++){
            res = res^nums[i+1];
        }

        return res;
    }
}