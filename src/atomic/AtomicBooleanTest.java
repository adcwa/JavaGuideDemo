package atomic;

import java.util.concurrent.atomic.AtomicBoolean;

public class AtomicBooleanTest {

    public static void main(String[] args) {
        AtomicBoolean ab = new AtomicBoolean(); //默认false
        System.out.println(ab.get());//获取当前值
        ab.set(true); //设置当前值
        System.out.println(ab.getAndSet(false));//获取当前值并设置新值

    }
}
