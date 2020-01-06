package com.ly.mapTest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * HashMap:
 *      JDK1.2版本，线程不安全，运行效率快；允许用null值作为key或是value.
 * Hashtable:
 *      JDK1.0版本,线程安全,运行效率慢;不允许null作为key或是value.
 * Properties:
 *
 */
public class HashMapApply {
    public static void main(String[] args) {
        //存几个国家
        Map<String,String> countries = new HashMap<String, String>();
        countries.put("CN","中国");
        countries.put("US","美国");
        countries.put("KR","韩国");
        countries.put("IT","意大利");
       // countries.put(null,"朝鲜"); //允许null值
        String s = countries.get("CN");
        System.out.println(s);
       // System.out.println(countries.get(null));
        //存电话号码
//        Map<Integer,String> phones = new HashMap<Integer, String>();
//        phones.put(110,"报警");
//        phones.put(120,"救护车");
//        phones.put(114,"查号");
//        System.out.println(phones.get(114));
        //Map的遍历
        //所有键
        Set<String> set =  countries.keySet(); //Map中的key是不可重复的
        for (String k :set){
            System.out.println(k);
        }
        //所有值
        Collection<String> values = countries.values(); //值是可重复的、无序的
        for (String v :values){
            System.out.println(v);
        }
        //所有值+键(重点)
        Set<Map.Entry<String,String>> entries = countries.entrySet();
        for (Map.Entry<String,String> entry : entries){
            System.out.println(entry); //KR=韩国 CN=中国 IT=意大利 US=美国
            //KR 韩国 CN 中国 IT 意大利 US 美国
            //System.out.println(entry.getKey()+"\t"+entry.getValue());
        }
    }
}
