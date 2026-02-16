public class Circle
{
    private static int instanceCnt = 0;
    private double radius;
    public static final double PI = 3.14;
    private final String unit = "cm";


    public static int getInstanceCnt()
    {
        return Circle.instanceCnt;
    }

    private static void setInstanceCnt(int insCnt)
    {
        Circle.instanceCnt = insCnt;
    }

    public Circle()
    {
        this(1.0);
    }

    public Circle(double newRadius)
    {
        Circle.setInstanceCnt(Circle.getInstanceCnt() + 1);
        this.setRadius(newRadius);
    }

    public Circle(Circle guest)
    {
        this(guest.radius);
    }

    public double getRadius()
    {
        return this.radius;
    }

    private void setRadius(double radius)
    {
        if (radius >= 0)
            this.radius = radius;
        else
            this.radius = 0;
    }

    public void resize(double newRadius)
    {
        this.setRadius(newRadius);
    }

    public Circle clone()
    {
        return new Circle(this.getRadius());
    }

    public boolean equals(Circle guest)
    {
        return guest.getRadius() == this.getRadius();
    }

    public double area(){
        double area = this.radius * this.radius * PI;
        return area;
    }

    public void print()
    {
        System.out.print("The circle\'s radius is " +
                this.getRadius());
        System.out.print("\nThe area for the circle\'s are " + this.area() + this.unit);
    }
}
