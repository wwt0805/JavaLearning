package day03;

/**
 * Package: day03
 * Author : Wu Wentong
 * Date   : 2021/4/1 下午10:10
 * Project: JavaLearning
 */
public class Test2_4_4
{
    public static void main(String[] args)
    {
        boolean x = true;
        boolean y = false;
        short z = 42;
        // if (y==true)
        if ((z++ == 42) && (y = true))  // z++ == 42 -> true, z = 43
            z++;                        // z++ -> z = 44
        if ((x = false) || (++z == 45)) // false || true -> true -> z = 45
            z++;                        // z++ -> z = 46

        System.out.println("z=" + z);

    }
}
