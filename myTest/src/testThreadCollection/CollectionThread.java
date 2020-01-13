package testThreadCollection;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

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
 * CopyOnWriteArraySet:
 *      线程安全的Set，底层使用CopyOnWriteArrayList实现
 *      唯一不同在于,使用addIfAbsent()添加元素，会遍历数组
 *      如存在元素，则不添加（扔掉副本）。
 *      public class TestCopyOnWriteArrayList{
 *          public static void main(String [] args){
 *              List<String> list = new CopyOnWriteArrayList<String>();
 *          }
 *      }
 * ConcurrentHashMap:
 *      初始容量默认为16段(Segment),使用分段锁设计。
 *      不对整个Map加锁，而是为每个Segment加锁。
 *      当多个对象存入同一个Segment时,才需要互斥。
 *      最理想状态为16个对象分别存入16个Segment,并行数量16.
 *      使用方式与HashMap无异。
 *      public class TestConcurrentHashMap{
 *          public static void main(String[] args){
 *              Map<String,String> map = new ConcurrentHashMap<String,String>();
 *          }
 *      }
 * 总结：
 *      ExecutorService线程池接口、Executors工厂
 *      Callable线程任务、Future异步返回值
 *      Lock、ReentrantLock重入锁、ReentrantReadWrite读写锁
 *      CopyOnWriteArrayList线程安全的ArrayList
 *      CopyOnWriteArraySet线程安全的Set
 *      ConcurrentHashMap线程安全的HashMap
 *      ConcurrentLinkedQueue线程安全的Queue
 *      ArrayBlockingQueue线程安全的阻塞Queue.（生产者、消费者）
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
        Set<String> set = new CopyOnWriteArraySet<String>();
        set.add("A");
        Map<String,String> map = new ConcurrentHashMap<String, String>();
        ConcurrentHashMap<Integer,Integer> map1 = new ConcurrentHashMap<Integer, Integer>();
        map1.put(1,123);
        map.put("a","hello");
    }
}
