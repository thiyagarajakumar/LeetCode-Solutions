class Solution {
    public String reverseOnlyLetters(String s) {
        char a[]=s.toCharArray();
         int i=0,j=s.length()-1;

        while(i<j)
        {
      
            if((Character.isLetter(a[i]))&&(Character.isLetter(a[j])))
            {
                char c=a[i];
                a[i]=a[j];
                a[j]=c;
                i++;
                j--;
            }
            else if((Character.isLetter(a[i])) &&(!Character.isLetter(a[j])))
            {
                j--;
            }
            else if((!Character.isLetter(a[i])) &&(Character.isLetter(a[j])))
            
            {
                i++;
            }
            else{
                i++;
                j--;
            }
        }
         s="";
    for(i=0;i<a.length;i++){
        s=s+a[i];
    }
    return s;
    }
}