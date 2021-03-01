package day02;

/**
 * Package: day02
 * Author : Wu Wentong
 * Date   : 2021/3/1 下午4:36
 * Project: JavaLearning
 *
 * String类型变量的使用
 * 1. String属于引用数据类型,翻译为：字符串。
 * 2. 声明String类型变量时，使用一对""
 * 3. String可以和8种基本数据类型变量做运算，且运算也只能时连接运算：+："表示连接"，若+前后有一个是String，就一定是连接符
 * 4. 运算结果仍然是String类型
 */
public class StringTest
{
    public static void main(String[] args)
    {
        String s1 = "Hello World";
        System.out.println(s1);

        String s2 = "a";
        String s3 = "";

        //char c = '';//编译不通过
        int number = 1001;
        String numberStr = "学号: ";
        String info = numberStr + number;// +: 连接运算
        boolean b1 = true;
        String info1 = info + b1;// +: 连接运算
        System.out.println(info1);

        //*********************
        // 练习1
        char c = 'a'; // 'a':97, 'A':65
        int num = 10;
        String str = "hello";
        System.out.println(c + num + str);   // 107hello
        System.out.println(c + str + num);   // ahello10
        System.out.println(c + (num + str)); // a10hello
        System.out.println((c + num) + str); // 107hello
        System.out.println(str + num + c);   // hello10a

        //练习2
        //希望输出"*    （四个空格）*"
        System.out.println("*   *");           // *   *
        System.out.println('*' + '\t' + '*');  // 一个数 char对应的ascii码
        System.out.println('*' + "\t" + '*');  // *   *
        System.out.println('*' + '\t' + "*");  // 一个数*
        System.out.println('*' + ('\t' + "*"));// *   *
    }
}
