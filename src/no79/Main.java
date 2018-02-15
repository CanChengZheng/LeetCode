package no79;

/**
 * @author ZCC
 * @date 2018/2/15
 * @description
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        char[][][] board = {
                {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}},
                {{'a', 'a'}},
                {{'A', 'B', 'C', 'E'}, {'S', 'F', 'E', 'S'}, {'A', 'D', 'E', 'E'}}
        };
        String[] word = {"ABCCED", "aaa", "ABCESEEEFS"};
        boolean[] target = {true, false, true};
        for (int i = 0; i < board.length; i++) {
            System.out.println(String.format("target：%b  匹配结果：%b", target[i], solution.exist(board[i], word[i])));
        }
    }
}
