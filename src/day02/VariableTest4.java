package day02;

/**
 * Package: day02
 * Author : Wu Wentong
 * Date   : 2021/3/1 下午4:21
 * Project: JavaLearning
 */
public class VariableTest4
{
    public static void main(String[] args)
    {
        //1.编码情况1：
        long l = 123213;//没有加L结尾，就被认为是int型，且123213在int型范围内，因而可以正常执行
        System.out.println(l);
        //编译失败：过大的整数
        //long l1 = 9123123123123;
        long l1 = 9123123123123L;
        System.out.println(l1);

        //************************
        // 编译失败
        //float f1 = 12.3;

        //2.编码情况2：
        // 整型常量，默认类型为int型；浮点型常量，默认为double型；
        byte b = 12;
        //byte b1 = b + 1;//编译失败
        //float f1 = b + 12.3;//编译失败
    }
}
