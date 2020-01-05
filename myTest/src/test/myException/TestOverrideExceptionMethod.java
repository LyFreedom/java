package test.myException;

import java.io.IOException;

/**
 * 带有异常声明的方法覆盖：
 *      方法名、参数列表、返回值类型必须和父类相同
 *      子类的访问修饰符符合父类相同或是比父类更宽。
 *      子类中的方法，不能抛出比父类或接口更宽泛的异常。
 *      类的继承或接口的实现中，子类或实现类带有异常的方法可以不抛异常，
 *      实现类可以不抛异常也不用处理，如果是通过接口或父类引用指向实现类则需要处理
 *
 */
public class TestOverrideExceptionMethod {
    public static void main(String[] args) {
//        Super s = new Super();
//        s.method();
        Super s1 = new Sub();
        try {
            s1.method();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Printable printable = new MyClass();
        try {
            printable.print();
        } catch (IOException e) {
            e.printStackTrace();
        }
        MyClass myClass = new MyClass();
        myClass.print();
    }
}

class Super{
    public void method() throws Exception{
        System.out.println("Super - method");
    }
}

class Sub extends Super{
    public void method(){
        System.out.println("Sub - method");
    }
}

interface Printable{
    public void print() throws IOException;
}

class MyClass implements Printable{

    @Override
    public void print() {
        System.out.println("实现类可以不抛异常也不用处理，" +
                "如果是通过接口引用指向实现类则需要处理");
    }
}