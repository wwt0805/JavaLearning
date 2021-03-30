package day03;

/**
 * Package: day03
 * Author : Wu Wentong
 * Date   : 2021/3/2 下午6:39
 * Project: JavaLearning
 *
 * 运算符之一：算术运算符
 * + - + - * / % （前)++  (后)++  (前)-- (后)--
 */
public class AriTest
{
    public static void main(String[] args)
    {
        // 除号：/
        int num1 = 12;
        int num2 = 5;
        int result1 = num1 / num2;
        System.out.println(result1);  // 2
        int result2 = num1 / num2 * num2;
        System.out.println(result2);  // 10

        double result3 = num1 / num2;
        System.out.println(result3); // 结果是2.0,结果先为2，提升为2.0

        double result4 = num1 / num2 + 0.0;
        System.out.println(result4);  //  2.0

        double result5 = num1 / (num2 + 0.0);
        System.out.println(result5);  // 2.4

        double result6 = (double)num1 / num2;
        System.out.println(result6);  // 2.4

        // %：取余运算
        // 结果的符号和被模数的符号一致
        // 开发中经常使用%来判断能否被除尽的情况。
        int m1 = 12;
        int n1 = 5;
        System.out.println("m1 % n1  = " + m1 % n1);  // 2

        int m2 = -12;
        int n2 = 5;
        System.out.println("m2 % n2  = " + m2 % n2);  // -2

        int m3 = 12;
        int n3 = -5;
        System.out.println("m3 % n3  = " + m3 % n3);  // 2

        int m4 = -12;
        int n4 = -5;
        System.out.println("m4 % n4  = " + m4 % n4);  // -2

        // 前++：先自增1，然后再运算
        // 后++：先运算，后自增1
        int a1 = 10;
        int b1 = ++a1;
        System.out.println("a1 = " + a1 + ", b1 = " + b1);

        int a2 = 10;
        int b2 = a2++;
        System.out.println("a2 = " + a2 + ", b2 = " + b2);

        // 注意点：
        short s1 = 10;
        // s1 = s1 + 1; // 编译失败
        s1 = (short)(s1 + 1);   // 真确
        s1++; // 正确，且自增1不会改变变量本身的数据类型
        System.out.println(s1);

        // 问题：
        byte bb1 = 127;
        bb1++;
        System.out.println("b1 = " + bb1);

        // 前--：先自减1， 后运算
        // 后--：先运算，后自减1

        int a4 = 10;
        int b4 = --a4;
        System.out.println("a4  =  " + a4 + ", b4 = " + b4);

    }
}

