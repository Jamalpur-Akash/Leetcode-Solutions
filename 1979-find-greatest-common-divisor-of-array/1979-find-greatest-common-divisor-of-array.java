//import java.lang.*;
class Solution {
    public int findGCD(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }

        int min=max;
        for(int j=0;j<nums.length;j++){
            if(min>nums[j]){
                min=nums[j];
            }
        }

        return gcd(max, min);
    }


    private int gcd(int a, int b){
        while(b!=0){
            int temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }
}