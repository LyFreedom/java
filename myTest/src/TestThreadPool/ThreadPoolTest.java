package TestThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {
    public static void main(String[] args) {
        //线程池（引用）--->Executors(工厂类)
        ExecutorService es = Executors.newFixedThreadPool(3);
        MyTask myTask = new MyTask();
        //两种方法提交任务
        es.submit(myTask);
        es.execute(myTask);
    }
}

class MyTask implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName()+"myTask:"+i);
        }
    }
}