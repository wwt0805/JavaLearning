package day04;

/**
 * Package: day04
 * Author : Wu Wentong
 * Date   : 2021/4/6 下午9:25
 * Project: JavaLearning
 */
public class RandomTeset
{
    public static void main(String[] args)
    {
        double value = Math.random() * 90 + 10; // [0.0, 1.0) --> [0.0, 90.0) --> [10.0, 100.0)
        System.out.println(value);

    }
}
