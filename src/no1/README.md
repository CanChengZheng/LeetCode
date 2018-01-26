# 题意

给定一个整数数组，返回包含两个数字索引的数组，这两个索引在数组中加起来的值等于一个给定的目标值。
你可以假想每一次输入都会有唯一确定的答案，同时不能使用同一个索引两次。

# 思路

## 思路1 时间复杂度O(n2)

两层循环遍历数组，将每个值与其他值相加，判断是否等于目标值，如果相等则输出结果。

## 思路2 时间复杂度O(logn) 

使用一个Map存储数据，key为数值，value为对应索引。

1. 一次遍历数组，使用map的`containsKey()`方法检查`key`是否有等于`target - nums[i]`。
   1. 如果有，则使用map的`get()`方法获取到`value`(值对应的索引)。
   2. 如果没有，则使用map的`put`方法将`nums[i] -> i`添加到map中。
2. 时间主要耗费在map的查找和添加，时间复杂度为`logn`