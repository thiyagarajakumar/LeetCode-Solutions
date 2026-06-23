class Solution {
    public int[] shortestToChar(String s, char c) {
    int n = s.length();
        int a[] = new int[n];

        int k = n;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c)
                k = 0;
            else
                k++;

            a[i] = k;
        }

        k = n;

        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c)
                k = 0;
            else
                k++;
        if(a[i]>k)
        {
            a[i]=k;
        }
         
        }

        return a;
    }        
}