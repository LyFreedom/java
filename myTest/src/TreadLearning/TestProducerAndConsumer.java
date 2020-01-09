package TreadLearning;

import java.util.ArrayList;
import java.util.List;

public class TestProducerAndConsumer {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
//        myQueue.offer("A");
//        myQueue.offer("B");
//        myQueue.offer("C");
//        myQueue.offer("D");
//        myQueue.offer("E");
       // System.out.println(myQueue.poll());
        Producer1 producer = new Producer1(myQueue);
        producer.start();
//        Producer2 producer2 = new Producer2(myQueue);
//        producer2.start();
        Consumer consumer = new Consumer(myQueue);
        consumer.start();
        System.out.println("以下是遍历内容");
        myQueue.show();
    }
}

class Consumer extends Thread{
    MyQueue myQueue;

    public Consumer(MyQueue myQueue) {
        this.myQueue = myQueue;
    }

    @Override
    public void run() {
        for (int i = 0;i <= 4;i++){
            System.out.println(myQueue.poll() + "被移除");
        }
    }
}

class Producer1 extends Thread{
    MyQueue myQueue;
    public Producer1(MyQueue myQueue){
        this.myQueue=myQueue;
    }

    @Override
    public void run() {
        System.out.println("Producer1启动");
        for (char ch = 'A';ch <= 'E';ch++){
            myQueue.offer(ch);
        }
        System.out.println("Producer1结束");
    }
}

class Producer2 extends Thread{
    MyQueue myQueue;
    public Producer2(MyQueue myQueue){
        this.myQueue=myQueue;
    }

    @Override
    public void run() {
        System.out.println("Producer2启动");
        for (char ch = 'F';ch <= 'J';ch++){
            myQueue.offer(ch);
        }
        System.out.println("Producer2结束");
    }
}

//我的队列
class MyQueue{
    private List values = new ArrayList();
    private int size=4;
    //存入队列
    public synchronized void offer(Object o){
        while (values.size() == size){
            //进来线程，停下
            try {
                this.wait();
                //被唤醒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notifyAll();
        System.out.println(Thread.currentThread().getName()+"存入第"+(values.size()+1)+"个元素");
        values.add(o);
    }
    //从队列取出
    public synchronized Object poll(){
        while (values.size() == 0){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notifyAll();//唤醒因myQueue对象而进入无限期等待的线程对象（全部）
        return values.remove(0);
    }

    public void show(){
        for (Object obj:values) {
            System.out.println(obj);
        }
    }
}