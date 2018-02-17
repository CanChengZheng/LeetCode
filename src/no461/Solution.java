package no461;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;

/**
 * @author ZCC
 * @date 2018/2/17
 * @description
 */
public class Solution {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int count = 0;
        do{
            count += xor & 1;
            xor = xor >> 1;
        } while(xor != 0);
        return count;
    }
}
