class Solution {
    public int maxProduct(int n) {
        
        int count=0;
        int temp=n;
        while(temp>0){
            int val=temp%10;
            count++;
            
            // pro*=val;
            // if(maxPro<pro){
            //     maxPro=pro;
            // }
            temp/=10;
        }
        int[] res=new int[count];
        int i=0;
        while(n>0){
            int val=n%10;
            res[i]=val;
            i++;
            n/=10;
        }
        int maxPro=0;
        
        for(int j=0;j<res.length;j++){
            for(int k=j+1;k<res.length;k++){
               int pro=res[j]*res[k];
                if(maxPro<pro){
                    maxPro=pro;
                } 
            }
        }
        
        // for(int k=0;k<res.length-1;k++){
        //     int pro=res[k]*res[k+1];
        //     if(maxPro<pro){
        //         maxPro=pro;
        //     }
            
        // }
        return maxPro;
    }
}