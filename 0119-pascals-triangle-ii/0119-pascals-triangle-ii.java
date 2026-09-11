class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> demo;
        for(int i=0;i<=rowIndex;i++){
            demo=new ArrayList<>();

            //first element
            demo.add(1);

            //middle elements from i=2
            for(int j=1;j<i;j++){
                demo.add((list.get(i-1).get(j-1)) + (list.get(i-1).get(j)));
            }

            //last element
            if(i>0){
                demo.add(1);
            }

            
            list.add(demo);
        }
        return list.get(rowIndex);
    }
}