package day04;

/**
 * Package: day04
 * Author : Wu Wentong
 * Date   : 2021/4/6 下午7:33
 * Project: JavaLearning
 *
 * 岳小鹏参加java考试，他和父亲岳不群达成承诺：
 * 如果：
 * 成绩为100分时，奖励一辆BMW；
 * 成绩为（80，99】时，奖励一个iPad；
 * 其他时，什么奖励也没有
 * 请从键盘输入岳小鹏的期末成绩，并加以判断
 *
 * 说明：
 * 1、else结构是可选的
 * 2、针对于条件表达式：
 *    > 如果多个条件表达式之间是"互斥"关系，哪个判断和执行语句声明在上面还是下面，无所谓。
 *    > 如果多个条件表达式之间有交集的关系，需要根据实际情况，考虑清楚将哪个结构声明在上面。
 *    > 如果多个条件表达式之间有包含关系，通常情况下，需要将范围小的声明在范围大的上面。否则，范围小的就么有机会
 *
 *
 */
import java.util.Scanner;


public class IfTest
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入岳小鹏的成绩(0-100)：");
        int score = scan.nextInt();
        if (score == 100)
        {
            System.out.println("得到BMW");
        }
        else if (score > 85 && score <= 99)
        {
            System.out.println("得到iphone mx");
        }
        else if (score > 60 && score <= 85)
        {
            System.out.println("得到ipad");
        }
        else
        {
            System.out.println("什么奖励也没有");
        }

    }
}
