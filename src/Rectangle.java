public class Rectangle {
    private double width, length;
    //constructor
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public double getWidth()
    {
        return width;
    }
    public void setWidth(double width)
    {
        this.width=width;
    }
    public double getLength()
    {
        return length;
    }
    public void setLength(double length)
    {
        this.length=length;
    }
    public double calcul_Arie()
    {
        return width*length;
    }
    public double calcul_Perimetru()
    {
        return 2*(width+length);
    }

}
