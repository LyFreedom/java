package TestThreadPool;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Lock接口
 *      JDK5加入，与synchronized比较，显示定义，结构更灵活。
 *      提供更多实用性方法，功能更强大、性能更优越。
 *      常用方法：
 *          void lock() //获取锁，如锁被占用，则等待.
 *          boolean tryLock(） //尝试获取锁（成功返回true，失败返回false,不阻塞）
 *          void unlock() //释放锁
 * 重入锁：
 *      ReentrantLock:Lock接口的实现类，与synchronized一样具有互斥锁功能。
 *      1,创建重入锁
 *      2,显示开启锁
 *      3,显示释放锁（考虑可能出现异常,释放锁必须放入finally代码块中,避免无法释放）
 *
 */
public class LockTest {
    public static void main(String[] args) {
        MyThreads myThreads = new MyThreads();
        Thread thread = new Thread(myThreads,"窗口1");
        Thread thread1 = new Thread(myThreads,"窗口2");
        Thread thread2 = new Thread(myThreads,"窗口3");
        Thread thread3 = new Thread(myThreads,"窗口4");
        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class MyThreads implements Runnable{
    //定义火车票
    private Integer tickets = 200;
    //定义锁对象
    private Lock lock = new ReentrantLock();

    @Override
    public void run() {
        try {
            //加锁
            lock.lock();
            /*********业务处理**********/
            if(tickets > 0){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+":正在出售第"+(tickets--)+"张票");
            }else {
                System.out.println("已售完。。。。。。");
            }
        }finally {
            //释放锁
            lock.unlock();
        }

    }
}