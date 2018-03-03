package no322;

/**
 * @author ZCC
 * @date 2018/2/25
 * @description
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] nums1 = {{1, 2, 5}, {2}, {1, 3, 5, 6}, {186,419,83,408}};
        int[] nums2 = {11, 3, 11, 6249};
        int[] target = {3, -1, 2, 20};
        for(int i = 0 ; i < nums1.length; i++) {
            int tar = solution.coinChange(nums1[i], nums2[i]);
            System.out.println(String.format("result：%d\ttarget：%d\t是否正确：%b", tar, target[i], tar == target[i]));
        }
    }
}
