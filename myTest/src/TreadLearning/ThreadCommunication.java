package TreadLearning;

/**
 * 线程通信：
 *    等待：
 *      public final void wait()
 *      public final void wait(long timeout)
 *      必须在对obj加锁的同步代码中。在一个线程中，调用obj.wait()时,此线程会释放其拥有的所有锁标记。
 *      同时此线程因obj处在无限期等待的状态中。释放锁，进入等待队列。
 *    通知：
 *      public final void notify()
 *      public final void notifyAll()
 *      必须在对obj加锁的同步代码中。从obj的Waiting中释放一个或全部线程。对自身没有任何影响。
 */
public class ThreadCommunication {
    public static void main(String[] args) {
        Object obj = new Object();
        MyThread myThread = new MyThread(obj);
        MyThread myThread1 = new MyThread(obj);
        myThread.start();
        myThread1.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (obj){
            System.out.println("main进入同步代码块");
            //obj.notify();//从那些因为obj对象而进入到无限期等待的线程中，营救一个出来。
            obj.notifyAll();//全救出来
            System.out.println("main退出同步代码块");
        }
    }
}


class MyThread extends Thread{
    Object object;

    public MyThread(Object object) {
        this.object = object;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程启动");
        synchronized (object){
            System.out.println(Thread.currentThread().getName()+"进入同步代码块");
            try {
                object.wait(); //释放锁标记、无限期等待
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"退出同步代码块");
        }
        System.out.println(Thread.currentThread().getName()+"线程结束");
    }
}