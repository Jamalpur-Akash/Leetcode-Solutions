class Solution {
    public int captureForts(int[] forts) {
        int n=forts.length;
        int realMax=0;
        for(int i=0;i<n;i++){
            if(forts[i]!=0){
                int count=0;
                for(int j=i+1;j<n;j++){
                    if(forts[j]==0){
                        count++;
                        
                    } else{
                        if(forts[j]!=forts[i]){
                            realMax=Math.max(realMax,count);
                        }
                        break;
                        
                    }
                    
                }
            }
        }
        return realMax;
    }
}