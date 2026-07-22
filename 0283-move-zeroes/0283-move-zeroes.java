class Solution {
    public void moveZeroes(int[] nums) {
        // if(nums.length==1 || nums.length==0){
            
        // }
        
        int i=0;
        //while()
        for(int j=0;j<nums.length;j++){
           if(nums[j]!=0){ 
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
        }
        
    }
}