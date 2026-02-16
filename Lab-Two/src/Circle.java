public class Circle {

    private double  radius = 1;

    public double getRadius() {
        return this.radius;
    }
    private void setRadius(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        }
        else {
            this.radius = 0;
        }
    }
    public void resize(double newRadius) {
        setRadius(newRadius);
    }
    public Circle clone() {
        Circle c = new Circle();
        c.resize(this.getRadius());
        return c;
    }


    public boolean equals(Circle guest) {
        if (this.getRadius() == guest.getRadius()) {
            return true;
        }
        else {
            return false;
        }
    }

    public void print(){
        System.out.print(this.getRadius());
    }

}

