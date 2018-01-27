package no3;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ZCC
 * @date 2018/1/28
 * @description
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
//        return solution1(s);
        return solution2(s);
    }

    private int solution1(String s) {
        int max = 0;
        int start = 0;
        for(int i = 0; i < s.length() ; i++) {
            int isHas = isContainChar(s, start, i, s.charAt(i));
            if(isHas != -1) {
                start = isHas + 1;
            }
            max = max < i - start + 1? i - start + 1:max;
        }
        return max;
    }

    /**
     * 查找是否包含字符c，存在则返回索引，不存在则返回-1
     */
    private int isContainChar(String str, int start, int end, char c) {
        for(int i = start; i < end; i++) {
            if(str.charAt(i) == c) {
                return i;
            }
        }
        return -1;
    }

    private int solution2(String s) {
        int start = 0, i = 0, max = 0;
        Set<Character> set = new HashSet<>();

        while (i < s.length()) {
            if (!set.contains(s.charAt(i))) {
                set.add(s.charAt(i++));
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(start++));
            }
        }

        return max;
    }
}
