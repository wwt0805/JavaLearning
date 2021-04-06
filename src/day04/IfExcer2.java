package day04;

/**
 * Package: day04
 * Author : Wu Wentong
 * Date   : 2021/4/6 下午9:05
 * Project: JavaLearning
 *
 * 我家的狗5岁了，狗的前两年每一年相当于人类的10.5岁，之后每增加一年就增加四岁。那么5岁的狗相当于
 * 10。5 + 10。5 + 4 + 4 + 4 = 33岁。
 *
 * 编写一个程序，获取用户输入的狗的年龄，通过程序显示其相当于人类的年龄。如果用户输入负数，请显示一个提示信息。
 *
 */
import java.util.Scanner;


public class IfExcer2
{
    public static void main(String[] args)
    {
        int age_dog;
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入狗狗的年龄:");
        age_dog = scan.nextInt();

        if (age_dog >= 0)
        {
            if (age_dog <= 2)
            {
                System.out.println(age_dog + "岁的狗狗相当于人类" + age_dog * 10.5 + "岁");
            }
            else
            {

                System.out.println(age_dog + "岁的狗狗相当于人类" + (2 * 10.5 + (age_dog - 2) * 4) + "岁");
            }
        }

        else
        {
            System.out.println("输入有误！");
        }
    }
}
