package no4;

/**
 * @author ZCC
 * @date 2018/2/17
 * @description
 */
public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int count = nums1.length + nums2.length;
        if (count % 2 == 0) {
            return (getKth(nums1, nums2, count / 2) + getKth(nums1, nums2, count / 2 + 1)) / 2.0;
        } else {
            return getKth(nums1, nums2, count / 2 + 1);
        }
    }

    private double getKth(int[] nums1, int[] nums2, int k) {
        if (nums1.length > nums2.length) {
            return getKth(nums2, nums1, k);
        }
        if (nums1.length == 0) {
            return nums2[k - 1];
        }
        if (k == 1) {
            return nums1[0] <= nums2[0] ? nums1[0] : nums2[0];
        }
        int s1Index = Math.min(nums1.length, k / 2);
        int s2Index = k - s1Index;
        if (nums1[s1Index - 1] <= nums2[s2Index - 1]) {
            return getKth(subIntArray(nums1, s1Index, nums1.length), nums2, k - s1Index);
        } else {
            return getKth(nums1, subIntArray(nums2, s2Index, nums2.length), k - s2Index);
        }
    }

    private int[] subIntArray(int[] num, int start, int end) {
        int[] array = new int[end - start];
        System.arraycopy(num, start, array, 0, array.length);
        return array;
    }
}
