class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder s=new StringBuilder();
        int i=0,j=0;
        while(i<word1.length()||j<word2.length())
        {
            if(i<word1.length() &&j<word2.length())
            {
                char c=word1.charAt(i);
                char ch=word2.charAt(j);
                s.append(c);
                s.append(ch);
                i++;
                j++;
            }
            else if(i>=word1.length() &&j<word2.length())
             {
             char c=word2.charAt(j);
            s.append(c);
            j++;
           }
          else{
                char ch=word1.charAt(i);
            s.append(ch);
            i++;

        }
            }
            return s.toString();
    }
}