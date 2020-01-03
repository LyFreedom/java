package test.myException;

public class TestThrowException {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(300);
        //java.lang.RuntimeException
        System.out.println(student.getAge());
    }
}
