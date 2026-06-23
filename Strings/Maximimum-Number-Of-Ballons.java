
class  {
    public int maxNumberOfBalloons(String text) {
        char s[]=text.toCharArray();
        int a[]=new int[26];
        for(int i=0;i<s.length;i++)
        {
           a[s[i]-'a']=a[s[i]-'a']+1;
        }
        int c=0;
            while(a[1]>=1 &&a[0]>=1 &&a[11]>=2&&a[13]>=1
            &&a[14]>=2)
            {
                a[1]--;
                a[0]--;
                a[11]-=2;
                a[13]-=1;
                a[14]-=2;
                c++;

            }
            return c;
        
    }
}