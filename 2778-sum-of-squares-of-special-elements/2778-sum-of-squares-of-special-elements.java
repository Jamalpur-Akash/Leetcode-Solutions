class Solution {
    public int sumOfSquares(int[] nums) {
        int n=nums.length;
        int sum=0;
        int mul=0;
        for(int i=0;i<nums.length;i++){
            int j=i+1;
            if(n%j==0){
                mul=nums[i]*nums[i];
                sum+=mul;
            }
        }
        return sum;
    }
}