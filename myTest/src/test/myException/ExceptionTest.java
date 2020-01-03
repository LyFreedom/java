package test.myException;

import java.util.Scanner;

/**
 * 什么是异常？
 *      概念：程序在运行过程中出现的特殊情况。
 *      异常处理的必要性：任何程序都可能存在大量的未知问题、错误；如果不对这些问题进行正确处理，则
 *      可能导致程序的中断，造成不必要的损失。
 * 异常的分类：
 *      Throwable:可抛出的，一切错误或异常的父类，位于java.lang包中
 *      Throwable子类：
 *          Error：JVM、硬件、执行逻辑错误，不能手动处理
 *          Exception：程序在运行和配置中产生的问题，可处理
 *              RuntimeException:运行时异常，可处理，可不处理
 *              CheckedException:检查异常，必须处理
 * 异常的产生：
 *      自动抛出异常：当程序在运行时遇到不符合规范的代码或结果时，会产生异常。
 *      手动抛出异常：语法：throw new 异常类型（“实际参数”）
 *      产生异常结果：相当于遇到return语句，导致程序因异常而终止。
 */
public class ExceptionTest {
    public static void main(String[] args) {
        m6();
        //Class.forName("xxx.xxx");
    }
    //java.lang.NullPointerException 空指针异常
    public  static void m1(){
        Object o = null;
        o.hashCode();
    }
    //java.lang.ArrayIndexOutOfBoundsException 数组下表越界异常
    public static void m2(){
        int[] nums = new int[4];
        System.out.println(nums[5]);
    }
    //java.lang.StringIndexOutOfBoundsException
    public static void m3(){
        String str = "abc";
        System.out.println(str.charAt(5));
    }
    //java.lang.ArithmeticException算术异常
    public static void m4(){
        System.out.println(3/0);
    }
    //java.lang.ClassCastException向下转型异常
    public static void m5(){
        Object o = new Integer(123);
        Scanner input = (Scanner) o;
    }
    //java.lang.NumberFormatException 数字格式化异常
    public static void m6(){
        new Integer("10a");
    }
}
