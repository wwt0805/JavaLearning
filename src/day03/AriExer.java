package day03;

/**
 * Package: day03
 * Author : Wu Wentong
 * Date   : 2021/3/30 下午10:43
 * Project: JavaLearning
 *
 * 练习：随意给出一个三位数的整数，打印显示它的个位数、十位数、百位数值
 * 格式如下：
 * 数字xxx的情况如下：
 * 个位数；
 * 十位数；
 * 百位数；
 *
 * 例如：
 * 数字153的情况如下：
 * 个位数：3
 * 十位数：5
 * 百数位：1
 */

public class AriExer
{
    public static void main(String[] args)
    {
        int num = 187;
        System.out.println("百位为：" + num / 100);
        System.out.println("十位为：" + num % 100 / 10);
        System.out.println("个位为：" + num % 10);
    }
}
