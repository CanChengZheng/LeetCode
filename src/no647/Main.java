package no647;

/**
 * @author ZCC
 * @date 2018/2/13
 * @description
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] str = {"abc", "aaa"};
        int[] target = {3, 6};
        for (int i = 0; i < str.length; i++) {
            int targetNum = solution.countSubstrings(str[i]);
            System.out.println(String.format("运算结果：%d\t实际结果：%d\t是否正确：%b", targetNum, target[i], targetNum == target[i]));
        }
    }
}
