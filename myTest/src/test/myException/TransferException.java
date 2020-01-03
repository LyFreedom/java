package test.myException;

/**
 * 异常的传递：按照方法的调用链反向传递，如始终没有处理异常，最终会由JVM进行默认异常处理（打印堆栈跟踪信息）。
 * 受查异常：throws 声明异常，修饰在方法参数列表后端
 * 运行时异常：因可处理可不处理，无需声明异常。
 */
public class TransferException {
    public static void main(String[] args) { //采用默认的处理方式
        try {
            Class.forName("test.myException.Student");//可能查找不到该类
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
