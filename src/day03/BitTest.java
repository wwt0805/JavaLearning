package day03;

/**
 * Package: day03
 * Author : Wu Wentong
 * Date   : 2021/4/1 下午10:41
 * Project: JavaLearning
 *
 * 运算符之五：位运算符（了解）
 * 结论：
 * 1. 位运算符操作的都是整型数据
 * 2. <<：在一定范围内，每向左移一位相当于 * 2
 *    >>: 在一定范围内，每向右移一位相当于 \ 2
 *
 *
 * 面试题：最高效的计算2 * 8？ 2 << 3或者 8 << 1
 */
public class BitTest
{
    public static void main(String[] args)
    {
//        int i = 21;
        int i = -21;
        System.out.println("i << 2 = " + (i << 2));
        System.out.println("i << 3 = " + (i << 3));
        System.out.println("i << 27 = " + (i << 27));

        int m = 12;
        int n = 5;
        System.out.println("m & n :" + (m & n));  // 4
        System.out.println("m | n :" + (m | n));  // 13
        System.out.println("m ^ n :" + (m ^ n));  // 9

        // 练习：交换两个变量的值
        int num1 = 10;
        int num2 = 20;
        int num3 = 10;
        int num4 = 20;
        System.out.println("num1 = " + num1 + ", num2 = " + num2);

        // 方式一：定义临时变量
        // 推荐方式
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("num1 = " + num1 + ", num2 = " + num2);

        // 方式二：
        // 好处：不用定义临时变量
        // 弊端：1、相加操作可能会越界；2、有局限性，只适用于数值类型
        num3 = num3 + num4;
        num4 = num3 - num4;
        num3 = num3 - num4;
        System.out.println("num3 = " + num3 + ", num4 = " + num4);

        //方式三
        // 使用位运算符
        // 有局限性、只适用于数值型
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println("num1 = " + num1 + ", num2 = " + num2);
    }
}

