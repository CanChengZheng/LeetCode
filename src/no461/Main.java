package no461;

/**
 * @author ZCC
 * @date 2018/2/13
 * @description
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] x = {1};
        int[] y = {4};
        int[] target = {2};
        for (int i = 0; i < x.length; i++) {
            int targetNum = solution.hammingDistance(x[i], y[i]);
            System.out.println(String.format("运算结果：%d\t实际结果：%d\t是否正确：%b", targetNum, target[i], targetNum == target[i]));
        }
    }
}
