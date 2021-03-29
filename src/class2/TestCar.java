package class2;


class Car
{
    private String carName;
    private boolean sale;

    public Car(String c1, boolean isSale)
    {
        carName = c1;
        sale = isSale;
    }

    public void setCarName(String c1)
    {
        carName = c1;
    }

    public void setSale(boolean isSale)
    {
        sale = isSale;
    }

    public String getCarName()
    {
        return carName;
    }

    public Boolean getSale()
    {
        return sale;
    }

    public String toString()  // 覆盖toString
    {
        if(sale)
            return(carName + "已卖出");
        else
            return(carName + "未卖出");
    }

    public boolean equals(Object obj)  // 覆盖equal方法
    {
        if (! (obj instanceof Car))
            return false;
        Car c = (Car) obj;
        return (carName.equals(c.getCarName)) && (sale == c.getSale()));

    }

}

public class TestCar
{
    public static void main(String[] args)
    {
        Car x = new Car("红旗AJ", false);
        Car y = new Car("QQ-WQ", true);
        System.out.println(x + "等同于" + y + "是：" + x.equals(y));
        System.out.println("x与y是同样的对吗？" + (x == y ));
        Car z = y;
        System.out.println(y + "等同于" + z + "是：" + y.equals(z));
        System.out.println("y与z是同样的对吗？" + (y == z));

    }
}
