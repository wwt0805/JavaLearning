package day02;

/**
 * Package: day02
 * Author : Wu Wentong
 * Date   : 2021/2/27 下午8:58
 * Project: JavaLearning
 *
 * 一、变量按照数据类型来来分：
 * 基本数据类型：
 * 整型：byte、short、int、long
 * 浮点型：float、double
 * 字符串：char
 * 布尔型：boolean
 *
 * 引用数据类型：
 *  类（class）
 *  接口（interface）
 *  数据（array）
 *
 *  二、变量在类中声明的位置
 *      成员变量 vs 局部变量
 */
public class VariableTest1
{
    public static void main(String[] args)
    {
        System.out.println("Hello World");
        //1. 整型byte（1字节=8bit）、short（2字节）、int（4字节）、long（8字节）
        // byte范围： -128 ～ 127
        byte b1 = 12;
        byte b2 = -123;
        //byte b3 = 128; // 超出byte的最大值范围，编译不会通过
        System.out.println(b1);
        System.out.println(b2);
    }
}
