package day08;

/**
 * Package: day08
 *
 * @author : Wu Wentong
 * @since : 2021/4/19 下午11:07
 * Project: JavaLearning
 *
 * 类中方法的声明和使用
 *
 * 方法：描述类应该具有的功能。
 * 比如：Math类、Scanner类、Array类
 *
 * 1、举例：
 * public void eat(){}  // 无返回
 * public void sleep(int hour){}
 * public String getName(){}  // 返回String类型
 * public String getNation(String nation){}
 *
 * 2、方法的声明：权限修饰符 返回值类型 方法名（形参列表）{
 *                  方法体
 *      }
 *
 * 3、说明：
 *  a、权限修饰符
 *      private、public、缺省、protected
 *  b、返回值类型：有返回值的 vs 没有返回值的
 *      如果方法有返回值，则必须在方法声明时，指定返回值的类型，同时，方法中需要勇士return关键字返回指定类型的变量或常量
 *      如果方法没有返回值，则方法声明时，使用void来表示。通常没有返回值的方法中不需要return。若使用只能return表示结束次方法
 *
 *      */
public class CustomerTest
{
    public static void main(String[] args)
    {
        Customer cust1 = new Customer();
        cust1.eat();

    }
}


// 客户类
class Customer
{
    // 属性
    String name;
    int age;
    boolean isMale;

    //方法
    public void eat()
    {
        System.out.println("eat");
        return;
        // return后方法已经结束无法在运行后续代码
        //System.out.println('111');
    }

    public void sleep(int hour)
    {
        System.out.println("rest for " + hour + " hours");
    }

    public String getName()
    {
        return name;
    }

    public String getNation(String nation)
    {
        String info = "My nation is: " + nation;
        return info;
    }
}