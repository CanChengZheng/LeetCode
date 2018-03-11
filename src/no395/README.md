# 题意

给一个字符串和一个K，现在要找到一个子串，这个子串里面的每个出现的字符都至少出现K次，返回子串的长度。

## 举例 1:

```
输入:
s = "aaabb", k = 3

输出:
3

最长的子串是 "aaa", 因为'a'重复3次.
```

## 举例 2:

```
输入:
s = "ababbc", k = 2

输出:
5

最长的子串是"ababb", 因为'a'重复2次，'b'重复3次.
```

# 思路

- 在此题目中，如果用暴力解决的方法，当遇到极端情况，可能会因为超时而无法通过。因为应该考虑使用**分治法**来解决该问题。

## 算法基本原理

1. 先遍历整个string，并记录每个不同的character的出现次数。
1. 如果所有character出现次数都不小于k，那么说明整个string就是满足条件的longest substring，返回原string的长度即可；
2. 如果有character的出现次数小于k，假设这个character是c，因为满足条件的substring永远不会包含c，所以满足条件的substring一定是在以c为分割参考下的某个substring中。
3. 所以我们需要做的就是把c当做是split的参考，在得到的String[]中再次调用我们的method，找到最大的返回值即可。

## 参考文献

>[ Longest Substring with At Least K Repeating Characters](http://blog.csdn.net/u013325815/article/details/52502191)