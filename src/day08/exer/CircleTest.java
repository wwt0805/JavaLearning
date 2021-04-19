package day08.exer;

/**
 * Package: day08.exer
 *
 * @author : Wu Wentong
 * @since : 2021/4/20 上午12:10
 * Project: JavaLearning
 *
 * 利用面向对象的编程方法，设计类Circle计算元的面积
 */
public class CircleTest
{
    public static void main(String[] args)
    {
        Circle c1 = new Circle();
        c1.radius = 2.1;
        double area = c1.findArea();
        System.out.println(area);
    }

}


// 圆
class Circle
{
    // 属性
    double radius;

    // 求圆的面积
    public double findArea()
    {
        double area = Math.PI * radius * radius;
        return area;
    }
}