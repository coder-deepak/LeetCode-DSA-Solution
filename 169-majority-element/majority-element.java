class Solution {
    public int majorityElement(int[] nums) {
        int count = 0, condidate = 0;
        for(int num : nums){
            if(count == 0){
                condidate = num;
            }
            count += (num == condidate)? 1 : -1;
        }
        return condidate;
    }
}