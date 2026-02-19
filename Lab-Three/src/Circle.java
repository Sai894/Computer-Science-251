public class Circle
{
    private double radius = 0;


    public double getRadius()
    {
        return this.radius;
    }

    public void setRadius(double radius)
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

    public Circle(){
        this(1.0);
    }

    public Circle(double radius){
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
    }
}
