package com.ly.mapTest;

import java.util.HashMap;

/**
 * Map接口的特点：
 *      1,用于存储任意键值对（Key-Value）
 *      2,键：无序、无下标、不允许重复(唯一)
 *      3,值：无序、无下标、允许重复
 * 方法：
 *      可参考API文档
 *      V put(K key,V value) //将对象存入到集合中，关联键值。key重复则覆盖原值。
 *      Object get(Object key) //根据键获取对应的值
 *      Set<K> keySet()  //返回所有key。
 *      Collection<V> values() //返回包含所有值的Collection集合
 *      Set<Map.Entry<K,V>> //键值匹配的Set集合
 * Map集合的实现类：
 *      HashMap[重点]
 *      Hashtable
 */
public class MapTest1 {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<Integer, String>();
        map.put(1,"hello");
        map.put(2,"world");
        //map.remove(1); //移除
        System.out.println(map.get(1)); //hello
    }
}
