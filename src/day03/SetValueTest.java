package day03;

/**
 * Package: day03
 * Author : Wu Wentong
 * Date   : 2021/3/30 下午11:06
 * Project: JavaLearning
 *
 * 运算符之二： 赋值运算符
 */
public class SetValueTest
{
    public static void main(String[] args)
    {
        // 赋值符号：=
        int i1 = 10;
        int j1 = 10;

        int i2, j2;
        // 连续赋值
        i2 = j2 = 10;
        int i3 = 10, j3 = 20;

        // ****************
        int num1 = 10;
        num1 += 2; // num1 = num1 + 2
        System.out.println(num1); // 12

        int num2 = 12;
        num2 %= 5; // num 2 = num2 % 5;
        System.out.println(num2);
    }

}
