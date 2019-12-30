package com.ly.mapTest;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;
/**
 * Properties:
 *      Hashtable的子类，要求key和value 都是String .通常用于配置文件的读取。
 * TreeMap:
 *      实现了SortedMap接口(是Map的子接口)，可以对key自动排序.
 */
public class TestProperties {
    public static void main(String[] args) {
        Properties properties = new Properties();
        //不要使用put方法，是因为不安全。设计存在瑕疵（继承了一个不该继承的父类（hashtable)）
        properties.setProperty("url","mysql.jdbc");
        System.out.println(properties.getProperty("url"));

        Map<String,String> map = new TreeMap<String, String>();
        map.put("CN","中国");
        map.put("US","美国");
        map.put("KR","韩国");
        map.put("IT","意大利");
        //对map中的key进行排序，按字母顺序,为实现key自动排序，排序对象依旧得实现Comparable<K>接口，
        // 重写compared方法
        for (String str:map.keySet()){
            System.out.println(str); //CN IT KR US
        }
    }
}
