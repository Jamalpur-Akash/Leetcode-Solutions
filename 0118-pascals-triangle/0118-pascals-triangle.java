class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> resultList=new ArrayList<>();

        for(int i=0;i<numRows;i++){
            //create list for every row
            List<Integer> list=new ArrayList<>();

            //first element
            list.add(1);

            //middle elements from row 3 which is i=2
            for(int j=1;j<i;j++){
                list.add(resultList.get(i-1).get(j-1) + resultList.get(i-1).get(j));
            }

            //last element
            if(i>0){
                list.add(1);
            }

            //add each row list to the main list
            resultList.add(list);
        }
        return resultList;
    }
}