public class Circle
{
    private double radius;
    private static int totalInstance = 0;

    public int  getTotalInstance()
    {
        return this.totalInstance;
    }

    private void  setTotalInstance(int totalInstance)
    {
            this.totalInstance = totalInstance;
    }
    public double getRadius()
    {
        return this.radius;
    }

    private void setRadius(double radius)
    {
        if (radius >= 0) {
            this.radius = radius;
        } else
            this.radius = 0;
    }

    public void resize(double newRadius)
    {
        this.setRadius(newRadius);
    }

    public Circle(){
        this(1.0);
    }

    public Circle(double radius){
        this.totalInstance++;
        setRadius(radius);
    }

    public Circle(Circle circle){
        this(circle.radius);
    }

    public Circle clone()
    {
        Circle c = new Circle(this);

        return c;
    }

    public boolean equals(Circle guest)
    {
        return guest.getRadius() == this.getRadius();
    }

    public void print()
    {
        System.out.print("The circle\'s radius is " +
                this.getRadius());
        System.out.println(" and the total instance is " + this.getTotalInstance());
    }
}
