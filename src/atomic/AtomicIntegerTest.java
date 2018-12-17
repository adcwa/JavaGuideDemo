package atomic;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntBinaryOperator;

public class AtomicIntegerTest {

    public static void main(String[] args) {
        AtomicInteger atomicInteger  =new AtomicInteger(0);
        System.out.println(atomicInteger.get());
        System.out.println(atomicInteger.get()+":getAndSet:"+atomicInteger.getAndSet(1));
        System.out.println(atomicInteger.get()+":getAndAdd:"+atomicInteger.getAndAdd(2));
        System.out.println(atomicInteger.get()+":getAndDecrement:"+atomicInteger.getAndDecrement());
        System.out.println(atomicInteger.get()+":compareAndSet:"+atomicInteger.compareAndSet(2,10));//如果为 2 ，则设值为10
        //加法
        IntBinaryOperator ibo  = new IntBinaryOperator() {
            @Override
            public int applyAsInt(int left, int right) {
                System.out.println("left "+left+" right:" +right);
                return left+right;
            }
        };
        //先加后获取
        System.out.println(atomicInteger.get()+":accumulateAndGet:"+atomicInteger.accumulateAndGet(2,ibo));
        //先获取再加
        System.out.println(atomicInteger.get()+":getAndAccumulate:"+atomicInteger.getAndAccumulate(2,ibo));
        atomicInteger.lazySet(100);
        System.out.println("after lazy set :"+atomicInteger.get());
    }
    //一般类多现场安全示例
    public volatile  Integer  count1  = 0;
    //添加synchronized ，
    public synchronized   Integer increment1(){
        return ++count1;
    }



    //原子类多线程安全示例
    public AtomicInteger  count = new AtomicInteger(0);
    //因为是原子操作，所以不需要加锁
    public  Integer increment(){
        return count.incrementAndGet();
    }
}
