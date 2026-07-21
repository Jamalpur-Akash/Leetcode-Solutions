class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            
            int smallCount=0;
            while(n!=0){
                int r=n%10;
                n/=10;
                smallCount++;
            }
            if(smallCount % 2 == 0){
                count++;
            }
        }
        return count;
    }
}