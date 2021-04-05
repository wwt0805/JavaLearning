package day03;

/**
 * Package: day03
 * Author : Wu Wentong
 * Date   : 2021/4/2 下午3:01
 * Project: JavaLearning
 * <p>
 * 运算符之六：三元运算符
 * 1、结构：（条件表达式）？ 表达式1：表达式2
 * 2、说明：
 * 条件表达式的结果是一个bool类型变量
 * 根据条件表达式的真或者假决定执行表达式1还是2；
 * 如果是true执行表达式1，若是false则执行表达式2
 * 表达式1和表达式2要求是一致的，即有一个统一类型
 *
 * 3、凡是能用三元运算符的都可以用if-else，反之不成立；
 * 4、如果一个问题即可用三元也可以用if-else, 应该用三元，因为简洁、效率高，运算符运算效率大于流程控制语句
 */
public class SanYuan {
    public static void main(String[] args)
    {
        // 获取两个整数的较大值
        int m = 12;
        int n = 5;

        int max = (m > n) ? m : n;
        System.out.println(max);

        n = 12;
        String maxStr = (m > n) ? "m 大" : ((m == n) ? "m和n相等" : "n大");
        System.out.println(maxStr);

        // 获取三个数中的最大值
        int n1 = 12;
        int n2 = 30;
        int n3 = -43;

        int max1 = (n1 > n2) ? n1 : n2;
        int max2 = (max1 > n3) ? max1 : n3;
        System.out.println("三个数中的最大值为：" + max2);


        int max3 = (((n1 > n2) ? n1 : n2) > n3) ? ((n1 > n2) ? n1 : n2) : n3;  // 可读性，太差不推荐
        System.out.println("三个数中的最大值为：" + max3);

        // 改写成if—else
        if(m > n)
        {
            System.out.println(m);
        }
        else
        {
            System.out.println(n);
        }

    }
}
