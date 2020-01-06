package test.myException;

/**
 * 需继承自Exception或Exception子类，常用RuntimeException.
 * 必要提供的构造方法：
 *      无参数构造方法
 *      String message参数的构造方法
 *
 *
 */
public class ExceptionBySelf {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        try {
            teacher.setAge(333);
        } catch (AgeException e) {
            e.printStackTrace();
        }
        try{
            teacher.setSex("hello");
        }catch (SexMatchException e){
            //处理方案是红丝字体
            System.err.println("性别输入错误!"+e.getMessage());
        }
    }
}
