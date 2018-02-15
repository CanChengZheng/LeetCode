package no79;

/**
 * @author ZCC
 * @date 2018/2/15
 * @description
 */
public class Solution {
    public boolean exist(char[][] board, String word) {
        if(board.length == 0 || board[0].length == 0) return false;
        boolean[][] flag = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (isExist(board, word, 0, i, j, flag)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isExist(char[][] board, String word, int index, int x, int y, boolean[][] flag) {
        if (index == word.length()) {
            return true;
        }
        // 判断是否越界，是否已经被访问过，是否相等
        if (isNotIndexOut(board, x, y) && !flag[x][y] && board[x][y] == word.charAt(index)) {
            flag[x][y] = true; // 标记为已访问过
            if (isExist(board, word, index + 1, x - 1, y, flag) ||
                    isExist(board, word, index + 1, x + 1, y, flag) ||
                    isExist(board, word, index + 1, x, y - 1, flag) ||
                    isExist(board, word, index + 1, x, y + 1, flag)) {
                return true;
            } else {
                flag[x][y] = false; // 置为未访问状态
                return false;
            }
        } else {
            return false;
        }
    }

    /**
     * 检查是否越界
     *
     * @param board 检查的数组
     * @param x 列
     * @param y 行
     * @return true，不越界；false，越界
     */
    private boolean isNotIndexOut(char[][] board, int x, int y) {
        return x < board.length && y < board[0].length && x >= 0 && y >= 0;
    }
}
