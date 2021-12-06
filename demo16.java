package com.edu.gitLikou;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class demo16 {

    /**
     *
     */
    public static void main(String[] args) {

        /**
         * StrinBuffer
         * @param args
         */
        String  a = "a";
        StringBuffer buffer = new StringBuffer(a);
        buffer.append("b");
        System.out.println(buffer);
        System.out.println(Integer.toString(4));


        String path1 = "13";
        Stack<String> que = new Stack<>();
        List<String> list = new LinkedList<>();

        que.push(new StringBuffer(path1).append(2).toString());

        String path = que.pop();
        list.add(path);

        int sumNode =0;
        for(String b : list) {
            System.out.println(b);
        }

//        StringBuffer buffer = new StringBuffer("2");
//        buffer.append(3).toString();
//        System.out.println(buffer);

    }
}
