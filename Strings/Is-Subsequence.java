class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0,c=0;
        while(i<s.length()&&j<t.length())
        {
            if(s.charAt(i)==t.charAt(j))
            {
                i++;
                j++;
                c++;
            }
            else{
                if(j>t.length())
                break;
                j++;
            }
        }
        if(c==s.length()){
            return true;
        }
        return false;
    }
}