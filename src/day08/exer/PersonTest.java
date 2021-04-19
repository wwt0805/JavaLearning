package day08.exer;

/**
 * Package: day08.exer
 * @author : Wu Wentong
 * @since : 2021/4/19 下午11:56
 * Project: JavaLearning
 */
class PersonTest
{
    public static void main(String[] args)
    {
        Person p1 = new Person();

        p1.name = "tom";
        p1.age = 18;
        p1.sex = 1;

        p1.study();
        p1.showAge();
        int newAge = p1.addAge(2);
        System.out.println("p1's new age is: " + newAge);
    }

}