package testThreadCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Collection体系集合下，除Vector以外的线程安全集合
 * Collections中的工具方法:
 *      public static <T> Collection<T> synchronizedCollection(Collection<T> c)
 *      public static <T> List<T> synchronizedList(List<T> list)
 *      public static <T> Set<T> synchronizedSet(Set<T> s)
 *      public static <K,V> Map<K,V> synchronizedMap(Map<K,V> m)
 *      public static <T> SortedSet<T> synchronizedSet(SortedSet<T> s)
 *      public static <K,V> SortedMap<K,V> synchronizedSortedMap(SortedMap<K,V> m)
 * JDK1.2提供,接口统一、维护性高，但性能没有提升，均以synchronized实现
 *
 * CopyOnWriteArrayList:
 *      线程安全的ArrayList,加强版读写分离。
 *      写有锁，读无锁，读写之间不阻塞，优于读写锁。
 *      写入时，先copy一个容器副本，再添加新元素，最后替换引用。
 *      使用方式与ArrayList无异
 *      public class TestCopyOnWriteArrayList{
 *          public static void main(String [] args){
 *              List<String> list = new CopyOnWriteArrayList<String>();
 *          }
 *      }
 */
public class CollectionThread {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<String>(); //原生集合
//        List<String> safeList = Collections.synchronizedList(list);//线程安全的包装结合
//        safeList.add("hello");
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
        list.add("A");
        //接口引用指向实现类对象，更容易解耦和更换实现类
        List<Integer> list1 = new CopyOnWriteArrayList<Integer>();
    }
}
