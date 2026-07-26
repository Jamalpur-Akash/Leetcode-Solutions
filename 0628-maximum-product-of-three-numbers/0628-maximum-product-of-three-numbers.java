class Solution {
    public int maximumProduct(int[] nums) {
        if(nums==null || nums.length<3){
            return -1;
        }
        Arrays.sort(nums);
        int n=nums.length;
        int max1=nums[n-1]*nums[n-2]*nums[n-3];
        int max2=nums[0]*nums[1]*nums[n-1];

        int maximum=Math.max(max1, max2);
        
        // int left=0;
        // int right=n-1;
        // int maxPro=Integer.MIN_VALUE;
        // for(int j=1;j<nums.length;j++){
        //     while(left<right){
        //     int pro=nums[left]*nums[j]*nums[right];
        //     maxPro=Math.max(maxPro, pro);
        //     left++;
        //     right--;
        //     }
            
        // }





        
        
        // int maxPro=Integer.MIN_VALUE;
        
        // for(int j=0;j<nums.length-2;j++){
        //     for(int k=j+1;k<nums.length-1;k++){
        //         for(int v=k+1;v<nums.length;v++){
        //             int pro=nums[j]*nums[k]*nums[v];
        //             if(maxPro<pro){
        //                 maxPro=pro;
        //             } 
        //         }
        //     }
        // }
        
        return maximum;
    }
}