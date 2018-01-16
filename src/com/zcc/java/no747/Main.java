package com.zcc.java.no747;

/**
 * @author ZCC
 * @date 2018/1/16
 * @description
 */
public class Main {
    public static void main(String[] args) {
        int[][] nums = {{3, 6, 1, 0}, {1, 2, 3, 4}, {0, 0, 0, 1}};
        Solution solution = new Solution();
        for(int[] array : nums) {
            System.out.println(solution.dominantIndex(array));
        }
    }
}
