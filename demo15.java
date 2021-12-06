package com.edu.gitLikou;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class demo15 {
    public static void main(String[] args) {
        /**
         * 这里我们来通过代码学习一下三个问题：
         * 1、 Deque<Integer> path = new LinkedList<Integer>();
         *
         * 2、List<Integer> queue = new LinkedList<Integer>(path);和List<Integer> queue = new LinkedList<Integer>(); + queue.add(path)有什么不同
         *
         */

        //双队列 addFirst()\OfferFirst()   addLast()\OfferLast()   removeFirst()\pollFirst()   getFirst()\peekFirst()  后边这两个First也都可以用Last
        Deque<Integer> deque = new LinkedList<Integer>();
//        deque.add(1);
//        deque.add(2);
//        deque.add(3);
//        System.out.println(deque); //[1, 2, 3]

//        deque.addFirst(1);
//        deque.addFirst(2);
//        deque.addFirst(3);
//        System.out.println(deque); //[3, 2, 1]

//        deque.add(1);
//        deque.add(2);
//        deque.add(3);
//        System.out.println(deque);
//        Integer result = deque.pollLast();
//        System.out.println(result);

        //综上，不管是list、linkedlist还是queue、还是deque，添加元素都是从左边，如果继续添加元素，原来的元素不动，继续往后添加。即[first<-,->last]

        //单队列  add()\offer()添加元素    poll()\remove()删除第一个元素    element()\peek()查找元素
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        System.out.println(queue);
//        Integer a = queue.poll();
//        System.out.println(a);

        //问题三
//        deque.add(1);
//        deque.add(2);
//        deque.add(3);
//        System.out.println(deque); //[1, 2, 3]
//        List<Integer> queue = new LinkedList<Integer>(deque);
//        System.out.println(queue);
//
//        List<Integer> queue1 = new LinkedList<Integer>(); // 看源码之后，才发现new LinkedList<Integer>(deque)里边直接调用了addAll(c)方法
//        queue1.addAll(deque);
//        queue1.addAll(0,deque);
//        System.out.println(queue1);


    }
}
