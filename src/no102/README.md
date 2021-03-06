# 题意

提供一个二叉树，返回顺序层次遍历二叉树结点的值。（顺序，从左到右，从上到下）

举例：   
提供二叉树`[3,9,20,null,null,15,7]`，可视化二叉树结构如下：
```
    3
   / \
  9  20
    /  \
   15   7
```
那么它应返回的层次顺序遍历的结果是：
```
[
  [3],
  [9,20],
  [15,7]
]
```

# 思路

题目要求我们把二叉树按照从上到下的层次，层次中以从左到右的顺序，对二叉树进行遍历，并输出结果。

## 思路1

使用**广度优先遍历**算法来来实现题目要求。具体数据结构是使用**队列**来进行实现。   
每次循环开始的时候，队列中都是该层从左到右的节点。在将节点的值加入`list`的同时，检查节点是否存在左右儿子。若存在，则加入队尾。等下一个循环进行访问。

## 思路2

使用**深度优先遍历**算法来实现。
在递归遍历的过程中，有一个形参用于标记当前的层次。遍历节点并加入对应的层次的`list`中。