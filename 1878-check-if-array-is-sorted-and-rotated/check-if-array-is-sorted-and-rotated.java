class Solution {
    public boolean check(int[] nums) {
        int l = nums.length;
        int count = 0;
        for(int i = 0; i < l; i++){
            if (nums[i] > nums[(i+1)%l]){
                count++;
            }
        }
        return count<=1;
    }
}