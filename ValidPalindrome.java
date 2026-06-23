
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
           if(c>='A'&&c<='Z')
           {
            c=(char)(c+32);
            sb.append(c);
           }
           else if((c>='a' &&c<='z')||(c>='0'&&c<='9'))
           {
            sb.append(c);
           }
        
        }
        String rev = new StringBuilder(sb).reverse().toString();
            if(sb.toString().equals(rev))
            {
                return true;
            }
            return false;

    }
}