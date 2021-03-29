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
        // 声明long型变量，必须以"l"或者"L"结尾
        // 通常定义整型变量时，用int型
        short s1 = 128;
        int i1 = 1234;
        long l1 = 12321312312L;
        System.out.println(s1);
        System.out.println(i1);
        System.out.println(l1);

        //2. 浮点型：float（4字节）、 double（8字节）
        // 浮点型，表示带小数点的数值
        // float表示数值比long还大

        double d1 = 123.3;
        System.out.println(d1 + 1);

        float f1 = 12.3F;
        System.out.println(f1);
        // 通常定义浮点型变量使用double

        //3. 字符串：char（1字符 = 2字节）
        // 定义char型变量。通常使用一堆''（单引号）,里面只能写一个字符
        char c1 = 'a';
        // 编译不通过
        //char c2 = 'ab'
        System.out.println(c1);

        char c2 = '1';
        char c3 = '中';
        char c4 = 's';
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        // 表示方式：1.声明一个字符 2. 转义字符 3. 使用Unicode值来表示字符串常量
        char c5 = '\n'; // 换行符
        c5 = '\t'; //制表符 <=> tab
        System.out.print("hello" + c5);
        System.out.println("world");

        char c6 = '\u0043';
        System.out.println(c6);

        // 4.布尔型：boolean
        // 只能取两个值之一：true、false
        // 常常在条件判断、循环结构中使用
        boolean bb1 = true;
         System.out.println(bb1);

        boolean isMarried = true;
        if(isMarried)
        {
            System.out.println("你就不能来参加单身party了！\n很遗憾");
        }
        else {
             System.out.println("你可以多弹弹女朋友！");
            }
    }
}
