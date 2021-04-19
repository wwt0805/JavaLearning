package day08;

/**
 * Package: day08
 *
 * @author : Wu Wentong
 * @since : 2021/4/19 下午10:46
 * Project: JavaLearning
 *
 * 类中属性的使用
 *
 * 属性（成员变量） vs 局部变量
 * 1、相同点
 *  a、定义变量的格式：数据类型 变量名 = 变量值
 *  b、先声明后使用
 *  c、变量都有对应的作用域
 *
 *
 * 2、不同点
 *  a、在类中声明的位置不同
 *      属性：直接定义在类的一对{}内
 *      局部变量：声明在方法内、方法形参、代码块内、构造器形参、构造器内部的变量
 *  b、关于权限修饰符的不同
 *      属性：可以在声明属性时，指明其权限：private、public、缺省、protected --> 封装性
 *      局部变量：不可以使用修饰符
 *  c、默认初始化值
 *      属性：类的属性，根据类型都有默认初始化值。
 *          整型（byte、short、int、long）：0
 *          浮点型（float、double）：0.0
 *          布尔型（boolean）：false
 *          引用数据类型（类、数组、接口）：null
 *      局部变量：没有默认初始化要显示赋值，形参在调用时赋值即可
 *  d、在内存中加载的位置
 *      属性：堆空间（非static）
 *      局部变量：栈空间
 *
 *
 */
public class UserTest
{
    public static void main(String[] args)
    {
        User u1 = new User();
        System.out.println(u1.name);
        System.out.println(u1.age);
        System.out.println(u1.isMale);
        u1.talk("Japanese");

    }
}



class User
{
    // 属性
    String name;
    int age;
    boolean isMale;

    public void talk(String language) // language:形参
    {
        System.out.println("we use " + language + " communicate");
    }

    public void eat()
    {
        String food = "Pizza"; // 局部变量
        System.out.println("People like " + food);
    }

}