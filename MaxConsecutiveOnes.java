
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0,one=0;
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]==1)
        {
            one++;
            if(max<one)
            {
                max=one;
            }
        }
        else{
            one=0;
        }
       }
       return max;
    }
}