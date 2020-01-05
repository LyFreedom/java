package test.myException;

/**
 * 异常的传递：按照方法的调用链反向传递，如始终没有处理异常，最终会由JVM进行默认异常处理（打印堆栈跟踪信息）。
 * 受查异常：throws 声明异常，修饰在方法参数列表后端
 * 运行时异常：因可处理可不处理，无需声明异常。
 * 异常的处理：try{}catch(Exception){}
 * try{
 *     可能出现的异常代码
 * }catch(Exception e){
 *     异常处理的相关代码，如：getMessage(),printStackTrace()
 * }Finally{
 *     无论是否出现异常，都需执行的代码结构，常用于释放资源
 * }
 * 常见异常处理结构：
 * try{}catch{}
 * try{}catch{}catch{}
 * try{}catch{}finally{}
 * try{}finally{}
 */
public class TransferException {
    public static void main(String[] args) { //采用默认的处理方式
        try {
            Class aClass= Class.forName("test.myException.Student");//可能查找不到该类
        } catch (ClassNotFoundException e) {
            e.printStackTrace(); //打印堆栈信息
        }
    }
}
