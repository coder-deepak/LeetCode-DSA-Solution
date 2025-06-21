class Solution {
    public boolean isPalindrome(String s) {
        String newS = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int n = newS.length();

        for(int i = 0; i < n/2; i++){
            if(newS.charAt(i) != newS.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
}