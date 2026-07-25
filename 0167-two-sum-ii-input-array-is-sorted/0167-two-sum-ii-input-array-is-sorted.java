class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //array is sorted

        int i=0;
        int j=numbers.length-1;
        while(numbers[i]+numbers[j] != target){
            int sum=numbers[i]+numbers[j];
            if(sum>target){
                j--;
            }
            if(sum<target){
                i++;
            }
        }
        return new int[]{i+1,j+1};

        // HashMap<Integer, Integer> map=new HashMap<>();
        // for(int i=0;i<numbers.length;i++){
        //     int complement=target-numbers[i];
        //     if(map.containsKey(complement)){
        //         return new int[]{map.get(complement),i+1};
        //     }
        //     map.put(numbers[i],i+1);
        // }
        // return new int[]{};
    }
}