package atomic;

import java.util.concurrent.atomic.*;

/**
 * 原子类用于不可拆分的操作， 多线程安全
 */
public class AtomicInfo<T> {
    /**
     * 基本原子类型boolean
     */
    AtomicBoolean atomicBoolean ;
    /**
     * 基本原子类型 整型
     */
    AtomicInteger atomicInteger;
    /**
     * 基本原子类型长整型
     */
    AtomicLong atomicLong;
    /**
     * 整型数组原子类
     */
    AtomicIntegerArray  atomicIntegerArray;
    /**
     * 长整形数组原子类
     */
    AtomicLongArray atomicLongArray;
    /**
     * 引用类型数组原子类（对象数据）
     */
    AtomicReferenceArray<T> atomicReferenceArray;
    /**
     * 引用类型属性更新器
     * 1、整型
     * 2、长整型
     * 3、带版本号的引用类型，
     */
    AtomicIntegerFieldUpdater<T> atomicIntegerFieldUpdater;
    AtomicLongFieldUpdater<T> atomicLongFieldUpdater;
    AtomicStampedReference<T> atomicStampedReference;
}
