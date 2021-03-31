package day03;

/**
 * Package: day03
 * Author : Wu Wentong
 * Date   : 2021/3/31 下午8:25
 * Project: JavaLearning
 *
 * 运算符之三： 比较运算符
 * == != > < >= <=
 *结论：
 * 1.比较运算符的结果是boolean类型
 * 2.区分 == 和 =
 *
 *
 * */

public class CompareTest
{
    public static void main(String[] args)
    {
        int i = 10;
        int j = 20;
        System.out.println(i == j);  // false
        System.out.println(i = j);  // 20——将j=20赋值给i并且输出

        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b2 == b1);  // false
        System.out.println(b2 = b1);  // true

    }
}
