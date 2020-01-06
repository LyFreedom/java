package TreadLearning;

/**
 * 创建线程：
 *      第一种方式：1.创建子类继承Tread类,2.重写run()方法,3.创建子类对象,4.调用start()方法
 *      第二种方法：1.实现Runnable接口,2.重写run()方法,3.创建实现类对象,4.创建线程对象,
 *      将实现类对象传给线程对象,5.调用start()方法.同一个任务可传给多个线程执行。
 * 常见方法：
 *      休眠：public static void sleep(long millis)
 *      当前线程主动休眠millis毫秒.
 */
public class TestCreateTread {
    public static void main(String[] args) {
        MyTread myTread = new MyTread();
//        myTread.start();
//        for (int i = 1;i<50;i++){
//            System.out.println("Main:"+i);
//        }
//        System.out.println("程序finish");
        //第二种方式
        //就是个任务Task（输出50次）,独立存在没有意义,传给线程运行。不应该直接调用run方法,而是把任务交给线程运行
        MyRunnable myRunnable = new MyRunnable();
         myRunnable.run();
        Thread thread = new Thread(myRunnable);
        //thread.start();
        Thread thread1 = new Thread(myRunnable);
        thread1.start();
        /*主线程休眠*/
//        System.out.println("start-----");
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("end-----");
    }
}

class MyTread extends Thread{
    @Override
    public void run() {
        for (int i = 1;i<50;i++){
            System.out.println("myThread:"+i);
        }
    }
}

class MyRunnable implements Runnable{

    @Override
    public void run() { //任务
        for (int i = 0; i <50 ; i++) {
            try {
                Thread.sleep(1000); //休眠1秒再执行
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("myRunnable:"+Thread.currentThread().getName()+":"+i);
        }
    }
}