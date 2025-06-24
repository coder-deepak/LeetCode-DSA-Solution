class Solution {
    public int titleToNumber(String columnTitle) {
        // char[] c = columnTitle.toCharArray();
        int result = 0;

        for(int i = 0; i < columnTitle.length(); i++){
            int num = columnTitle.charAt(i) - 65 + 1;
            result = result * 26 + num;
        }
        return result;
    }
}