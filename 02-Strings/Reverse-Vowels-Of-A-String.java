class Solution {
    public String reverseVowels(String s) {
		int i=0,j=s.length()-1;
        char a[]=s.toCharArray();
		while(i<j)
		{
		    if((a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'||a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U')&&(a[j]!='a'&& a[j]!='e'&&a[j]!='i'&&a[j]!='o'&&a[j]!='u'&&a[j]!='A'&&a[j]!='E'&&a[j]!='I'&&a[j]!='O'&&a[j]!='U'))
		    {
		        j--;
		    }
		    else if((a[j]=='a'||a[j]=='e'||a[j]=='i'||a[j]=='o'||a[j]=='u'||a[j]=='A'||a[j]=='E'||a[j]=='I'||a[j]=='O'||a[j]=='U')&&(a[i]!='a'&&a[i]!='e'&&a[i]!='i'&&a[i]!='o'&&a[i]!='u'&&a[i]!='A'&&a[i]!='E'&&a[i]!='I'&&a[i]!='O'&&a[i]!='U'))
		    {
		        i++;
		    }
            else if ((a[i] != 'a' && a[i] != 'e' && a[i] != 'i' && a[i] != 'o' && a[i] != 'u' &&
                      a[i] != 'A' && a[i] != 'E' && a[i] != 'I' && a[i] != 'O' && a[i] != 'U')
                     &&
                     (a[j] != 'a' && a[j] != 'e' && a[j] != 'i' && a[j] != 'o' && a[j] != 'u' &&
                      a[j] != 'A' && a[j] != 'E' && a[j] != 'I' && a[j] != 'O' && a[j] != 'U')) {
                i++;
                j--;
            }
		    else{
		        char t=a[i];
		        a[i]=a[j];
		        a[j]=t;
		        
		        i++;
		        j--;
		    }
		}
            s=String.valueOf(a);
            return s;
	}
}

