package no338;

import java.util.Arrays;

/**
 * @author ZCC
 * @date 2018/2/18
 * @description
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {5};
        int[][] target = {{0,1,1,2,1,2}};

        for(int i = 0 ; i < nums.length; i++) {
            int[] result = solution.countBits(nums[i]);
            boolean flag = true;
            for(int j = 0 ; j < target[i].length; j++) {
                if(target[i][j] != result[j]) {
                   flag = false;
                }
            }
            System.out.println(String.format("result：%s\ttarget：%s\t是否正确：%b", Arrays.toString(target[i]), Arrays.toString(result), flag));
        }
    }
}
