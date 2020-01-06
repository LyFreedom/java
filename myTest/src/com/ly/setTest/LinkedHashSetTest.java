package com.ly.setTest;

import java.util.LinkedHashSet;

/**
 * LinkedHashSet:
 *      链表实现的HashSet，按照链表进行存储，即可以保留元素的插入顺序。
 */
public class LinkedHashSetTest {
    public static void main(String[] args) {
        LinkedHashSet set = new LinkedHashSet();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("E");
        set.add("D");
        for (Object obj:set) {
            System.out.println(obj);  //按照插入顺序展示结果
        }
    }
}
