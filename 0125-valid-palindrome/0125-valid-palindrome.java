class Solution {
    public boolean isPalindrome(String s) {
        String convert=s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        int n=convert.length();
        char[] letters=convert.toCharArray();
        int left=0;
        int right=n-1;
        while(left<right){
            if(letters[left]==letters[right]){
                left++;
                right--;
            } else{
                return false;
            }
        }
        return true;
    }
}