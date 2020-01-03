package test.myException;

public class Student {
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age > 0 && age < 256){
            this.age = age;
        }else{
            RuntimeException e = new RuntimeException(); //此刻仅仅是个普通对象
            throw e;
            //throw new RuntimeException();
        }
    }
}
