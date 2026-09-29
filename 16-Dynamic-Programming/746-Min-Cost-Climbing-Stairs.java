// Problem Number: 746
// Problem Name: Min Cost Climbing Stairs
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int a[]=new int[cost.length];
        a[0]=cost[0];
        a[1]=cost[1];
        for(int i=2;i<cost.length;i++){
           int x=Math.min(a[i-2],a[i-1]);
            a[i]=x+cost[i];
        }
        return Math.min(a[cost.length-2],a[cost.length-1]);
    }
}