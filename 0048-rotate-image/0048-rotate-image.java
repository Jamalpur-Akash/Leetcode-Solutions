class Solution {
    public void rotate(int[][] matrix) {
        //90 degree = transpose + reverse row


        //Transpose
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix.length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        //reverse row
        for(int i=0;i<matrix.length;i++){
            int left=0;
            int right=matrix.length-1;
            while(left<right){
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
                left++;
                right--;
            }

        }

    }
}