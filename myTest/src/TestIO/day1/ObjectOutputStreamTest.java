package TestIO.day1;


import java.io.*;

/**
 * 对象流：
 *      ObjectOutputStream/ObjectInputStream
 *      增强了缓冲区功能
 *      增强了读写8种基本数据类型和字符串功能
 *      增强了读写对象的功能：
 *          readObject() 从流中读取一个对象
 *          writeObject(Object obj) 向流中写入一个对象
 * 对象序列化:
 *      必须实现Serializable接口。
 *      必须保证其所有属性均可序列化。
 *      transient修饰为临时属性,不参与序列化。
 *      读取到文件尾部的标志:java.io.EOFException.
 * 使用流传输对象的过程称为序列化、反序列化.
 */
public class ObjectOutputStreamTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //写
        OutputStream os = new FileOutputStream("src\\TestIO\\day1\\objects.txt");
        ObjectOutputStream oos = new ObjectOutputStream(os);
        //oos.writeDouble(3.5); //将该数据写入文件(而非文本)
        oos.writeObject(new Students("张三",22,"男",120D));
        oos.flush(); //有缓冲区，所以要调用flush()
        //读
        InputStream is = new FileInputStream("src\\TestIO\\day1\\objects.txt");
        ObjectInputStream ois = new ObjectInputStream(is);
        //double result = ois.readDouble(); //读出来
        //System.out.println(result);

        //Object obj = ois.readObject();
        //System.out.println(obj.toString());
        while (true){
            try {
                Object obj = ois.readObject();
                System.out.println(obj.toString());
            }catch (EOFException e){ //读取到文件末尾的标志
                break;
            }

        }
    }
}

class Students implements Serializable{
    private String name;
    private transient Integer age; //transient  临时、瞬时属性,序列化该属性时不将该属性存进文件
    private String sex;
    private Double score;

    public Students(String name, Integer age, String sex, Double score) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", score=" + score +
                '}';
    }
}