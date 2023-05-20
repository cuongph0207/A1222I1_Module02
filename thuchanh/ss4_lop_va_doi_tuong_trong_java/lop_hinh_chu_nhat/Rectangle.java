package module2.thuchanh.ss4_lop_va_doi_tuong_trong_java.lop_hinh_chu_nhat;

public class Rectangle {
    private double width;
    private double height;
    public Rectangle(){

    }
    public Rectangle(double width,double height){
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return (width+height)*2;
    }
    public String display(){
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}
