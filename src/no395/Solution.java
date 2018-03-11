package no395;

/**
 * @author ZCC
 * @date 2018/3/11
 * @description
 */
public class Solution {
    public int longestSubstring(String s, int k) {
        if(s.length() < k)return 0;
        int[] times = new int[26];
        for(int i = 0; i < s.length(); i++) {
            times[s.charAt(i) - 97]++;
        }
        int result = findErrorChar(times, k);
        if(result == -1) {
            return s.length();
        }
        String[] subString = s.split((char)(result + 97) + "");
        int maxLength = 0;
        for(String str : subString) {
            maxLength = Math.max(maxLength, longestSubstring(str, k));
        }
        return maxLength;
    }

    private int findErrorChar(int[] times, int k) {
        for(int i = 0 ; i < times.length; i++) {
            if(times[i] != 0 && times[i] < k) {
                return i;
            }
        }
        return -1;
    }
}
