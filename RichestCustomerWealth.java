class Solution {
    public int maximumWealth(int[][] accounts) {
        int s=0,max=0;
        int m=accounts.length;
        int n=accounts[0].length;
        for(int j=0;j<m;j++){
        for(int i=0;i<n;i++)
        {
            s=s+accounts[j][i];
        }
        if(s>max)
        {
            max=s;
        }
        s=0;
        }
        return max;
    }
}