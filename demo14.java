package com.edu.gitLikou;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class demo14 {
    /**
     * 下面通过编程来理解java的几个容器
     * List、LinkedList、ArrayList
     */
    public static void main(String[] args) {
        // 这个比较好理解，形式是：类名 对象名 = new 类名
        // 这种创建出来的对象可以调用所有的方法
        LinkedList<Integer> output = new LinkedList<Integer>();
//        output.addFirst(1);
//        output.addFirst(2);
//        output.addFirst(3);
//        System.out.println(output); //[3, 2, 1]

//        output.add(1);
//        output.add(2);
//        output.add(3);
//        System.out.println(output); //[1, 2, 3]

//        output.addLast(1);
//        output.addLast(2);
//        output.addLast(3);
//        System.out.println(output); //[1, 2, 3]

        //这个有些人可能不太容易理解，形式是：接口 对象名 = new 类名
        // 这种实例化出来的对象，只能调用接口中有的方法，不能调用类中特有的方法
        List<Integer> res = new ArrayList<>();
//        res.add(1);
//        res.add(2);
//        res.add(3);
//        System.out.println(res); //[1, 2, 3]

//        res.add(0,1);
//        res.add(0,2);
//        res.add(0,3);
//        System.out.println(res); //[3, 2, 1]

        // 这里需要注意一点：可以指定index添加位置是不能打乱的，必须从0开始添加，而且如果只添加三个元素，index从0开始只能到2，否则就会报错
//        res.add(1,3);
//        res.add(0,1);
//        res.add(2,2);
//        System.out.println(res); //[3, 1, 2]

    }
}
