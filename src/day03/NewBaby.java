package day03;

/**
 * Package: day03
 * Author : Wu Wentong
 * Date   : 2021/4/3 下午6:03
 * Project: JavaLearning
 */
public class NewBaby
{
    public static void main(String[] args)
    {
        Baby Niuniu = new Baby();
        System.out.println("Welcome to this new world! " + Niuniu.getFamilyname() + " niuniu who is a lovely baby " + Niuniu.getSex() + "!");
    }

}

class Mother
{
    public String sex()
    {
        return "girl";
    }

    public String familyname()
    {
        return "Li";
    }

}

class Father {
    public String sex()
    {
        return "boy";
    }

    public String familyname()
    {
        return "Wu";
    }

}

class Baby {
    class Bb1 extends Mother
    {
        @Override
        public String sex()
        {
            return super.sex();
        }
    }

    class Bb2 extends Father
    {
        @Override
        public String familyname()
        {
            return super.familyname();
        }
    }

    public String getFamilyname()
    {
        return new Father().familyname();
    }

    public String getSex()
    {
        return new Mother().sex();
    }
}