class Solution {
    public boolean uniformArray(int[] nums1) {
        // int count=0;
        // for(int i=0;i<nums1.length;i++){
        //     if(nums1[i]%2==0){
        //         count++;
        //     } else{
        //         count--;
        //     }
        // }
        // if(count==0){
        //     return false;
        // }
        // return true;


        boolean anniEven=true;
        int min=nums1[0];
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]%2!=0){
                anniEven=false;
            }
            min=Math.min(min, nums1[i]);
        }

        if(anniEven){
            return true;
        }
        return min%2!=0;
    }
}