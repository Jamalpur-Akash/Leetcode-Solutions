class Solution {
    public int pivotIndex(int[] nums) {
        
        int totalSum=sum(0, nums.length, nums);

        
        int mid=totalSum/2;
        int newSum=0;
        for(int j=0;j<nums.length;j++){
            int p=j;

            int leftSum=0, rightSum=0;
        
            if(p==0){
                leftSum=0;
                rightSum=sum(p+1, nums.length, nums);

            } else if(p==nums.length-1){
                leftSum=sum(0, p, nums);
                rightSum=0;

            } else{
                leftSum=sum(0, p, nums);
                rightSum=sum(p+1, nums.length, nums);
            }

            if(leftSum==rightSum){
                return p;
            }


        }
        return -1;

    }
    public int sum(int s, int e, int[] nums){
        int n=0;
        for(int i=s;i<e;i++){
            n+=nums[i];
        }
        return n;
    }
}