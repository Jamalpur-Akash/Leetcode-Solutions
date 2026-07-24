class Solution {
    public int thirdMax(int[] nums) {
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
                
            }

        }

        
        int secondMax=Integer.MIN_VALUE;
        boolean secondFound=false;
        for(int j=0;j<nums.length;j++){
            if((!secondFound || secondMax<nums[j]) && nums[j]!=max){
                secondMax=nums[j];
                secondFound=true;
            }
        }


        int thirdMax=Integer.MIN_VALUE;
        boolean thirdFound=false;
        for(int k=0;k<nums.length;k++){
            if((!thirdFound || thirdMax<nums[k])   && nums[k]!=max && nums[k]!=secondMax){
                thirdMax=nums[k];
                thirdFound=true;
            }
        }

        if(!secondFound || !thirdFound){
            return max;
        }
        return thirdMax;
    }
}