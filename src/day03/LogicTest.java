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
        // 相同点1：&与&&的运算结果相同
        // 相同点2：当前符号左边是true，二者都会执行符号右边的运算
        // 不同点：当符号左边是false时，&继续执行符号右边的运算。&&不再执行符号右边的运算
        // 开发中推荐使用短路操作。
        boolean b1 = false;
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

        boolean b2 = false;
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

        // 区分：｜与｜｜
        boolean b3 = false;
        int num3 = 10;
        if (b2 | (num3++ > 0))
        {
            System.out.println("I' m in Beijing");
        }
        else
        {
            System.out.println("I' m in Nanjing");
        }
        System.out.println("num3 = " + num3);

        boolean b4 = false;
        int num4 = 10;
        if (b4 || (num4++ > 0))
        {
            System.out.println("I' m in Beijing");
        }
        else
        {
            System.out.println("I' m in Nanjing");
        }
        System.out.println("num4 = " + num4);

    }
}
