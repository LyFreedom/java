package testThreadCollection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Queue接口（队列）：
 *      Collection的子接口，表示队列FIFO(First In First Out)
 * 常用方法：
 *      抛出异常：
 *          boolean add(E e) //顺序添加一个元素(到达上限后,再添加则会抛出异常)
 *          E remove() //获得第一个元素并移除(如果队列没有元素时，则会抛异常)
 *          E element() //获得第一个元素但不移除(如果队列没有元素时,则抛异常)
 *      返回特殊值:推荐使用
 *          boolean offer(E e) //到达上限后，再添加则会返回false
 *          E poll() //获得第一个元素并移除(如果队列没有元素时，则返回null)
 *          E peek() //获得第一个元素但不移除(如果队列没有元素时,则返回null)
 * ConcurrentLinkedQueue(线程安全的queue)：
 *          线程安全、可高效读写的队列,高并发下性能最好的队列。
 *          无锁、CAS比较交换算法，修改的方法包含三个核心参数（V、E、N）
 *          V:要更新的变量、E:预期值、N：新值。
 *          只有当V==E时，V=N；否则表示已被更新过,则取消当前操作。
 * BlockingQueue接口(阻塞队列):
 *          Queue的子接口，阻塞的队列，增加了两个线程状态为无限期等待的方法。
 *          方法：
 *              void put(E e) //将指定元素插入此队列中，如果没有可用空间，则等待。
 *              E take() //获取并移除此队列头部元素，如果没有可用元素，则等待。
 *          可用于解决生产、消费者问题。
 * 阻塞队列：
 *      ArrayBlockingQueue:
 *          数组结构实现，有界队列。(手工固定上限)
 *          BlockingQueue<String> abq = new ArrayBlockingQueue<String>(10);
 *      LinkedBlockingQueue:
 *          链表结构实现,无界队列。（默认上限Integer.MAX_VALUE）
 *          BlockingQueue<String> lbq = new LinkedBlockingQueue<String>();
 */
public class QueueTest {
    public static void main(String[] args) {
        //Queue list = new LinkedList();
        Queue list = new ConcurrentLinkedQueue();
        list.offer("A");
        list.offer("B");
        list.offer("C");
        list.add("D");
        System.out.println(list.poll()); //A
        System.out.println(list.peek()); //B
        System.out.println(list.poll()); //B


    }
}
