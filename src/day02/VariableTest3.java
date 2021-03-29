package day02;

/**
 * Package: day02
 * Author : Wu Wentong
 * Date   : 2021/3/1 下午4:10
 * Project: JavaLearning
 *
 * 强制类型转换：自动类型提升的逆运算
 * 1.需要使用强转符：()
 * 2.注意点：强制类型转化，可能导致精度损失（比如由double转int，int会向下取整）
 */
public class VariableTest3
{
    public static void main(String[] args)
    {
        double d1 = 12.9;
        int i1 = (int)d1;//截断操作
        System.out.println(i1);

        // 没有精度损失
        long l1 = 123;
        short s2 = (short)l1;

        // 精度损失
        int i2 = 128;
        byte b = (byte)i2;
        System.out.println(b);// -128
    }
}
