package atomic;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class AtomicIntegerFieldUpdaterTest {
    public static void main(String[] args) {
        Student st = new Student("wangfeng",18,"adcwa");
        AtomicIntegerFieldUpdater<Student> aifu = AtomicIntegerFieldUpdater.newUpdater(Student.class,"age");
        //对属性要求：
        //1、不能private
        //2、必须volatile
        System.out.println(aifu.addAndGet(st,1)); //长大一岁
    }
}
