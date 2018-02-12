package no93;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ZCC
 * @date 2018/1/21
 * @description
 */
public class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> list = new ArrayList<>();
        genIpAddress(list, s, 0, "");
        return list;
    }
    // list 结果集，s 原字符串，start 下一个节点的起始索引，已经生成的字符串IPAdress
    private void genIpAddress(List<String> list, String s, int start, String str) {
        if(start == s.length()) {
            if(findDotNum(str) == 4) {
                list.add(str.substring(0, str.length() - 1));
            }
            return;
        }
        if(findDotNum(str) >= 4) { // 字符串还未结束，已经有四个点，不符合要求
            return;
        }
        // 用于保存当前节点的值
        StringBuilder tmp = new StringBuilder();
        for(int i = 0; i < 3; i++) {
            int targetIndex = start + i;
            // 判断是否越界
            if(targetIndex >= s.length()) {
                return;
            }
            tmp.append(s.charAt(targetIndex));
            // 判断首个字符是否是0，如果是0则跳过后续的二三位的情况
            if(i == 0 && Integer.valueOf(tmp.toString()) == 0) {
                genIpAddress(list, s, targetIndex + 1, str + tmp + ".");
                break;
            } else if(Integer.valueOf(tmp.toString()) <= 255) { // 判断节点数值是否超过上限255
                genIpAddress(list, s, targetIndex + 1, str + tmp + ".");
            } else {
                return;
            }

        }
    }

    // 查找字符串中点的个数
    private int findDotNum(String str) {
        int num = 0;
        for(int i = 0; i < str.length(); i++) {
            if('.' == str.charAt(i)) {
                num++;
            }
        }
        return num;
    }
}
