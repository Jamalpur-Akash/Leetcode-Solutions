class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int top=0;
        int left=0;
        int bottom=matrix.length-1;
        int right=matrix[0].length-1;

        while(top<=bottom && left<=right){
            //left -> right
            for(int i=left;i<=right;i++){
                list.add(matrix[top][i]);
            }
            top++;

            //top -> bottom
            for(int j=top;j<=bottom;j++){
                list.add(matrix[j][right]);
            }
            right--;

            //right -> left
            if(top<=bottom){
                for(int k=right;k>=left;k--){
                list.add(matrix[bottom][k]);
                }
                bottom--;
            }
        

            //bottom -> top
            if(left<=right){
                for(int p=bottom;p>=top;p--){
                list.add(matrix[p][left]);
                }
                left++;
            }
        }

        return list;

    }
}