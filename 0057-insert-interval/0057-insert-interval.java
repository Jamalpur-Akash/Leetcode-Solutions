class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        int[][] result = new int[intervals.length + 1][2];
        int k=0;

        for(int i=0;i<intervals.length;i++) {
  
            if(intervals[i][1]<newInterval[0]) {
                result[k++]=intervals[i];
            }

            else if(intervals[i][0]>newInterval[1]) {
                result[k++]=newInterval;
    
                for(int j=i;j<intervals.length;j++) {
                    result[k++]=intervals[j];
                }

                return Arrays.copyOf(result,k);
            }
 
            else{
                newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
                newInterval[1]=Math.max(newInterval[1],intervals[i][1]);
            }
        }

        result[k++]=newInterval;
        return Arrays.copyOf(result,k);
    }
}