class Solution {
    public void sortColors(int[] nums) {
        if(nums==null || nums.length<2){
            return;
        }
        int low=0;
        int high=nums.length-1;
        int mid=0;
        while(mid<=high){
            if(nums[mid]<1){
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                low++;
                mid++;
            } else if(nums[mid]>1){
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            } else{
                mid++;
            }
        }

        // for(int i=0;i<nums.length-1;i++){
        //     for(int j=0;j<nums.length-i-1;j++){
        //         if(nums[j]>nums[j+1]){
        //             int temp=nums[j];
        //             nums[j]=nums[j+1];
        //             nums[j+1]=temp;
        //         }
        //     }
        // }
        
    }
}