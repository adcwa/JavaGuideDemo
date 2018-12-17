package atomic;

public class Student {
     String name;
    volatile  int age;
     String code;


    public Student() {
    }

    public Student(String name, int age, String code) {
        this.name = name;
        this.age = age;
        this.code = code;
    }


}
