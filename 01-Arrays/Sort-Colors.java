class Solution {
    public void sortColors(int[] nums) {
        int red=0;
        int white=1;
        int blue=2;
        int n=nums.length;
        int k=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(red==nums[i])
            {
                a[k]=red;
                k++;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(white==nums[i])
            {
                a[k]=white;
                k++;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(blue==nums[i])
            {
                a[k]=blue;
                k++;
            }
        }
        for(int i=0;i<n;i++)
        {
            nums[i]=a[i];
        }
    }
}