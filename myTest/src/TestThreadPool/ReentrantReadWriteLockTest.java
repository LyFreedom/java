package TestThreadPool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

/**
 * 读写锁(ReentrantReadWriteLock)：
 *      一种支持一写多读的同步锁,读写分离,可分别分配读锁、写锁.
 *      支持多次分配读锁,使多个读操作可以并发执行。
 * 互斥规则：
 *      写--写：互斥，阻塞
 *      读--写：互斥，读阻塞写、写阻塞读
 *      读--读：不互斥、不阻塞。
 *      在读操作远远高于写操作的环境中，可在保障线程安全的情况下，提高运行效率.
 */
public class ReentrantReadWriteLockTest {
    public static void main(String[] args) {
        Student s = new Student();
        Callable<Object> writeTask = new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                s.setValue(123);
                return null;
            }
        };
        Callable<Object> readTask = new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                s.getValue();
                return null;
            }
        };
        ExecutorService es = Executors.newFixedThreadPool(20);
        //开始时间
        System.out.println(System.currentTimeMillis());
        Long start = System.currentTimeMillis();
        for (int i = 0; i <2 ; i++) {
            es.submit(writeTask);
        }
        for (int i = 0; i <18 ; i++) {
            es.submit(readTask);
        }
        //停止线程池（不再接受新任务）
        es.shutdown();
        while (true){
            System.out.println("是否结束？");
            if (es.isTerminated()){
                break;
            }
        }
        System.out.println(System.currentTimeMillis() - start);
    }
}


class Student{
    /*******互斥锁*********/
    //ReentrantLock lock = new ReentrantLock(); //20283毫秒
    /*******读写锁*********/
    ReentrantReadWriteLock lock = new ReentrantReadWriteLock(); //3063毫秒提升了7倍的效率
    ReadLock r1 = lock.readLock();
    WriteLock w1 = lock.writeLock();
    private Integer value;
    //读
    public Integer getValue() {
        r1.lock();
        try {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return value;
        }finally {
           r1.unlock();
        }

    }
    //写
    public void setValue(Integer value) {
        w1.lock();
        try {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.value = value;
        }finally {
            w1.unlock();
        }

    }
}