
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
      int l=n*(n+1)/2;
      int ac=0;
      for(int x:nums)
      {
        ac=ac+x;
      }
      return l-ac;
    }
}