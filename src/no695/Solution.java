package no695;

/**
 * @author ZCC
 * @date 2018/1/19
 * @description
 */
public class Solution {
    private int[] direction = {0,1,2,3}; // 上右下左

    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1) {
                    max = Math.max(calArea(grid, i, j, direction[3]), max);
                }
            }
        }
        return max;
    }

    private int calArea(int[][] grid, int i , int j, int direct) {
        if(i >= grid.length || j >= grid[0].length || i < 0 || j < 0 ||
                grid[i][j] == 0 || grid[i][j] == 2) { // 如果越界或者为海洋或者为已经搜索过则返回0
            return 0;
        }
        grid[i][j] = 2;
        int area = 1;
        int tempD = direct;
        while((tempD = (tempD + 1)%4) != direct) {
            switch(tempD) {
                case 0:
                    area += calArea(grid, i - 1, j, direction[2]);
                    break;
                case 1:
                    area += calArea(grid, i, j + 1, direction[3]);
                    break;
                case 2:
                    area += calArea(grid, i + 1, j, direction[0]);
                    break;
                case 3:
                    area += calArea(grid, i, j - 1, direction[1]);
                    break;
                default:break;
            }
        }
        return area;
    }
}
