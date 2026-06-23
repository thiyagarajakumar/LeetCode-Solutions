import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int c=Math.min(n1,n2);
        int a[]=new int[c];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int k=0;
        int i=0,j=0;
        while(i<n1 &&j<n2)
        {
            if(nums1[i]==nums2[j]&& nums1[i]!=-1||nums2[i]!=-1)
            { 
                      
             nums2[j]=-1;
              j++;
              if(j==n2-1){
              a[k]=nums1[i];
              k++;}

            }
            else if(nums1[i]<nums2[j]){
                i++;
                j=0;
            }
            else{
                i++;
            }

        }


int arr[]= new int[k];
  for(int l=0;l<k;l++)
  {
    arr[l]=a[l];
  }
return arr;
    }}






















