class Solution {
    public void rotate(int[][] matrix) {
int n=matrix[0].length;

int k=0;
     for(int i=0;i<n;i++)
     {
        for(int j=n-1;j>=0;j--)
        {
               int t=matrix[i][k];
                matrix[i][k]=matrix[j][i];
                matrix[j][i]=t;
                k++;
        }
        k=0;
     }
     
    }
}