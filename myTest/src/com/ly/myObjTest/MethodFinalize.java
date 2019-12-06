package com.ly.myObjTest;

/**
 * finalize()方法
 *          当对象被判定为垃圾对象时，由JVM自动调用此方法，用以标记垃圾对象，进入回收队列
 *          垃圾对象：没有有效引用指向此对象时，为垃圾对象。
 *          垃圾回收：由GC销毁垃圾对象，释放数据存储空间。
 *          自动回收机制：JVM的内存耗尽，一次性回收所有垃圾对象。
 *          手动回收机制：使用System.gc();通知JVM执行垃圾回收。
 */
public class MethodFinalize {
    public static void main(String[] args) {
        //引用计数算法,java用的是可达性分析算法
        MyClass mc = new MyClass();
        //mc.finalize();
        //System.out.println(mc);
        mc = null;
        System.gc();
    }
}
