package atomic;

import java.util.concurrent.atomic.AtomicIntegerArray;

public class AtomicIntegerArrayTest {

    public static void main(String[] args) {
//        Integer[] arr = new Integer[]{1,2,3};
        int[] arr = {1,2,3,4,5,6};
        AtomicIntegerArray  aia = new AtomicIntegerArray(arr);
        System.out.println("get3:"+aia.get(3));
        //同整型差不多， 方法多第一个下标参数
    }
}
