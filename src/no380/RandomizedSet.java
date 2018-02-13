package no380;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.Set;

/**
 * @author ZCC
 * @date 2018/2/13
 * @description
 */
public class RandomizedSet {
    private HashMap<Integer, Integer> hashMap;
    private LinkedList<Integer> list;
    private Random random;
    /** Initialize your data structure here. */
    public RandomizedSet() {
        hashMap = new HashMap<>();
        list = new LinkedList<>();
        random = new Random();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(hashMap.containsKey(val)) {
            return false;
        } else {
            hashMap.put(val, list.size());
            list.add(val);
            return true;
        }
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!hashMap.containsKey(val)) {
            return false;
        } else {
            int index = hashMap.get(val);
            if(index != list.size() - 1) {
                int tmpVal = list.get(list.size() - 1);
                list.set(index, tmpVal);
                hashMap.put(tmpVal, index);
            }
            list.remove(list.size() - 1);
            hashMap.remove(val);
            return true;
        }
    }

    /** Get a random element from the set. */
    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}
