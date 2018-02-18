package no338;

/**
 * @author ZCC
 * @date 2018/2/18
 * @description
 */
public class Solution {
    public int[] countBits(int num) {
//        return solution1(num);
        return solution2(num);
    }

    private int[] solution1(int num) {
        int[] count = new int[num + 1];
        for(int i = 1 ; i <= num; i++) {
            int tmp = 0;
            for(int j = 0 ; j < 32; j++) {
                tmp += (num >> j) & 1;
            }
            count[i] = tmp;

        }
        return count;
    }

    private int[] solution2(int num) {
        int[] count = new int[num + 1];
        for(int i = 1; i <= num; i++) {
            count[i] = count[i/2] + ((i & 1) == 1? 1 : 0);
        }
        return count;
    }
}
