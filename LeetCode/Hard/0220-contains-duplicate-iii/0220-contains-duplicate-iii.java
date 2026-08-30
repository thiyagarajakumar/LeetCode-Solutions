class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
         TreeSet<Long> set = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {

            Long value = set.ceiling((long) nums[i] - valueDiff);

            if (value != null && value <= (long) nums[i] + valueDiff) {
                return true;
            }

            set.add((long) nums[i]);

            if (i >= indexDiff) {
                set.remove((long) nums[i - indexDiff]);
            }
        }

        return false;
    }
}