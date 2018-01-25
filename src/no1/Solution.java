package no1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ZCC
 * @date 2018/1/25
 * @description
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
//        return solution1(nums, target);
        return solution2(nums, target);
    }

    private int[] solution1(int[] nums, int target) {
        int[] indices = new int[2];
        int length = nums.length;
        for(int i = 0; i < length - 1; i++) {
            for(int j = i + 1; j < length; j++) {
                if(nums[i] + nums[j] == target) {
                    indices[0] = i;
                    indices[1] = j;
                    return indices;
                }
            }
        }
        return indices;
    }

    private int[] solution2(int[] nums, int target) {
        int[] indices = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                indices[0] = map.get(target - nums[i]);
                indices[1] = i;
                return indices;
            }
            map.put(nums[i], i);
        }
        System.out.println("找不到");
        return indices;
    }
}
