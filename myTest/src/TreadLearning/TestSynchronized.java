package TreadLearning;

/**
 * 线程安全：
 *      同步方式：同步代码块：
 *          synchronized(临界资源对象){//对临界资源对象加锁
 *              //代码(原子操作)
 *          }
 *      注：每个对象都有一个互斥锁标记，用来分配给线程的。如果锁标记已被某个线程使用，
 *      不能被其他线程使用
 *         只有拥有对象互斥锁标记的线程，才能进入对该对象加锁的同步代码块。
 *         线程退出同步代码块时，会释放相应的互斥锁标记。
 * 线程状态，线程可以处于下列状态之一：
 * NEW 至今尚未启动的线程处于这种状态
 * RUNNABLE 正在java虚拟机中执行的线程处于这种状态
 * BLOCKED  受阻塞并等待某个监视器锁的线程处于这种状态。
 * WAITING  无限期地等待另一个线程来执行某一特定操作的线程处于这种状态
 * TERMINATED 已退出的线程处于这种状态
 *
 * 在给定时间点上，一个线程只能处于一种状态。这些状态是虚拟机状态，他们并没有反映所有操作系统线程状态。
 */
public class TestSynchronized {
    public static void main(String[] args) {
        //按照该卡号进行了开户，并存入了2000元
        Account account = new Account("1001","123456",2000D);

        //Husband
        Husband husband = new Husband(account);
        //husband.getAcc().withdrawal("1001","123456",500D);
        Thread thread = new Thread(husband);
        thread.start();
        //Wife
        Wife wife = new Wife(account);
        Thread thread1 = new Thread(wife);
        thread1.start();
        //wife.getAcc().withdrawal("1001","123456",500D);
    }
}
//银行账户
class Account{
    private String cardNo;
    private String password;
    private Double balance;

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    //构造方法

    public Account(String cardNo, String password, double balance) {
        this.cardNo = cardNo;
        this.password = password;
        this.balance = balance;
    }

    //取款
    public void withdrawal(String no,String pwd,double money){
        //也可以加在方法内
        synchronized (this){ //this=acc(锁标记)
            System.out.println("请稍后....");
            if (cardNo.equals(no) && password.equals(pwd)){
                System.out.println("验证成功，请稍后....");
                if(money < balance){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    balance -= money;
                    System.out.println("取款成功，当前余额为："+balance);
                }else {
                    System.out.println("卡内余额不足！");
                }
            }else {
                System.out.println("卡号或密码错误!");
            }
        }

    }
}

class Husband implements Runnable{
    private Account acc;

    public Account getAcc() {
        return acc;
    }

    public void setAcc(Account acc) {
        this.acc = acc;
    }

    public Husband(Account acc) {
        this.acc = acc;
    }

    @Override
    public void run() {
        //synchronized (acc){//acc对象加锁
            this.getAcc().withdrawal("1001","123456",1200D);
        //}
    }
}

class Wife implements Runnable{
    private Account acc;

    public Account getAcc() {
        return acc;
    }

    public void setAcc(Account acc) {
        this.acc = acc;
    }

    public Wife(Account acc) {
        this.acc = acc;
    }
    @Override
    public void run() {
        //synchronized (acc){
            this.getAcc().withdrawal("1001","123456",1200D);
       // }
    }
}