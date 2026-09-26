class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int index=i+1;
            int alph=26-(s.charAt(i)-'a');
            int mul=index*alph;
            sum+=mul;
        }
        return sum;
    }
}