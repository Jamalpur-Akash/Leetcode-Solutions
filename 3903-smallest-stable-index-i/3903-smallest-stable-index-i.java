class Solution {
    public int firstStableIndex(int[] nums, int k) {
        
        
        int leastStable=Integer.MAX_VALUE;
        int stable=-1;
        for(int i=0;i<nums.length;i++){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
    
        for(int j=0;j<=i;j++){
            if(i==0){
                max=nums[i];
                break;
            }
            if(max<nums[j]){
                max=nums[j];
            }
        }

        for(int j=i;j<nums.length;j++){
            if(i==nums.length-1){
                min=nums[i];
            }
            if(min>nums[j]){
                min=nums[j];
            }

        }
        

        int score=max-min;
        if(score<=k){
            stable=i;
        
            if(stable<leastStable){
                leastStable=stable;
            }
        }
        }
        if(stable==-1){
            return -1;
        }
        return leastStable;
        

    }
}