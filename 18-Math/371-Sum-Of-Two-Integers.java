// Problem Number: 371
// Problem Name: Sum of Two Integers
// Difficulty: Medium
// Topic: Math
// Problem Link: https://leetcode.com/problems/sum-of-two-integers/
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int getSum(int a, int b) {

        int c = 0;

        while (b != 0) {
            c = a ^ b;
            b = (a & b) << 1;
            a = c;
        }

        return a;
    }
}