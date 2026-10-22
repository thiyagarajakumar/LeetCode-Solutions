// Problem Number: 11
// Problem Name: Container With Most Water
// Difficulty: Medium
// Topic: Array, Two Pointers, Greedy
// Problem Link: https://leetcode.com/problems/container-with-most-water/
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int maxArea(int[] height) {
        int max=0,i=0,j=height.length-1;
        while(i<j)
        {
            int h=Math.min(height[i],height[j]);
            int l=j-i;
            int q=l*h;
            if(max<q)
            {
                max=q;
            }
            if(height[i]<height[j])
            {
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}