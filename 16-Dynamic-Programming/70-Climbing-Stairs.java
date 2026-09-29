// Problem Number: 70
// Problem Name: Climbing Stairs
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int climbStairs(int n) {
        if(n==0)
        return 1;
        int a[]=new int[n+1];
        a[0]=1;
        a[1]=1;
        for(int i=2;i<=n;i++){
            a[i]=a[i-2]+a[i-1];
        }
        return a[n];
    }
}