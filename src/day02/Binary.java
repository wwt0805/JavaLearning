package day02;

/**
 * Package: day02
 * Author : Wu Wentong
 * Date   : 2021/3/2 下午12:29
 * Project: JavaLearning
 *
 * 计算机中不同进制的说明
 * 对于整数来说，有四种表现方式：
 * >二进制（binary）：0，1，满2进1，以0b或0B开头
 * >十进制（decimal）：0-9，满10进1
 * >八进制（octal）：0-7，满8进1，以数字0开头
 * >十六进制（hex）：0-9及A-F，以0x或0X开头表示，此处A-F不区分大小写。
 */
public class Binary
{
    public static void main(String[] args)
    {
        int num1 = 0b110;  // 二进制
        int num2 = 110;    // 十进制
        int num3 = 0127;   // 八进制
        int num4 = 0x110A; // 十六进制

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
    }
}
