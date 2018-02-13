# 题意

设计一种数据结构支持以下操作，并且时间复杂度都为`O(1)`。


`insert(val)`: 如果`val`在这个数据结构中不存在，将`val`插入到这个数据结构中。
`remove(val)`: 如果`val`在这个数据结构中存在，将`val`这个数据结构中删除。
`getRandom`: 从这个数据结构中返回任意一个元素。每一个元素必须有相同的概率。

## 案例

```
// Init an empty set.
RandomizedSet randomSet = new RandomizedSet();

// Inserts 1 to the set. Returns true as 1 was inserted successfully.
randomSet.insert(1);

// Returns false as 2 does not exist in the set.
randomSet.remove(2);

// Inserts 2 to the set, returns true. Set now contains [1,2].
randomSet.insert(2);

// getRandom should return either 1 or 2 randomly.
randomSet.getRandom();

// Removes 1 from the set, returns true. Set now contains [2].
randomSet.remove(1);

// 2 was already in the set, so return false.
randomSet.insert(2);

// Since 2 is the only number in the set, getRandom always return 2.
randomSet.getRandom();
```

# 思路

根据题目的要求，所有的操作的时间复杂度都必须是`O(1)`。   
`HashMap`可以实现**插入删除**的操作`O(1)`，但随机存取无法做到`O(1)`。而使用`ArrayList`可以实现**随机存取**时间复杂度为`O(1)`。   
单独使用某种数据结构无法满足题目要求，那么可以考虑将`HashMap`和`ArrayList`进行结合使用。   
在HashMap中，`<Key, Value>`，`key`表示的是插入的值本身，`Value`表示插入的值保存在List中的索引。

1. 插入操作：调用`list`的`add()`方法，直接添加到`list`的末尾，在`hashMap`中保存为`put(val, list.size() - 1)`
2. 删除操作：
   1. 首先获得要删除元素`val`在list中的索引`index`
   2. 判断`index`是不是在`list`中的最后一个`if(index != list.size() - 1)`，如果不是最后一个，执行步骤3，否则直接执行步骤4
   3. 先将`list`中最后一个索引的值覆盖到`index`上，并修改`hashMap`中对应值的索引
   4. 删除`list`中最后一个值，删除`hashMap`中对应的值
3. 获取随机值：首先获取`0 ~ list.size()`(不包括list.size())的随机数，然后使用`list.get(index)`方法进行获取即可



