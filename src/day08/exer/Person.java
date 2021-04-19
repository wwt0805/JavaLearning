package day08.exer;

/**
 * Package: day08.exer
 *
 * @author : Wu Wentong
 * @since : 2021/4/19 下午11:51
 * Project: JavaLearning
 */
public class Person
{
    String name;
    int age;
    int sex;

    public void study()
    {
        System.out.println("studying");
    }

    public void showAge()
    {
        System.out.println("age:" + age);
    }

    public int addAge(int i)
    {
        age += i;
        return age;
    }
}
