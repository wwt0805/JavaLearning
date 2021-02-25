package day02;

/**
 * Package: day02
 * Author : Wu Wentong
 * Date   : 2021/2/24 下午11:27
 * Project: JavaLearning
 *
 * 标识符的使用
 * 1. 标识符：凡是自己可以起名字的地方都叫标识符
 *    比如：类名、变量名、方法名、接口名和包名……
 *
 * 2. 标识符的命名规则：--> 如果不遵循如下规则，编译不通过！
 * >  由26个英文字母大小写，0-9， _或$组成
 * >  数字不可以开头
 * >  不可以使用关键字和保留字，但能包含关键字和保留字。
 * >  Java中严格区分大小写，长度无限制。
 * >  标识符不能包含空格。
 *
 * 3. Java中的民称命名规范：--> 如果不遵循如下规则，编译可以通过！但建议大家遵守
 * 包名：多单词组成是所有字母都小写：xxyyzz
 * 类名、接口名：多单词组成时，所有单词首字母大写：XxxYyyZzz
 * 变量名、方法名：多单词组成时，第一个单词首字母小写，第二个单词开始每个单词首字母大写：xxxYyyZzz
 * 常量名：所有字母都大写。多单词时每个单词用下划线连接：XXX_YYY_ZZZ
 *
 * 4. 在起名字时，为了提高阅读性，要尽量有意义，"见名知意"。
 */
public class IdentifierTest
{
    public static void main(String[] args)
    {
        int myNumber = 1001;  // 变量名首字母小写，第二个单词开始首字母大写
        System.out.println(myNumber);

        int 学号 = 1003;  // 使用汉字作为变量名也可以正常运行，因为java使用unicode编码，但请禁止这类做法
        System.out.println(学号);
    }
}
