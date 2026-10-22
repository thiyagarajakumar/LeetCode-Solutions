// Problem Number: 20
// Problem Name: Valid Parentheses
// Difficulty: Easy
// Topic: String, Stack, Bracket Sequences
// Problem Link: https://leetcode.com/problems/valid-parentheses/
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public boolean isValid(String s) {

        char a[] = s.toCharArray();
        int m = 0;
        Stack<Character> st = new Stack<>();

        for(int i=0;i<a.length;i++)
        {
            if(a[i]=='[' || a[i]=='{' || a[i]=='(')
            {
                st.push(a[i]);
            }
            else
            {
                if(st.isEmpty())
                {
                    m=1;
                    break;
                }

                char c=st.pop();

                if((a[i]==']' && c!='[') ||
                   (a[i]=='}' && c!='{') ||
                   (a[i]==')' && c!='('))
                {
                    m=1;
                    break;
                }
            }
        }

        if(m==0 && st.isEmpty())
            return true;

        return false;
    }
}