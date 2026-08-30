import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l = nums1.length;
        int l1 = nums2.length;
        int len = l1 + l;

        int a[] = new int[len];

        for (int i = 0; i < nums1.length; i++) {
            a[i] = nums1[i];
        }

        int j = 0;
        for (int i = nums1.length; i < a.length; i++) {
            a[i] = nums2[j];
            j++;
        }

        Arrays.sort(a);

        int c = 0, c1 = 0;
        double t = 0;

        if (a.length % 2 != 0) { 
            c = a.length / 2;
            t = a[c];
        } else { 
            c = a.length / 2;
            c1 = c - 1;
            t = (a[c] + a[c1]) / 2.0;
        }

        return t;
    }
}