// Problem Number: 509
// Problem Name: Fibonacci Number
// Difficulty: Easy
// Topic: Math
// Problem Link: https://leetcode.com/problems/fibonacci-number/
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int a[]=new int[n+1];
        a[0]=0;
        a[1]=1;
        for(int i=2;i<=n;i++){
            a[i]=a[i-2]+a[i-1];
        }
        return a[n];
    }
}