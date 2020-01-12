package TestThreadPool;

import java.util.concurrent.*;

/**
 * Callable 接口
 *      public interface Callable<V>{
 *          public V call() throws Exception;
 *      }
 * JDK5加入,与Runnable接口类似,实现之后代表一个线程任务.
 * Callable具有泛型返回值、可以申明异常.
 * Future接口
 *      概念：异步接收ExecutorService.submit()所返回的状态结果,当中包含了call()的返回值。
 *      方法：V get()以阻塞形式等待Future中的异步处理结果（call()的返回值）
 * 线程的同步：
 *      形容一次方法调用，同步一旦开启，调用者必须等待该方法返回，才能继续。
 * 异步：
 *      形容一次方法调用，异步一旦开始，像是一次消息传递，调用者告知之后立刻返回。二者竞争时间片，
 *      并发执行
 *      注：多条执行路径。
 */
public class CallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Callable<Integer> task = new MyTask1();
        Callable<Integer> task1 = new MyTask2();
        //executorService.submit(task);
        Future<Integer> f1 = executorService.submit(task);
        Integer rs1 = f1.get();
        //executorService.submit(task1);
        Future<Integer> f2 = executorService.submit(task1);
        Integer rs2 = f2.get();
        System.out.println(rs1 + rs2);
        executorService.shutdown();//停止空闲线程
    }
}

class MyTask1 implements Callable<Integer>{
    @Override
    public Integer call() throws Exception {
        Thread.sleep(5000);
        Integer sum = 0;
        for (int i = 0; i <= 50 ; i++) {
           // System.out.println(Thread.currentThread().getName()+":"+i);
            sum+=i;
        }
        System.out.println(Thread.currentThread().getName()+":"+sum);
        return sum;
    }
}

class MyTask2 implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        Integer sum = 0;
        for (int i = 51; i <=100 ; i++) {
            sum+=i;
        }
        System.out.println(Thread.currentThread().getName()+":"+sum);
        return sum;
    }
}