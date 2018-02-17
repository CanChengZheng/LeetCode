package no4;

/**
 * @author ZCC
 * @date 2018/1/29
 * @description
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] nums1 = {{1,3}, {1, 2}};
        int[][] nums2 = {{2}, {3, 4}};
        double[] target = {2.0, 2.5};
        for(int i = 0 ; i < nums1.length; i++) {
            double tar = solution.findMedianSortedArrays(nums1[i], nums2[i]);
            System.out.println(String.format("result：%f\ttarget：%f\t是否正确：%b", tar, target[i], tar == target[i]));
        }
    }
}
