# 题意

在给定的数组中，查找这个数组中是否存在重复的数值。
实现方法，如果任何数值出现至少两次则返回`true`，如果每个数值都是独一无二的则返回`false`。

# 思路

1. 利用Set集合的特性，Set集合不允许重复元素
2. 使用Set的add方法，如果返回false，则表示添加失败，存在重复元素，即可返回结果
