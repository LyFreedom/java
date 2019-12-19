package com.ly.listTest;

import java.util.LinkedList;

/**
 * LinkedList:
 *      链表结构实现，增删快，查询慢.
 *      链表可以不是空间连续的，只有前后二者关联，和空间位置无关
 *      LinkedList无需开辟连续空间，查询慢，增删快
 */
public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("A");
        list.add("B");
        list.addFirst("D");
        list.add(2,"C");
        list.addLast("E");
        for (Object arr:list) {
            System.out.println(arr); //D A C B E
        }
    }
}
