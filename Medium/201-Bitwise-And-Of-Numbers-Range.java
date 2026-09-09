// Problem Number: 201
// Problem Name: Bitwise AND of Numbers Range
// Difficulty: Medium
// Topic: Bit Manipulation
// Problem Link: https://leetcode.com/problems/bitwise-and-of-numbers-range/
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        
int c=0;
        while(left!=right)
        {
            left=left>>1;
            right=right>>1;
            c++;
        }
        return right<<c;
    }
}