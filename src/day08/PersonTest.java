package day08;

/**
 * Package: day08
 * @author : Wu Wentong
 * @since    : 2021/4/19 下午10:05
 * Project: JavaLearning
 *
 * 一、设计类，其实就是设计类的成员
 *  属性 = 成员变量 = field = 域、字段
 *  方法 = 成员方法 = 函数 = method
 *  创建类的对象 = 类的实例话 = 实例化类
 *
 * 二、类和对象的使用
 *  1、创建类，设计类的成员
 *  2、创建类的对象
 *  3、通过"对象.属性"或"对象.方法"调用对象的结构
 *
 * 三、如果创建了一个类的多个对象，则每个对象都有独立的一套属性（非static）
 *      意味着入股欧我们修个一对对象的属性a，不会影响另一个对象属性a的值
 *
 * 四、对象的内存解析
 */
public class PersonTest
{
    public static void main(String[] args)
    {
        // 2、创建Person类的对象
        Person p1 = new Person();

        // 调用对象的结构：属性和方法
        // 调用属性："对象.属性"
        p1.name = "Tom";
        p1.isMale = true;
        System.out.println(p1.name);

        // 调用方法："对象.方法"
        p1.eat();
        p1.sleep();
        p1.talk("Chinese");

        //******************************
        Person p2 = new Person();
        System.out.println(p2.name);
        System.out.println(p2.isMale);

        //****************************
        // 将p1变量保存的地址付给了p3，导致p1和p3指向了堆空间中的同一个对象实体
        Person p3 = p1;
        System.out.println(p3.name);// Tom

        p3.age = 10;
        System.out.println(p1.age); // 10

    }
}

// 1、创建类，设计类的成员
class Person
{
    // 属性：对应类中的成员变量
    String name;
    int age = 1;
    boolean isMale;

    // 方法：对应类中的成员方法
    public  void eat()
    {
        System.out.println("eat");
    }

    public void sleep()
    {
        System.out.println("sleep");
    }

    public void talk(String language)
    {
        System.out.println("speak with " + language);
    }
}