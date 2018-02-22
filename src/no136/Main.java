package no136;

/**
 * @author ZCC
 * @date 2018/2/13
 * @description
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] nums = {{1, 2, 1, 2, 3}, {10, 11, 10, 99, 99}};
        int[] target = {3, 11};
        for (int i = 0; i < nums.length; i++) {
            int targetNum = solution.singleNumber(nums[i]);
            System.out.println(String.format("运算结果：%d\t实际结果：%d\t是否正确：%b", targetNum, target[i], targetNum == target[i]));
        }
    }
}
