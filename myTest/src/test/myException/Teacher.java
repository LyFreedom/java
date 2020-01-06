package test.myException;

public class Teacher {
    private int age;
    private String sex;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeException {
        if(age >0 && age < 253){
            this.age = age;
        }else{
            //抛异常
            throw new AgeException("年龄的正确区间为：0~253"); //AgeException
        }
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if(sex.equals("男")||sex.equals("女")){
            this.sex = sex;
        }else {
            //抛异常
            throw new SexMatchException("性别只能为男或女");
        }
    }
}
