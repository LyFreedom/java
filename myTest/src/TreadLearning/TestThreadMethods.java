package TreadLearning;

/**
 * 常见方法：
 *      休眠：sleep（long millis）
 *      放弃：public static void yield()
 *      结合：public final void join()
 */
public class TestThreadMethods {
    public static void main(String[] args) throws Exception{
        Thread thread1 = new Thread(new Task1());
        Thread thread2 = new Thread(new Task2());
        //thread1.start();
        thread2.start();
        for (int i = 0; i < 50 ; i++) {
            System.out.println("main:"+i);
            if(i == 20){
                thread2.join();  //当i=20时,加入线程thread2
            }
        }
    }
}

class Task1 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 5 == 0){
                Thread.yield();//5的倍数主动放弃时间片
            }
            System.out.println("Task1:"+i);
        }
    }
}

class Task2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println("---Task2:"+i);
        }
    }
}