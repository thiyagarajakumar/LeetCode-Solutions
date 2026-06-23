class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
   {
    return false;
    }
        int a[]=new int[26];
        int b[]=new int[26];
        char s1[]=s.toCharArray();
        char t1[]=t.toCharArray();
        for(int i=0;i<s1.length;i++)
        {
            a[s1[i]-'a']=a[s1[i]-'a']+1;
         b[t1[i]-'a']=b[t1[i]-'a']+1;
        }
       
       if( Arrays.equals(a,b))
       {
        return true;
       }
       
        return false;
       

    }
}