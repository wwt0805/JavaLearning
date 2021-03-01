package day02;

/**
 * Package: day02
 * Author : Wu Wentong
 * Date   : 2021/3/1 下午3:46
 * Project: JavaLearning
 *
 * 基本数据类型之间的运算规则：
 * 前提：这里讨论的只是7种基本数据类型数据见的运算，不包含boolean型
 * 1. 自动类型提升：
 *    当容量小的数据类型的变量与容量大的数据类型变量做运算时，结果自动提升为容量大的数据类型
 *      byte、char、short --> int --> long --> float --> double
 *
 *      特别的，当byte、char、short三者之间做运行时（也包括同种类型），结果为int
 *
 * 2. 强制类型转换：
 *    见VariableTest3
 *
 * 说明：此时的容量大小指的是，表示数的范围的大和小。比如：float容量要大于long的容量
 */

public class VariableTest2
{
    public static void main(String[] args)
    {
        byte b1 = 2;
        int i1 = 12;
        // 编译不通过
        // byte b2 = b1 + i1;
        int i2 = b1 + i1;
        long l1 = b1 + i1;
        System.out.println(i2);
        System.out.println(l1);

        float f = b1 + i1;
        System.out.println(f);

        short s1 = 123;
        double d1 = s1;
        System.out.println(d1);

        //**********************
        char c1 = 'a';// 97
        int i3 = 10;
        int i4 = c1 + i3;
        System.out.println(i4);

        short s2 = 10;
        //char c2 = c1 + s2; // 编译不通过
        //***********************
    }
}
