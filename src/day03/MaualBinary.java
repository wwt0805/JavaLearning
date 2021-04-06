package day03;

/**
 * Package: day03
 * Author : Wu Wentong
 * Date   : 2021/4/6 上午8:56
 * Project: JavaLearning
 * 如何求一个0～255范围内的整数的十六进制，例如60的十六进制表示为3C
 */
public class MaualBinary
{
    public static void main(String[] args)
    {
        // 方式一： 自动实现
        String str1 = Integer.toBinaryString(60);
        String str2 = Integer.toHexString(60);
        System.out.println(str1);
        System.out.println(str2);

        // 方式二： 手动实现
        int i1 = 60;
        int i2 = i1 & 15;
        String j = (i2 > 9) ? (char) (i2 - 10 + 'A') + "":i2 + "";
        int temp = i1 >>> 4; // 无符号右移四位，按照上述过程执行。
        i2 = temp & 15;
        String k = (i2 > 9) ? (char) (i2 - 10 + 'A') + "":i2 + "";
        System.out.println(k+""+j);
    }
}
