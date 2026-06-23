class Solution {
    public String reverseWords(String s) {
        String se[] = s.split(" ");

        int i = 0;
        int j = se.length - 1;

        while(i < j)
        {
            String c = se[i];
            se[i] = se[j];
            se[j] = c;

            i++;
            j--;
        }

        String see = "";

        for(i = 0; i < se.length; i++)
        {
            if(se[i].equals(""))
            {
                continue;
            }

            see = see + se[i] + " ";
        }

        return see.trim();
    }
}