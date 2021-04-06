package day04;

/**
 * Package: day04
 * Author : Wu Wentong
 * Date   : 2021/4/6 下午7:58
 * Project: JavaLearning
 *
 * 编写程序，由键盘输入三个整数分别存入变量num1、num2、num3，对它们进行排序（使用if-else if-else),并且从小到大输出。
 *
 * 说明：
 * 1、 if-else结构是可以相互嵌套的。
 * 2、 如果if-else结构中的执行语句只有一行时，对应的一对{}可以省略的。但是，不建议大家省略。
 *
 */
import java.util.Scanner;


public class IfTest2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入第一个整数:");
        int num1 = scan.nextInt();

        System.out.println("请输入第二个整数:");
        int num2 = scan.nextInt();

        System.out.println("请输入第三个整数:");
        int num3 = scan.nextInt();

        int max_num, mid_num, min_num;

        if (num1 > num2 & num1 > num3)
        {
            max_num = num1;
            if (num2 > num3)
            {
                mid_num = num2;
                min_num = num3;
                System.out.print("数字从小到大依次为:" + min_num + ", " + mid_num + ", " + max_num);
            }
            else
            {
                mid_num = num3;
                min_num = num2;
                System.out.print("数字从小到大依次为:" + min_num + ", " + mid_num + ", " + max_num);
            }

        }

        else if (num2 > num1 & num2 > num3)
        {
            max_num = num2;
            if (num1 > num3)
            {
                mid_num = num1;
                min_num = num3;
                System.out.print("数字从小到大依次为:" + min_num + ", " + mid_num + ", " + max_num);
            }
            else
            {
                mid_num = num3;
                min_num = num1;
                System.out.print("数字从小到大依次为:" + min_num + ", " + mid_num + ", " + max_num);
            }
        }

        else
        {
            max_num = num3;
            if (num1 > num2)
            {
                mid_num = num1;
                min_num = num2;
                System.out.print("数字从小到大依次为:" + min_num + ", " + mid_num + ", " + max_num);
            }
            else
            {
                mid_num = num2;
                min_num = num1;
                System.out.print("数字从小到大依次为:" + min_num + ", " + mid_num + ", " + max_num);
            }
        }

    }
}
