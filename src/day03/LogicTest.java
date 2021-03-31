package day03;

/**
 * Package: day03
 * Author : Wu Wentong
 * Date   : 2021/3/31 下午8:58
 * Project: JavaLearning
 *
 * 运算符之四：逻辑运算符
 *
 * & && ｜ ｜｜ ！ ^
 *
 *
 */
public class LogicTest
{
    public static void main(String[] args)
    {
        // 区分 &和&&
        boolean b1 = true;
        int num1 = 10;
        if (b1 & (num1++ > 0))
        {
            System.out.println("I' m in Beijing");
        }
        else
        {
            System.out.println("I' m in Nanjing");
        }
        System.out.println("num1 = " + num1);

        boolean b2 = true;
        int num2 = 10;
        if (b2 && (num2++ > 0))
        {
            System.out.println("I' m in Beijing");
        }
        else
        {
            System.out.println("I' m in Nanjing");
        }
        System.out.println("num2 = " + num2);

    }
}
