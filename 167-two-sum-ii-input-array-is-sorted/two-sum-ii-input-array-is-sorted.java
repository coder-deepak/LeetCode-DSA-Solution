class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;
        ArrayList<Integer> arr = new ArrayList<>();
        int[] res = new int[2];

        while(start < end){
            int sum = numbers[start] + numbers[end];
            if( sum == target){
                arr.add(++start);
                arr.add(++end);
                res[0] = arr.get(0);
                res[1] = arr.get(1);

                return res;
            }
            else if(sum > target){
                end--;
            }
            else if(sum < target){
                start++;
            }
        }
        return res;
    }
}