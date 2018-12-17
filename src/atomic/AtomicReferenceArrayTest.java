package atomic;

import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.function.BinaryOperator;

public class AtomicReferenceArrayTest {

    public static void main(String[] args) {
        Student[] students = new Student[]{};
        AtomicReferenceArray<Student> studentAra  = new AtomicReferenceArray<Student>(3);
        AtomicReferenceArray<Student> studentAra2  = new AtomicReferenceArray<Student>(students);
        BinaryOperator<Student> bo = new BinaryOperator<Student>() {
            @Override
            public Student apply(Student student, Student student2) {
                return student;
            }
        };
        //对数组中的某个引用和现有的引用进行自定义binaryOperation，获取计算后的值
        studentAra.accumulateAndGet(1,new Student(),bo);

    }
}
