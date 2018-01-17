package no217;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ZCC
 * @date 2018/1/17
 * @description 利用Set集合的特性，Set集合不允许重复元素
 * 使用Set的add方法，如果返回false，则表示添加失败，存在重复元素，即可返回结果
 */
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(Integer e : nums) {
            if(!set.add(e)) {
                return true;
            }
        }
        return false;
    }
}
