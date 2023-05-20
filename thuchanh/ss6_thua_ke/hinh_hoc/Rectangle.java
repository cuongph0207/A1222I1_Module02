package module2.thuchanh.ss6_thua_ke.hinh_hoc;

public class Rectangle extends Shape {
    public double width = 1.0 ,lenght = 1.0;

    public Rectangle() {
    }

    public Rectangle(String color, boolean filled, double width, double lenght) {
        super(color, filled);
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
    public double getArea(){
        return getWidth()*getLenght();
    }
    public double getPerimeter(){
        return (getLenght()+getWidth())*2;
    }

    @Override
    public String toString() {
        return "A Rectangle with width="+getWidth()+" and length="+getLenght()+", which is a subclass of "+super.toString();
    }
}
